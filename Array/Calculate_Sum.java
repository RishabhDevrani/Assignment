package Array;

import java.util.Scanner;

public class Calculate_Sum {
	public static void main(String[] args) {
		 Scanner scn=new Scanner(System.in);
			int ans=0;
			int n=scn.nextInt();
			int []arr= new int[n];
			for(int i=0;i<arr.length;i++) {
				arr[i]=scn.nextInt();
			}
			int op=scn.nextInt();
			int t=op;
			while(op>0) {
				int x=scn.nextInt();
				op--;
			}
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
		}
		while(t>0) {
			sum=sum*2;
			t--;
		}
		ans=(int) (sum%(Math.pow(10, 9)+7));
		System.out.println(ans);
	}
}
