package DP_HM;

import java.util.Scanner;

public class Tilling_Problem
{
	static int MOD=1000000000+7;
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t-->0)
		{
			int n=s.nextInt();
			int m=s.nextInt();
			int result=tilling(m,n);
			System.out.println(result);
		}
	}
	public static int tilling(int m,int n)
	{
		int dp[]=new int[n+1];
		for(int i=1;i<=n;i++)
		{
			if(i<m)
			{
				dp[i]=1;
			}
			else if(i==m)
			{
				dp[i]=2;
			}
			else
			{
				dp[i]=(dp[i-1]+dp[i-m])%MOD;
			}
		}
		return dp[n];
	}
}