package Array;

import java.util.Scanner;

public class Product_Array {
	public static void main(String[] args) {
		 Scanner s=new Scanner(System.in);
			int size=s.nextInt();
			int arr[]=new int[size];
			for(int i=0;i<arr.length;i++)
			{
				arr[i]=s.nextInt();
			}
			solve3(arr);
		}
		public static void solve3(int arr[])
		{
			long r_arr[]=new long[arr.length];
			long R=1;
			for(int i=arr.length-1;i>=0;i--)
			{
				r_arr[i]=R;
				R=R*arr[i];
			}
			long L=1;
			for(int i=0;i<arr.length;i++)
			{
				System.out.print(L*r_arr[i]+" ");
				L=L*arr[i];
			}
		}
		public static void solve2(int arr[])
		{
			long L=1;
			for(int i=0;i<arr.length;i++)
			{
				long R=1;
				for(int j=i+1;j<arr.length;j++)
				{
					R=R*arr[j];
				}
				System.out.print(L*R+" ");
				L=L*arr[i];
			}
		}
		public static void solve1(int arr[])
		{
			for(int i=0;i<arr.length;i++)
			{
				long L=1;
				for(int j=0;j<=i-1;j++)
				{
					L=L*arr[j];
				}
				long R=1;
				for(int j=i+1;j<arr.length;j++)
				{
					R=R*arr[j];
				}
				System.out.print(L*R+" ");
			}
	}
}
