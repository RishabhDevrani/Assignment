package Array;

import java.util.Scanner;

public class Linear {
	 public static void main(String args[]) {
	        Scanner s = new Scanner(System.in);
			int size = s.nextInt();
			int arr[] = new int[size];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = s.nextInt();
			}
			int target=s.nextInt();
			int result=linearsearch(arr,target);
			if(result==-1)
			{
				System.out.println(result);
			}
			else
			{
				System.out.println(result);
			}
			
			//linearsearch(arr,target);
		}
		public static int linearsearch(int arr[],int target)
		{
			for(int i=0;i<arr.length;i++)
			{
				if(arr[i]==target)
				{
					return i;
				}
			}
			return -1;
	    }
}
