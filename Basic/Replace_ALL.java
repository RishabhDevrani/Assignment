package Basic;

import java.util.Scanner;

public class Replace_ALL {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
	     long num=s.nextLong();
	     long ans=0;
	     long mult=1;
	     while(num>0)
	     {
	         long digit=num%10;
	         if(digit==0)
	         {
	             digit=5;
	         }
	         ans=ans+digit*mult;
	         mult=mult*10;
	         num=num/10;
	     }
	     if(ans==0)
	     {
	         ans=5;
	     }
	     System.out.println(ans);
	}

}
