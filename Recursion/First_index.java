package Recursion;
import java.util.*;
public class First_index {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		int arr[]=new int[N];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=s.nextInt();
		}
		int M=s.nextInt();
		int result=FirstIndex(arr,M,0);
		System.out.println(result);
	}
	public static int FirstIndex(int arr[],int M,int index)
	{
		if(index==arr.length)
		{
			return -1;
		}
		if(arr[index]==M)
		{
			return index;
		}
		return FirstIndex(arr,M,index+1);
	}
}