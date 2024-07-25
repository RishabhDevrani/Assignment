package Array;

import java.util.Scanner;

public class Majority_element {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int size=s.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=s.nextInt();
		}
		elements(arr);
	}
	public static void elements(int arr[])
	{
		int maxcount=0;
		int index=-1;
		for(int i=0;i<arr.length;i++)
		{
			int count=0;
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
				}
			}
			if(count>maxcount)
			{
				maxcount=count;
				index=i;
			}
		}
		if(maxcount>arr.length/2)
		{
			System.out.println(arr[index]);
		}
		else
		{
			System.out.println("not found");
		}
	}
}
