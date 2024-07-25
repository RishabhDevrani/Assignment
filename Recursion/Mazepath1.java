package Recursion;
import java.util.*;
public class Mazepath1 {
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	ArrayList<String>paths=new ArrayList<>();
	int N=s.nextInt();
	printPaths(N,0,0,"",paths);
	for(String path:paths)
	{
		System.out.print(path+" ");
	}
	System.out.println();
	int totalPaths=countPaths(N,0,0);
	System.out.println(totalPaths);
	}
	public static int countPaths(int N,int row,int col)
	{
		if(row==N-1&&col==N-1)
		{
			return 1;
		}
		int right=0,down=0,diagonal=0;
		if(col+1<N)
		{
			right=countPaths(N,row,col+1);
		}
		if(row+1<N)
		{
			down=countPaths(N,row+1,col);
		}
		if(row==col||row+col==N-1)
		{
			diagonal=countPaths(N,row+1,col+1);
		}
		return right+down+diagonal;
	}
	public static void printPaths(int N,int row,int col,String path,ArrayList<String>paths)
	{
		if(row==N-1&&col==N-1)
		{
			paths.add(path);
			return;
		}
		if(col+1<N)
		{
			printPaths(N,row,col+1,path+"V",paths);
		}
		if(row+1<N)
		{
			printPaths(N,row+1,col,path+"H",paths);
		}
		if(row==col||row+col==N-1)
		{
			printPaths(N,row+1,col+1,path+"D",paths);
		}
	}
}