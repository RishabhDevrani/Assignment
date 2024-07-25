package Basic;

import java.util.Scanner;

public class Prime_Factor1 {
	public static void main(String[] args) {
		 Scanner s=new Scanner(System.in);
	        int num=s.nextInt();
	        int div=2;
	        while(num>1)
	        {
	            if(num%div==0)
	            {
	                num=num/div;
	                System.out.print(div+" ");
	            }
	            else
	            {
	                div++;
	            }
	        }
	}

}
