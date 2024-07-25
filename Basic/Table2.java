package Basic;

import java.util.Scanner;

public class Table2 {
	public static void main(String[] args) {
		 Scanner s=new Scanner(System.in);
	     int num=s.nextInt();
			    int n1=s.nextInt();
			    int mult=1;
			   
			    while(n1>=mult)
			    {
			    	
			       int  multiple=mult*num;
			        System.out.println(multiple);
				    mult++;
	            }
	}

}
