package Array;

import java.util.Scanner;

public class Inverse {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int size=s.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=s.nextInt();
		}
		inverse(arr,5);
		}
		public static void inverse(int arr[],int num)
		{
		   int copy[]=new int[num];
		   for(int i=0;i<arr.length;i++)
		   {
			   int temp=0;
			   temp=arr[i];
			   copy[temp]=i;
		   }
		  for(int i=0;i<arr.length;i++)
		  {
			  System.out.print(copy[i]+" ");
		  }

	}

}
