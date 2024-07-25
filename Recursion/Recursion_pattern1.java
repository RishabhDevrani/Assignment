package Recursion;
import java.util.*;
public class Recursion_pattern1
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		printNumbers(N,1);
	}
	public static void printNumbers(int n,int row)
	{
		if(row>n)
		{
			return;
		}
		printStars(row);
		System.out.println();
		printNumbers(n,row+1);
	}
	public static void printStars(int count)
	{
		if(count==0)
		{
		   return;
		}
		System.out.print("*\t");
		printStars(count-1);
	}
}