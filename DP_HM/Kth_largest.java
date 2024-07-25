package DP_HM;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Kth_largest {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		int k=s.nextInt();
		int arr[]=new int[N];
		for(int i=0;i<N;i++)
		{
			arr[i]=s.nextInt();
		}
		PriorityQueue<Integer> PQ=new PriorityQueue<>();
		for(int i=0;i<N;i++)
		{
			PQ.add(arr[i]);
			if(PQ.size()>k)
			{
				PQ.poll();
			}
		}
		System.out.println(PQ.poll());
	}
}
