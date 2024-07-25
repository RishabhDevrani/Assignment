package Recursion;

import java.util.Scanner;

public class Vivek_Array
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t-->0)
		{
			int N=s.nextInt();
			int arr[]=new int[N];
			for(int i=0;i<arr.length;i++)
			{
				arr[i]=s.nextInt();
			}
			System.out.println(solve(arr,0,arr.length-1));
		}
	}

	public static int solve(int[] arr, int start, int end) {
		if(start>end)
		{
			return 1;
		}
		int left=0;
		int right=0;
		for(int i=start;i<end;i++)
		{
			int leftnum=ans(arr,start,i);
			int rightnum=ans(arr,i+1,end);
			if(leftnum==rightnum)
			{
				left=solve(arr,start,i);
				right=solve(arr,i+1,end);
				int current=Math.max(left,right)+1;
				return current;
			}
		}
		return 0;
	}
	public static int ans(int arr[],int start,int end)
	{
		int count=0;
		for(int i=start;i<=end;i++)
		{
			count=count+arr[i];
		}
		return count;
	}
}