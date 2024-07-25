package DP_HM;

import java.util.Scanner;

public class Matrix_Chain
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		int arr[]=new int[N];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=s.nextInt();
		}
		System.out.println(Matrix(arr,1,N-1,new Integer[N+1][N+1]));
	}
	public static int Matrix(int arr[],int i,int j,Integer dp[][])
	{
		if(i==j)
		{
			return 0;
		}
		if(dp[i][j]!=null)
		{
			return dp[i][j];
		}
		int min=Integer.MAX_VALUE;
		for(int k=i;k<j;k++)
		{
			int count=Matrix(arr,i,k,dp)+Matrix(arr,k+1,j,dp)+arr[i-1]*arr[k]*arr[j];
			min=Math.min(min, count);
		}
		dp[i][j]=min;
		return dp[i][j];
	}
}