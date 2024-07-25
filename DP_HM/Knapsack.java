package DP_HM;

import java.util.Scanner;

public class Knapsack {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int cap=s.nextInt();
		int wt[]=new int[n];
		for(int i=0;i<n;i++)
		{
			wt[i]=s.nextInt();
		}
		int val[]=new int[n];
		for(int i=0;i<n;i++)
		{
			val[i]=s.nextInt();
		}
		int result=knap(n,cap,wt,val);
		System.out.println(result);
	}
	public static int knap(int n,int cap,int wt[],int val[])
	{
		int dp[]=new int[cap+1];
		for(int i=0;i<n;i++)
		{
			for(int j=wt[i];j<=cap;j++)
			{
				dp[j]=Math.max(dp[j], dp[j-wt[i]]+val[i]);
			}
		}
		return dp[cap];
	}
}