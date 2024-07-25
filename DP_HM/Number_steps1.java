package DP_HM;

import java.util.Scanner;

public class Number_steps1 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		System.out.println(steps(n));
	}
	public static int steps(int n)
	{
		if(n==1)
		{
			return 0;
		}
		if(n<1)
		{
			return Integer.MAX_VALUE;
		}
		if(n%2==0)
		{
			return steps(n/2)+1;
		}
		else
		{
			int sp1=steps(n+1);
			int sp2=steps(n-1);
			return Math.min(sp1, sp2)+1;
		}
	}

}
