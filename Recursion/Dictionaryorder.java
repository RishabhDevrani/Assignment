package Recursion;
import java.util.*;
public class Dictionaryorder
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String input=s.next();
		char[]charArray=input.toCharArray();
		Arrays.sort(charArray);
		String sortedInput=new String(charArray);
		generatewords(sortedInput,"",input);
	}
	public static void generatewords(String remaining,String current,String original)
	{
		if(current.length()==original.length()&&current.compareTo(original)<0)
		{
			System.out.println(current);
		}
		else
		{
			for(int i=0;i<remaining.length();i++)
			{
				String newremaining=remaining.substring(0, i)+remaining.substring(i+1);
				generatewords(newremaining,current+remaining.charAt(i),original);
			}
		}
	}
}