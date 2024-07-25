package Basic;

import java.util.Scanner;

public class Conversion {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int sb=s.nextInt();
		int db=s.nextInt();
		int sn=s.nextInt();
		int sum=0;
		int sum1=0;
	    int mult=1;
		int i=1;
		if(sb==10)
		{
			sum=sn;
		}
		else
		{
			while(sn>0)
			{
				int rem=sn%10;
				sum=sum+rem*mult;
				sn=sn/10;
				mult=mult*sb;
			}
	//		System.out.println(sum);
		}
	       if(db==10)
	       {
	    	   sum1=sum;
	       }
	       else
	       {
	    	   while(sum>0)
	    	   {
	    		   int rem=sum%db;
	    		   sum1=sum1+i*rem;
	    		   sum=sum/db;
	    		   i=i*10;
	    	   }
	    	   
	       }
	       System.out.println(sum1);

	}

}
