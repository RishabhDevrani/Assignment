package Basic;

import java.util.Scanner;

public class Decimal_Octal {
	public static void main(String[] args) {
		 Scanner s=new Scanner(System.in);
			int decimal=s.nextInt();
			int octal=0;
			int i=1;
			int rem;
			while(decimal>0)
			{
				rem=decimal%8;
				octal=octal+i*rem;
				decimal=decimal/8;
				i=i*10;
			}
	           System.out.println(octal);
	}

}
