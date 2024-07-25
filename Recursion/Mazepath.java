package Recursion;
import java.util.*;
public class Mazepath
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int N1=s.nextInt();
		int N2=s.nextInt();
		print(N1,N2,"");
		System.out.println();
		int totalcount=count(N1,N2);
		System.out.println(totalcount);
	}
	public static void print(int row,int col,String path)
	{
		if(row==1&&col==1)
		{
			System.out.print(path+" ");
			return;
		}
		if(row<=0||col<=0)
		{
			return;
		}
		print(row-1,col,path+"V");
		print(row,col-1,path+"H");
		print(row-1,col-1,path+"D");
	}
	public static int count(int row,int col)
	{
		if(row==1&&col==1)
		{
			return 1;
		}
		if(row<=0||col<=0)
		{
			return 0;
		}
		return + count(row-1,col)+count(row,col-1)+count(row-1,col-1);
	}
}