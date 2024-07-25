package DP_HM;

import java.util.HashMap;
import java.util.Scanner;

public class Exchanging_coins
{
	static HashMap<Integer,Long> HM =new HashMap<>();
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		long result=coins(N);
		System.out.println(result);
	}
	public static long coins(int N)
	{
		if(N<=0)
		{
			return 0;
		}
		if(HM.containsKey(N))
		{
			return HM.get(N);
		}
		long maxweight=Math.max(N,coins(N/2)+coins(N/3)+coins(N/4));
		HM.put(N, maxweight);
		return maxweight;
	}
}