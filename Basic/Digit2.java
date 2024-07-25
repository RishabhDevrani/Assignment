package Basic;

import java.util.Scanner;

public class Digit2 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
	     long n=s.nextLong();
	     long cnt=1;
	     long ans=0;
	     long mult=(long)Math.pow(10,n-1);
	     while(cnt<=n)
	     {
	         long digit=s.nextInt();
	         ans=ans+digit*mult;
	         mult=mult/10;
	         cnt++;
	     }   
	     System.out.println(ans);
	}

}
