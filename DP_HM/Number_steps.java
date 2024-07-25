package DP_HM;

import java.util.Scanner;

public class Number_steps
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		int result=operations(N);
		System.out.println(result);
	}
	public static int operations(int N)
	{
		int dp[]=new int[N+1];
		dp[0]=0;
		dp[1]=1;
		dp[2]=1;
		for(int i=3;i<=N;i++)
		{
			if(i%2==0)
			{
				dp[i]=dp[i/2]+1;
			}
			else
			{
				dp[i]=Math.min(dp[i-1]+1,(dp[(i+1)/2])+2);
			}
		}
		return dp[N];
	}
}