package Recursion;
import java.util.*;
public class BoardPath
{
	public static void main(String[] args) {
		 Scanner s=new Scanner(System.in);
			int N=s.nextInt();
			int M=s.nextInt();
			printPaths(N,M,"");
			System.out.println();
			int result=countPaths(N,M);
			System.out.println(result);
			//printPaths(N,M,"");
		}
		public static int countPaths(int N,int M)
		{
			if(N==0)
			{
				return 1;
			}
			int count=0;
			for(int i=1;i<=M;i++)
			{
				if(N-i>=0)
				{
		            count=count+countPaths(N-i,M);			
				}
			}
			return count;
		}
		public static void printPaths(int N,int M,String path)
		{
			if(N==0)
			{
				System.out.print(path+" ");
				return;
			}
			for(int i=1;i<=M;i++)
			{
				if(N-i>=0)
				{
					printPaths(N-i,M,path+i);
				}
			}
	    }
	}
