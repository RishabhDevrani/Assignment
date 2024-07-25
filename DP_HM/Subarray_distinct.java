package DP_HM;

import java.util.HashSet;
import java.util.Scanner;

public class Subarray_distinct {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		int arr[]=new int[N];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=s.nextInt();
		}
		solve(arr);
	}
	public static void solve(int arr[])
	{
		HashSet<Integer> Set=new HashSet<>();
		int s=0;
		int e=0;
		long ans=0;
		while(e<arr.length)
		{
			//disp(arr,s,e);
			//System.out.println(ans);
			//System.out.println("========");
			if(!Set.contains(arr[e]))
			{
				Set.add(arr[e]);
				e++;
				int n=(e-s);
				ans=ans+n*(n+1)/2;
			}
			else
			{
				Set.remove(arr[s]);
				s++;
			}
		}
		ans=ans%(1000000000+7);
		System.out.println(ans);
	}
	public static void disp(int arr[],int s,int e)
	{
		for(int i=s;i<e;i++)
		{
			System.out.println(arr[i]+" ");
		}
		System.out.println();
	}
}
