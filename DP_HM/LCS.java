package DP_HM;

import java.util.Scanner;

public class LCS {
		public static void main(String[] args) {
			Scanner s=new Scanner(System.in);
			String A=s.next();
			String B=s.next();
			String result=lcs(A,B);
			System.out.println(result);
		}
		public static String lcs(String A,String B)
		{
			int n=A.length();
			int m=B.length();
			int dp[][]=new int[n+1][m+1];
			for(int i=1;i<=n;i++)
			{
				for(int j=1;j<=m;j++)
				{
					if(A.charAt(i-1)==B.charAt(j-1))
					{
						dp[i][j]=dp[i-1][j-1]+1;
					}
					else
					{
						dp[i][j]=Math.max(dp[i-1][j], dp[i][j-1]);
					}
				}
			}
			int length=dp[n][m];
			char lcs[]=new char[length];
			int i=n,j=m,index=length-1;
			while(i>0&&j>0)
			{
				if(A.charAt(i-1)==B.charAt(j-1))
				{
					lcs[index]=A.charAt(i-1);
					i--;
					j--;
					index--;
				}
				else if(dp[i-1][j]>dp[i][j-1])
				{
					i--;
				}
				else
				{
					j--;
				}
			}
			return new String(lcs);
		}
}