package DP_HM;

import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Scanner;

public class TopK {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t-->0)
		{
			int N=s.nextInt();
			int k=s.nextInt();
			int arr[]=new int[N];
			for(int i=0;i<N;i++)
			{
				arr[i]=s.nextInt();
			}
			solve(arr,k);
			System.out.println();
		}
	}
	public static void solve(int arr[],int k)
	{
		HashMap<Integer,Integer> HM=new HashMap<>();
		for(int ali:arr)
		{
			int prev_freq=HM.getOrDefault(ali, 0);
			HM.put(ali, prev_freq+1);
			printTopK(HM,k);
		}
	}
	static class pair implements Comparable<pair>
	{
		int ali;
		int freq;
		public pair(int a,int f)
		{
			ali=a;
			freq=f;
		}
		public String toString()
		{
			return "{"+ali+"=>"+freq+"}";
		}
		public int compareTo(pair o)
		{
			int diff=o.freq-this.freq;
			if(diff==0)
			{
				return this.ali-o.ali;
			}
			else
			{
				return diff;
			}
		}
	}
	public static void printTopK(HashMap<Integer,Integer> HM,int k)
	{
		PriorityQueue<pair> PQ=new PriorityQueue<>();
		for(int K:HM.keySet())
		{
			PQ.add(new pair(K,HM.get(K)));
		}
		//System.out.println(PQ);
		for(int cnt=1;cnt<=k && cnt<=HM.size();cnt++)
		{
			System.out.print(PQ.poll().ali+" ");
		}
		//System.out.println();
		//System.out.println("================");
	}
}
