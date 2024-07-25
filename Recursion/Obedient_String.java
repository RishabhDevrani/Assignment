package Recursion;
import java.util.*;
public class Obedient_String
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String input=s.next();
		boolean result=checkResult(input);
		System.out.println(result);
	}
	public static boolean checkResult(String str)
	{
		if(str.length()==0)
		{
			return true;
		}
		if(str.startsWith("a"))
		{
			return checkResult(str.substring(1));
		}
		else if(str.startsWith("bb"))
		{
			return checkResult(str.substring(2));
		}
		return false;
	}
}