package DP_HM;

import java.util.Scanner;

public class Coin {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int A=s.nextInt();
		int N=s.nextInt();
		int coins[]=new int[N];
		for(int i=0;i<coins.length;i++)
		{
			coins[i]=s.nextInt();
		}
		System.out.println(solve(0,A,coins,new Integer[coins.length+10][A+10]));
		System.out.println(BU(A,coins));
	}
	public static int solve(int idx,int A,int coins[],Integer[][] dp)
	{
		if(A==0)
		{
			return 1;
		}
		if(idx==coins.length||A<0)
		{
			return 0;
		}
		if(dp[idx][A]!=null)
		{
			return dp[idx][A];
		}
		int sp1=solve(idx,A-coins[idx],coins,dp);
		int sp2=solve(idx+1,A,coins,dp);
		dp[idx][A]=sp1+sp2;
		return sp1+sp2;
	}
	public static int BU(int Amount,int coins[])
	{
		int[][] dp=new int[coins.length][Amount+1];
		for(int A=0;A<=Amount;A++)
		{
			for(int idx=coins.length-1;idx>=0;idx--)
			{
				if(A==0)
				{
					dp[idx][A]=1;
					continue;
				}
				if(idx==coins.length)
				{
					return 0;
				}
				int sp1=0;
				if(A-coins[idx]>=0)
				{
					sp1=dp[idx][A-coins[idx]];
				}
				int sp2=0;
				if(idx+1<coins.length)
				{
					sp2=dp[idx+1][A];
				}
				dp[idx][A]=sp1+sp2;
			}
		}
		return dp[0][Amount];
	}
}