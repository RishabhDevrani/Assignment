package Basic;

import java.util.Scanner;

public class Check_Prime {
	public static void main(String[] args) {
		  Scanner s=new Scanner(System.in);
	        int num=s.nextInt();
	        int div=1;
	        int noFac=0;
	        while(div<=num)
	        {
	            int rem=num % div;
	         //   System.out.println(div+":"+rem);
	            if(rem==0)
	            {
	                noFac=noFac+1;
	            }
	            div++;
	        }
	       //  System.out.println(noFac);
	         if(noFac==2)
	         {
	             System.out.println("Prime");
	         }
	         else
	         {
	             System.out.println("Not Prime");
	         }

	}

}
