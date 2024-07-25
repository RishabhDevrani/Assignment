package DP_HM;

import java.util.HashMap;
import java.util.Scanner;

public class ExistORNOT {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t-->0)
		{
			int N=s.nextInt();
			int arr[]=new int[N];
			for(int i=0;i<N;i++)
			{
				arr[i]=s.nextInt();
			}
			int q=s.nextInt();
			HashMap<Integer,Boolean> HM=new HashMap<>();
			for(int ali:arr)
			{
				HM.put(ali, true);
			}
			for(int i=0;i<q;i++)
			{
				int query=s.nextInt();
				if(HM.containsKey(query))
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
}