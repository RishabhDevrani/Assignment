package Recursion;
import java.util.*;
public class Recursion_codes
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String input=s.next();
		ArrayList<String> AL=codeString(input);
		System.out.println(AL);
	}
	public static ArrayList<String> codeString(String s)
	{
		ArrayList<String>AL=new ArrayList<>();
		codeFinal(s,"",AL);
		return AL;
	}
	public static void codeFinal(String s,String path,ArrayList<String>AL)
	{
		if(s.length()==0)
		{
			AL.add(path);
			return;
		}
		char a=s.charAt(0);
		int n1=a-'0';
		char c1=(char)(n1-1+'a');
		String remain=s.substring(1);
		codeFinal(remain,path+c1,AL);
		if(s.length()>1)
		{
			String c=s.substring(0,2);
			int n2=Integer.parseInt(c);
			if(n2-1<26)
			{
				char c2=(char)(n2-1+'a');
				String remain1=s.substring(2);
				codeFinal(remain1,path+c2,AL);
			}
		}
	}
}