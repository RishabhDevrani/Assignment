package Recursion;
import java.util.*;
public class Odd_Even
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		printNumbers(N);
	}
	public static void printNumbers(int n)
	{
		if(n<=0)
		{
			return;
		}
		if(n%2!=0)
		{
			System.out.println(n);
		}
		printNumbers(n-1);
		if(n%2==0)
		{
			System.out.println(n);
		}
	}
}