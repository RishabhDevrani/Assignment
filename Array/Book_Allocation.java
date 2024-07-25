package Array;

import java.util.Scanner;

public class Book_Allocation {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t-->0)
		{
			int n=s.nextInt();
			int m=s.nextInt();
			int pages[]=new int[n];
			int low=0;
			int high=0;
			for(int i=0;i<n;i++)
			{
				pages[i]=s.nextInt();
				high=high+pages[i];
				low=Math.max(low, pages[i]);
			}
			int result=binarySearch(pages,m,low,high);
			System.out.println(result);
		}
	}
	public static boolean isPossible(int pages[],int n,int m,int mid)
	{
		int students=1;
		int pagesRead=0;
		for(int i=0;i<n;i++)
		{
			if(pages[i]>mid)
			{
				return false;
			}
			if(pagesRead+pages[i]>mid)
			{
				students++;
				pagesRead=pages[i];
				if(students>m)
				{
					return false;
				}
			}
				else
				{
					pagesRead=pagesRead+pages[i];
				}
			}
			return true;
		}
		public static int binarySearch(int pages[],int m,int low,int high)
		{
			int result= -1;
			while(low<=high)
			{
				int mid=low+(high-low)/2;
				if(isPossible(pages,pages.length,m,mid))
				{
					result=mid;
					high=mid-1;
				}
				else
				{
					low=mid+1;
				}
			}
			return result;
	}

}
