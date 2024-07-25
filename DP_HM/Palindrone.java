package DP_HM;

import java.util.Scanner;

public class Palindrone {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
			String s=sc.next();
			int result=partition(s);
			System.out.println(result);
		}
	}
	public static int partition(String s)
	{
		int n=s.length();
		int dp[]=new int[n];
		for(int i=0;i<n;i++)
		{
			dp[i]=i;
			for(int j=0;j<=i;j++)
			{
				if(isPalin(s,j,i))
				{
					if(j==0)
					{
						dp[i]=0;
					}
					else
					{
						dp[i]=Math.min(dp[i], dp[j-1]+1);
					}
				}
			}
		}
		return dp[n-1];
	}
	public static boolean isPalin(String s,int start,int end)
	{
		while(start<end)
		{
			if(s.charAt(start)!=s.charAt(end))
			{
				return false;
			}
			start++;
			end--;
		}
		return true;
	}
}