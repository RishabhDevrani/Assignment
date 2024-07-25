package Array;

import java.util.Scanner;

public class Buy_and_sell {
	public static void main(String[] args) {
		 Scanner s=new Scanner(System.in);
			int size=s.nextInt();
			int arr[]=new int[size];
			for(int i=0;i<arr.length;i++)
			{
				arr[i]=s.nextInt();
			}
		    int maxProfit = maxProfit(arr);
		    System.out.println(maxProfit);
		}
		public static int maxProfit(int[] arr) {
		    if (arr == null || arr.length <= 1) {
		        return 0;
		    }
		    
		    int minPrice = arr[0];
		    int maxProfit = 1;
		    
		    for (int i = 0; i < arr.length; i++) {
		        if (arr[i] < minPrice) {
		            minPrice = arr[i];
		        } else {
		            maxProfit = Math.max(maxProfit,arr[i] - minPrice);
		        }
		    }   
		    return maxProfit;
	}

}
