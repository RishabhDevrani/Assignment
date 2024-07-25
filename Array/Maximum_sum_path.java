package Array;

import java.util.Scanner;

public class Maximum_sum_path {
	public static void main(String[] args) {
		 Scanner s=new Scanner(System.in);
	    	int T=s.nextInt();
	    	while(T>0)
	    	{
	    		int size1=s.nextInt();
	    		int arr1[]=new int[size1];
	    		int size2=s.nextInt();
	    		int arr2[]=new int[size2];
	    		for(int i=0;i<arr1.length;i++)
	    		{
	    			arr1[i]=s.nextInt();
	    		}
	    		for(int i=0;i<arr2.length;i++)
	    		{
	    			arr2[i]=s.nextInt();
	    		}
	    		path(arr1,arr2);
	    		T--;	
	    	}
	}
	    public static void path(int arr1[],int arr2[])
	    {
	    	long sum1=0;
	    	long sum2=0;
	    	int i=0;
	    	int j=0;
	    	int tot=0;
	    	while(i<arr1.length&&j<arr2.length)
	    	{
	    		if(arr1[i]<arr2[j])
	    		{
	    			sum1=sum1+arr1[i];
	    			i++;
	    		}
	    		else if(arr2[j]<arr1[i])
	    		{
	    			sum2=sum2+arr2[j];
	    			j++;
	    		}
	    		else
	    		{
	    			tot=(int)(tot+max(sum1,sum2));
	    			tot=tot+arr1[i];
	    			sum1=0;
	    			sum2=0;
	    			i++;
	    			j++;
	    		}
	    	}
	    	if(i==arr1.length)
	    	{
	    		while(j<arr2.length)
	    		{
	    			sum2=sum2+arr2[j];
	    			j++;
	    		}
	    	}
	    	else
	    	{
	    		while(i<arr1.length)
	    		{
	    			sum1=sum1+arr1[i];
	    			i++;
	    		}
	    	}
	    	tot=(int)(tot+max(sum1,sum2));
	    	System.out.println(tot);
	    }
	    public static long max(long sum1,long sum2)
	    {
	    	if(sum1>sum2)
	    	{
	    		return sum1;
	    	}
	    	else
	    	{
	    		return sum2;
	    	}
	}
}
