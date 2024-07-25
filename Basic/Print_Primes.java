package Basic;

import java.util.Scanner;

public class Print_Primes {
	public static void main(String[] args) {
		 Scanner s=new Scanner(System.in);
         int N=s.nextInt();
         int n=2;
         int count=0;
         while(n<=N)
         {
             int i=1;
             while(i<=n)
             {
                 if(n%i==0)
                 {
                     count++;
                 }
                 i++;
             }
             if(count==2)
             {
                 System.out.println(n);
             }
             n++;
             count=0;
         }
	}

}
