package Array;

import java.util.Scanner;

public class Alex_Shop {
	public static void main(String[] args) {
		 Scanner s=new Scanner(System.in);
			int size=s.nextInt();
			int arr[]=new int[size];
			for(int i=0;i<arr.length;i++)
			{
				arr[i]=s.nextInt();
			}
		        int q=s.nextInt();
	            for(int i=0;i<q;i++)
	            {
	            	int a=s.nextInt();
	            	int k=s.nextInt();
	            	int count=0;
	            	for(int j=0;j<arr.length;j++)
	            	{
	            		if(a%arr[j]==0)
	            		{
	            			count++;
	            		}
	            	}
	            	if(count>=k)
	            	{
	            		System.out.println("Yes");
	            	}
	            	else
	            	{
	            		System.out.println("No");
	            	}
	            }
	}
}
