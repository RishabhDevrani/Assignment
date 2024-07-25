package DP_HM;

import java.util.Scanner;

public class Buying_fruits {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t-->0)
		{
			int N=s.nextInt();
			int cost[][]=new int[N][3];
			for(int i=0;i<N;i++)
			{
				for(int j=0;j<3;j++)
				{
					cost[i][j]=s.nextInt();
				}
			}
			int result=fruits(cost,N);
			System.out.println(result);
		}
	}
	public static int fruits(int cost[][],int N)
	{
		if(N==1)
		{
			return Math.min(Math.min(cost[0][0], cost[0][1]), cost[0][2]);
		}
		int dp[][]=new int[N][3];
		for(int i=0;i<3;i++)
		{
			dp[0][i]=cost[0][i];
		}
		for(int i=1;i<N;i++)
		{
			dp[i][0]=cost[i][0]+Math.min(dp[i-1][1],dp[i-1][2]);
			dp[i][1]=cost[i][1]+Math.min(dp[i-1][0],dp[i-1][2]);
			dp[i][2]=cost[i][2]+Math.min(dp[i-1][0],dp[i-1][1]);
		}
		return Math.min(Math.min(dp[N-1][0], dp[N-1][1]), dp[N-1][2]);
	}
}