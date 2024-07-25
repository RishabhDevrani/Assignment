package Recursion;
import java.util.*;
public class Recursion_pattern
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		printPattern(N);
	}
	public static void printPattern(int n)
	{
		if(n>0)
		{
			printRow(n);
			System.out.println();
			printPattern(n-1);
		}
	}
		public static void printRow(int stars)
		{
			if(stars>0)
			{
				System.out.print("*\t");
				printRow(stars-1);
			}
		}
	}