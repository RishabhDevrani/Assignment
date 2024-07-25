package Array;

import java.util.Scanner;

public class Minimum_swaps {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
	    int size=s.nextInt();
	    int arr[]=new int[size];
	    for(int i=0;i<arr.length;i++)
	    {
	        arr[i]=s.nextInt();
	    }
	    min_swaps(arr);
	    }
	    public static void min_swaps(int arr[])
	    {
	        int swap=0;
	        for(int i=0;i<arr.length;i++)
	        {
	            while(arr[i]!=i+1)
	            {
	                int temp=0;
	                temp=arr[i];
	                arr[i]=arr[temp-1];
	                arr[temp-1]=temp;
	                swap++;
	            }
	        }
	        System.out.println(swap);
	}

}
