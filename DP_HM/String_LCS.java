package DP_HM;

import java.util.Scanner;

public class String_LCS {
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String s1=s.next();
		String s2=s.next();
		String s3=s.next();
		int result=lcs(s1,s2,s3);
		System.out.println(result);
	}
	public static int lcs(String s1,String s2,String s3)
	{
		int m=s1.length();
		int n=s2.length();
		int o=s3.length();
		int dp[][][]=new int[m+1][n+1][o+1];
		for(int i=0;i<=m;i++)
		{
			for(int j=0;j<=n;j++)
			{
				for(int k=0;k<=o;k++)
				{
					if(i==0||j==0||k==0)
					{
						dp[i][j][k]=0;
					}
					else if(s1.charAt(i-1)==s2.charAt(j-1)&&s1.charAt(i-1)==s3.charAt(k-1))
					{
						dp[i][j][k]=dp[i-1][j-1][k-1]+1;
					}
					else
					{
						dp[i][j][k]=Math.max(Math.max(dp[i-1][j][k],dp[i][j-1][k]), dp[i][j][k-1]);
					}
				}
			}
		}
		return dp[m][n][o];
	}
}