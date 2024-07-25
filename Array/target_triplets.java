package Array;

import java.util.Arrays;
import java.util.Scanner;

public class target_triplets {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int size=s.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=s.nextInt();
		}
		Arrays.sort(arr);
		//System.out.println(Arrays.toString(arr));
		int target=s.nextInt();
		sumtarget(arr,target);
	}
	public static void sumtarget(int arr[],int target)
	{
		for(int i=0;i<arr.length;i++)
		{
			int copy=target-arr[i];
			int k=i+1;
			int j=arr.length-1;
			while(k<j)
			{
				if(arr[k]+arr[j]==copy)
				{
					System.out.println(arr[i]+", "+arr[k]+" and "+arr[j]);
					k++;
					j--;	
				}
				else if(arr[k]+arr[j]>copy)
				{
					j--;
				}
				else
				{
					k++;
				}
			}
		}
	}
}
