package Recursion;
import java.util.*;
public class Recursion_parenthesis
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String input=s.next();
		String result=parenthesis(input);
		System.out.println(result);
	}
	public static String parenthesis(String str)
	{
		int startIndex=str.indexOf('(');
		int endIndex=str.indexOf(')');
		if(startIndex!=1&&endIndex!=1&&startIndex<endIndex)
		{
			return str.substring(startIndex+1,endIndex);
		}
		else
		{
			return "no valid parenthesis";
		}
	}
}