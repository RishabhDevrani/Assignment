package Basic;

import java.util.Scanner;

public class Print_reverse {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        int reverse=0;
        while(num>0)
        {
            int digit=num%10;
            reverse=reverse*10+digit;
            num=num/10;
        }
        System.out.println(reverse);
	}

}
