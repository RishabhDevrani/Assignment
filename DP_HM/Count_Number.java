package DP_HM;

import java.util.Scanner;

public class Count_Number {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t-->0)
		{
			int N=s.nextInt();
			long result=count(N);
			System.out.println(result);
		}
	}
	public static long count(int N)
	{
		long a[]=new long[N+1];
		long b[]=new long[N+1];
		a[0]=b[0]=1;
		for(int i=1;i<N;i++)
		{
			a[i]=a[i-1]+b[i-1];
			b[i]=a[i-1];
		}
		return (a[N-1]+b[N-1]);
	}
}
