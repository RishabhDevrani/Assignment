package Recursion;
import java.util.*;
public class Generate_Parenthesis {
	public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    List<String>AL=new ArrayList<>();
    int n=s.nextInt();
    generate(n,0,0,"",AL);
	}
	public static void generate(int n,int op,int cl,String path,List<String>AL)
	{
		if(op==n&&cl==n)
		{
			System.out.println(path);
			AL.add(path);
			return;
		}
		if(op>cl)
		{
			generate(n,op,cl+1,path+")",AL);
		}
		if(op<n)
		{
			generate(n,op+1,cl,path+"(",AL);
		}
	}
}