package Basic;

import java.util.Scanner;

public class GCD {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
        int num1=s.nextInt();
        int num2=s.nextInt();
        int divisor=num1;
        int dividend=num2;
        while(divisor>0)
        {
            int rem=dividend%divisor;
            dividend=divisor;
            divisor=rem;
        }
        System.out.println(dividend);

	}

}
