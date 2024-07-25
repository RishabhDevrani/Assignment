package Recursion;
import java.util.*;
public class NthTraingle_recursion
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		int nthTraingle=FindTraingle(N);
		System.out.println(nthTraingle);
	}
	public static int FindTraingle(int n)
	{
		if(n==1)
		{
			return 1;
		}
		else
		{
			return n+FindTraingle(n-1);
		}
	}
}