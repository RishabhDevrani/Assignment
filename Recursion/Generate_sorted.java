package Recursion;
import java.util.*;
public class Generate_sorted {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		int M=s.nextInt();
		int A[]=new int[N];
		int B[]=new int[M];
		for(int i=0;i<N;i++)
		{
			A[i]=s.nextInt();
		}
		for(int j=0;j<M;j++)
		{
			B[j]=s.nextInt();
		}
		generate(A,B);
	}
	public static void generateSort(int A[],int B[],int arr[],int i,int j,int len,boolean flag)
	{
		if(flag)
		{
			if(len!=0)
				printArr(arr,len+1);
			for(int k=i;k<A.length;k++)
			{
				if(len==0)
				{
					arr[len]=A[k];
					generateSort(A,B,arr,k+1,j,len,!flag);
				}
				else if(A[k]>arr[len])
				{
					arr[len+1]=A[k];
					generateSort(A,B,arr,k+1,j,len+1,!flag);
				}
			}
		}
			else
			{
				for(int l=j;l<B.length;l++)
				{
					if(B[l]>arr[len])
					{
						arr[len+1]=B[l];
						generateSort(A,B,arr,i,l+1,len+1,!flag);
					}
				}
			}
		}
	public static void generate(int A[],int B[])
	{
		int arr[]=new int[A.length+B.length];
		generateSort(A,B,arr,0,0,0,true);
	}
	public static void printArr(int arr[],int N)
	{
		for(int i=0;i<N;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println(" ");
	}
}
