package Recursion;
import java.util.*;
public class Generate_binaryStrings
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int T=s.nextInt();
		for(int t=0;t<T;t++)
		{
			String input=s.next();
			char current[]=new char[input.length()];
			generateBinary(input,0,current);
			System.out.println();
		}
	}
	public static void generateBinary(String str,int index,char current[])
	{
		if(index==str.length())
		{
			System.out.print(new String(current)+" ");
			return;
		}
		if(str.charAt(index)=='?')
		{
			current[index]='0';
			generateBinary(str,index+1,current);
			current[index]='1';
			generateBinary(str,index+1,current);
		}
		else
		{
			current[index]=str.charAt(index);
			generateBinary(str,index+1,current);
		}
	}
}