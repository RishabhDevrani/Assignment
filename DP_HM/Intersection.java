package DP_HM;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Intersection {
	public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        int arr1[]=new int[N];
        int arr2[]=new int[N];
        for(int i=0;i<N;i++)
        {
        	arr1[i]=s.nextInt();
        }
        for(int i=0;i<N;i++)
        {
        	arr2[i]=s.nextInt();
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        ArrayList<Integer> AL= Intersection(arr1,arr2);
        System.out.println(AL);
	}
	public static ArrayList<Integer> Intersection(int arr1[],int arr2[])
	{
		ArrayList<Integer> AL=new ArrayList<>();
		int i=0;
		int j=0;
		while(i<arr1.length&&j<arr2.length)
		{
			if(arr2[j]==arr1[i])
			{
				AL.add(arr2[j]);
				j++;
				i++;					
			}
			else if(arr2[j]>arr1[i])
			{
				i++;
			}
			else 
			{
				j++;
			}
		}
		return AL;
	}
}