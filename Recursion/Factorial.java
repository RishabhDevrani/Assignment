package Recursion;
import java.util.*;
import java.math.BigInteger;
public class Factorial
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		BigInteger result=Factorial(N);
		System.out.println(result);
	}
	public static BigInteger Factorial(int n)
	{
		if(n==0)
		{
			return BigInteger.ONE;
		}
		else
		{ 
			return BigInteger.valueOf(n).multiply(Factorial(n-1));
		}
	}
}