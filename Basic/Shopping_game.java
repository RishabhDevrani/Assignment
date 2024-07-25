package Basic;

import java.util.Scanner;

public class Shopping_game {
	public static void main(String[] args) {
		 Scanner s=new Scanner(System.in);
			int R=s.nextInt();
			while(R>0)
			{
				R--;
			int max_A=s.nextInt();
			int max_H=s.nextInt();
	         int A=0;
	         int H=0;
	         int phone=1;
	         while(true)
	         {
	        	 A=A+phone;
	        	 phone++;
	        	 if(A>max_A)
	        	 {
	        		 System.out.println("Harshit");
	        		 break;
	        	 }
	        	 H=H+phone;
	        	 phone++;
	        	 if(H>max_H)
	        	 {
	        		 System.out.println("Aayush");
	        		 break;
	        	 }
	         }
		}
	}
}
