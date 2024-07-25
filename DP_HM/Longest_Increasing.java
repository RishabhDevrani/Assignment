package DP_HM;

import java.util.Scanner;

public class Longest_Increasing
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		int result=Longest(arr,n);
		System.out.println(result);
	}
	public static int Longest(int arr[],int n)
	{
		int dp[]=new int[n+1];
		int max=1;
		for(int i=0;i<n;i++)
		{
			dp[i]=1;
		}
		for(int i=1;i<n;i++)
		{
			for(int j=0;j<i;j++)
			{
				if(arr[i]>arr[j] && dp[i]<dp[j]+1)
				{
					dp[i]=dp[j]+1;
				}
			}
			max=Math.max(max, dp[i]);
		}
		return max;
	}
}