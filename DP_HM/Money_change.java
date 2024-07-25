package DP_HM;

import java.util.Scanner;

public class Money_change
{
	static int mod=1000000000+7;
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t-->0)
		{
			int m=s.nextInt();
			int arr[]=new int[m];
			for(int i=0;i<arr.length;i++)
			{
				arr[i]=s.nextInt();
			}
			int N=s.nextInt();
			System.out.println(countways(arr,N));
		}		
	}
	public static int countways(int arr[],int N)
	{
		int dp[]=new int[N+1];
		dp[0]=1;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=arr[i];j<=N;j++)
			{
				dp[j]=(dp[j]+dp[j-arr[i]])%mod;
			}
		}
		return dp[N];
	}
}