package Recursion;
import java.util.*;
public class Last_index
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		int arr[]=new int[N];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=s.nextInt();
		}
		int M=s.nextInt();
		int result=lastindex(arr,N-1,M);
		System.out.println(result);
	}
	public static int lastindex(int arr[],int index,int M)
	{
		if(index<=0)
		{
			return -1;
		}
		if(arr[index]==M)
		{
			return index;
		}
		return lastindex(arr,index-1,M);
	}
}