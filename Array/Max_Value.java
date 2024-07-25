package Array;

import java.util.Scanner;

public class Max_Value {
	public static void main(String[] args) {
		 Scanner s=new Scanner(System.in);
			int size=s.nextInt();
			int arr[]=new int[size];
			for(int i=0;i<arr.length;i++)
			{
				arr[i]=s.nextInt();
			}
			max(arr);
		}
		public static void max(int arr[])
		{
			int max=arr[0];
			int min=arr[0];
			for(int i=0;i<arr.length;i++)
			{
				if(arr[i]>max)
				{
					max=arr[i];
				}
				if(arr[i]<min)
				{
					min=arr[i];
				}
			}
			System.out.print(max);
	}
}
