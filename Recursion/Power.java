package Recursion;
import java.util.*;
public class Power
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int x=s.nextInt();
		int n=s.nextInt();
		System.out.println(calculatePowerRecursive(x,n));
	}
	public static long calculatePowerRecursive(int x,int n)
	{
		if(n==0)
		{
			return 1;
		}
		long temp=calculatePowerRecursive(x,n/2);
		if(n%2==0)
		{
			return temp*temp;
		}
		else
		{
			return x*temp*temp;
		}
	}
}