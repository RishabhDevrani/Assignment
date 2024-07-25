package DP_HM;

import java.util.Scanner;

public class Optimal_Game {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		int arr[]=new int[N];
		for(int i=0;i<N;i++)
		{
			arr[i]=s.nextInt();
		}
		System.out.println(game(0,N-1,arr,new Integer[N][N]));
	}
	public static int game(int s,int e,int arr[],Integer dp[][])
	{
		if(s>e)
		{
			return 0;
		}
		if(s+1==e)
		{
			return Math.max(arr[s], arr[e]);
		}
		if(dp[s][e]!=null)
		{
			return dp[s][e];
		}
		int sp1=arr[s]+Math.min(game(s+2, e,arr,dp),game(s+1,e-1,arr,dp));
		int sp2=arr[e]+Math.min(game(s,e-2,arr,dp),game(s+1,e-1,arr,dp));
		dp[s][e]=Math.max(sp1, sp2);
		return Math.max(sp1, sp2);
	}
}