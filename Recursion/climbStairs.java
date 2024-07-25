package Recursion;
import java.util.*;
public class climbStairs
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int count=climbStairs(n);
		System.out.println(count);
	}
	public static int climbStairs(int n)
	{
		if(n<=1)
		{
			return 1;
		}
		else
		{
			return+climbStairs(n-1)+climbStairs(n-2);
		}
	}
}