package Recursion;
import java.util.*;
public class Recursion_Twins {
	public static void main(String[] args) {
	 Scanner s=new Scanner(System.in);
	 String input=s.next();
	 int twinCount=countTwins(input,0);
	 System.out.println(twinCount);
	}
	public static int countTwins(String str,int index)
	{
		if(index<str.length()-2)
		{
			if(str.charAt(index)==str.charAt(index+2))
			{
				return 1+countTwins(str,index+1);
			}
			else
			{
				return countTwins(str,index+1);
			}
		}
		return 0;
	}
}
