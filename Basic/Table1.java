package Basic;

import java.util.Scanner;

public class Table1 {
	public static void main(String[] args) {
		 Scanner s=new Scanner(System.in);
	        int n1=s.nextInt();
	        int n2=s.nextInt();
	        int mult=1;
	        int num=1;
	        while(num<n2)
	        {
	            num=n1*mult;
	            if(num<=n2)
	            {
	                System.out.println(num);
	            }
	            mult++;
	        }
	}

}
