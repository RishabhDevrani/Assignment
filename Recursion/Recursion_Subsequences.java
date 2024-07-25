package Recursion;
import java.util.*;
public class Recursion_Subsequences
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.next();
		printSubsequences(str,0,"");
		System.out.println();
		int totalCount=countSubsequences(str);
		System.out.println(totalCount);
	}
	public static void printSubsequences(String str,int index,String curr)
	{
		if(index==str.length())
		{
			System.out.print(curr+" ");
			return;
		}
		printSubsequences(str,index+1,curr);
		printSubsequences(str,index+1,curr+str.charAt(index));
	}
	public static int countSubsequences(String str)
	{
		if(str.isEmpty())
		{
			return 1;
		}
		return 2*countSubsequences(str.substring(1));
	}
}