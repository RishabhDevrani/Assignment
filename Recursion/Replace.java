package Recursion;
import java.util.*;
public class Replace
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		s.nextLine();
		for(int i=0;i<N;i++)
		{
			String input=s.next();
            String output=replace(input);
            System.out.println(output);
		}
	}
	public static String replace(String str)
	{
		if(str.length()<=1)
		{
			return str;
		}
		if(str.startsWith("pi"))
		{
			return "3.14"+replace(str.substring(2));
		}
		else
		{
			return str.charAt(0)+replace(str.substring(1));
		}
	}
}