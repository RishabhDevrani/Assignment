package Recursion;
import java.util.*;
public class Parenthesis1 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		List<String>AL=new ArrayList<>();
		int n=s.nextInt();
		gen(n,0,0,"",AL);
	}
	public static void gen(int n,int op,int cl,String path,List<String>AL)
	{
		if(op==n&&cl==n)
		{
			System.out.println(path);
			AL.add(path);
			return;
		}
		if(op>cl)
		{
			gen(n,op,cl+1,path+")",AL);
		}
		if(op<n)
		{
			gen(n,op+1,cl,path+"(",AL);
		}
	}
}
