package Basic;

import java.util.Scanner;

public class Binary_decimal {
	public static void main(String[] args) {
		 Scanner s=new Scanner(System.in);
			int num=s.nextInt();
			int binary_num;
			int decimal_num=0;
		    int base=1;
		    int rem;
		    binary_num=num;
		    while ( num > 0)  
		    {  
		        rem = num % 10;   
		        decimal_num = decimal_num + rem * base;  
		        num = num / 10; 
		        base = base * 2;  
		    }  
		  System.out.println(decimal_num);
	}

}
