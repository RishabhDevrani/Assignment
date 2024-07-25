package Recursion;
import java.util.Scanner;
public class Recursion_duplicate
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String inputString=s.next();
		String result=duplicate(inputString);
		System.out.println(result);
	}
	public static String duplicate(String str)
	{
		if(str.length()==1)
		{
			return str;
		}
		else
		{
			char firstChar=str.charAt(0);
			char secondChar=str.charAt(1);
			if(firstChar==secondChar)
			{
				return firstChar+"*"+duplicate(str.substring(1));
			}
			else
			{
				return firstChar+duplicate(str.substring(1));
			}
		}
	}
}