package Basic;

import java.util.Scanner;

public class Nth_Fibo {
	public static void main(String[] args) {
		 Scanner s=new Scanner(System.in);
	        int num=s.nextInt();
	        int count=1;
	        int a=0;
	        int b=1;
	        int c=0;

	        while(count<=num)
	        {
	            c=a+b;
	       //     System.out.println(b);
	            a=b;
	            b=c;
	            count++;

	        }
	        System.out.println(a);
	}

}
