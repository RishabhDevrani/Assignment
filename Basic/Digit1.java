package Basic;

import java.util.Scanner;

public class Digit1 {
	public static void main(String[] args) {
		 Scanner s=new Scanner(System.in);        
         long nod=s.nextInt();
         long sum=0;
         long mult=1;
         while(nod>0)
         {
             int digit=s.nextInt();
             sum=sum+digit*mult;
             mult=mult*10;
             nod=nod-1;
         }
         System.out.println(sum);
	}

}
