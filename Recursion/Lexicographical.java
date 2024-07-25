package Recursion;
import java.util.*;
public class Lexicographical
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int limit=s.nextInt();
		solve(0,limit);
	}
	public static void solve(int curr,int limit)
	{
		if(curr>limit)
		{
			return;
		}
		System.out.print(curr+" ");
		int d=0;
		if(curr==0)
		{
			d=1;
		}
		for(;d<=9;d++)
		{
			solve(curr*10+d,limit);
		}
	}
}