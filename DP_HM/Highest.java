package DP_HM;

import java.util.HashMap;
import java.util.Scanner;

public class Highest {
	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		int N=s.nextInt();
		int arr[]=new int[N];
		for(int i=0;i<N;i++)
		{
			arr[i]=s.nextInt();
		}
		HashMap<Integer,Integer> HM=new HashMap<>();
		for(int num:arr)
		{
			HM.put(num, HM.getOrDefault(num, 0)+1);
		}
		int max=0;
		int maxFrequency=0;
		for(HashMap.Entry<Integer,Integer> entry: HM.entrySet())
		{
			if(entry.getValue()>maxFrequency)
			{
				maxFrequency=entry.getValue();
				max=entry.getKey();
			}
		}
		System.out.println(max);
	}
}
