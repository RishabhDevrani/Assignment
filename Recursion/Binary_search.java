package Recursion;

import java.util.Scanner;

public class Binary_search
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		int arr[]=new int[N];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=s.nextInt();
		}
		int M=s.nextInt();
		int result=BinarySearch(arr,M,0,N-1);
		System.out.println(result);
	}
	public static int BinarySearch(int arr[],int target,int low,int high)
	{
		if(low<=high)
		{
			int mid=low+(high-low)/2;
			if(arr[mid]==target)
			{
				return mid;
			}
			else if(arr[mid]<=target)
			{
				return BinarySearch(arr,target,mid+1,high);
			}
			else
			{
				return BinarySearch(arr,target,low,mid-1);
			}
		}
		return -1;
	}
}