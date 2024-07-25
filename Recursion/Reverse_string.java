package Recursion;
import java.util.*;
public class Reverse_string {
	public static void main(String[] args) {
	   Scanner s=new Scanner(System.in);
	   String str=s.nextLine();
	   String rev=reverse(str);
	   System.out.println(rev);
	}
	public static String reverse(String str)
	{
		if(str.isEmpty())
		{
			return str;
		}
		return reverse(str.substring(1))+str.charAt(0);
	}
}