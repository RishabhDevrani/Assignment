package Recursion;
import java.util.*;
public class Sudoku {
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int arr[][]=new int[n][n];
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<n;j++)
		{
			arr[i][j]=s.nextInt();
		}
	}
	solve(0,0,arr);
	}
	public static void solve(int r,int c,int arr[][])
	{
		if(c==9)
		{
			c=0;
			r++;
		}
		if(r==9)
		{
			print(arr);
			//System.out.println("===");
			return;
		}
		if(arr[r][c]!=0)
		{
			solve(r,c+1,arr);
		}
		else
		{
			for(int ch=1;ch<=9;ch++)
			{
				if(isSafe(ch,arr,r,c))
				{
					arr[r][c]=ch;
					solve(r,c+1,arr);
				}
			}
			arr[r][c]=0;
		}
	}
	private static boolean isSafe(int ch, int[][] arr, int r, int c) {
		for(int R=0;R<9;R++)
		{
			if(arr[R][c]==ch)
			{
				return false;
			}
		}
		for(int C=0;C<9;C++)
		{
			if(arr[r][C]==ch)
			{
				return false;
			}
		}
		int RBox=r/3;
		int CBox=c/3;
		for(int R=RBox*3;R<RBox*3+3;R++)
		{
			for(int C=CBox*3;C<CBox*3+3;C++)
			{
				if(arr[R][C]==ch)
				{
					return false;
				}
			}
		}
		return true;
	}
	public static void print(int arr[][])
	{
		for(int row[]:arr)
		{
			for(int ch:row)
			{
				System.out.print(ch+" ");
			}
			System.out.println();
		}
	}
}
