package Recursion;
import java.util.*;
public class Subsets2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        int arr[]=new int[N];
        for(int i=0;i<N;i++)
        {
        	arr[i]=s.nextInt();
        }
        int target=s.nextInt();
        printSubsets(arr,target,0,"");
        int count=countSubsets(arr,target,0);
        System.out.println(count);
	}
	public static void printSubsets(int arr[],int target,int index,String subset)
	{
		if(index==arr.length)
		{
			if(target==0)
			{
				System.out.print(subset+" ");
			}
			return;
		}
		printSubsets(arr,target-arr[index],index+1,subset+arr[index]+" ");
		printSubsets(arr,target,index+1,subset);
	}
	public static int countSubsets(int arr[],int target,int index)
	{
		if(index==arr.length)
		{
			return(target==0)?1:0;
		}
		int includeCount=countSubsets(arr,target-arr[index],index+1);
		int excludeCount=countSubsets(arr,target,index+1);
		return includeCount+excludeCount;
	}
}