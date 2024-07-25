package Array;

import java.util.Scanner;

public class sort_just_0to1 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int size=s.nextInt();
		int arr[]=new int[size];
		int n=arr.length;
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=s.nextInt();
		}
		segrete(arr,n);
		zero(arr,n);
	}
	public static void segrete(int arr[],int n)
	{
		int count=0;
		for(int i=0;i<n;i++)
		{
			if(arr[i]==0)
			{
				count++;
			}
		}
		for(int i=0;i<count;i++)
		{
			arr[i]=0;
		}
		for(int i=count;i<n;i++)
		{
		    arr[i]=1;	
		}
	}
		public static void zero(int arr[],int n)
		{
			for(int i=0;i<n;i++)
			{
				System.out.print(arr[i]+" ");
			}
	}

}
