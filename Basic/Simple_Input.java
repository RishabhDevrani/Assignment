package Basic;

import java.util.Scanner;

public class Simple_Input {
	public static void main(String[] args) {
		  Scanner s=new Scanner(System.in);
		     int count=1;
		     int c=0;
		     while(count>0)
		     {
		    	 int num1=s.nextInt();
		    	 c=c+num1;
		    	 if(c<0)
		    	 {
		    		 break;
		    	 }
		    	 else
		    	 {
		    		 System.out.println(num1);
		    	 }
		     }
	}

}
