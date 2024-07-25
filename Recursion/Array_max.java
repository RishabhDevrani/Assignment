package Recursion;
import java.util.*;
public class Array_max
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		int result=max_value(arr,0,Integer.MIN_VALUE);
		System.out.println(result);
	}
	public static int max_value(int arr[],int index,int currentmax)
	{
		if(index==arr.length)
		{
			return currentmax;
		}
		currentmax=Math.max(currentmax, arr[index]);
		return max_value(arr,index+1,currentmax);
	}
}