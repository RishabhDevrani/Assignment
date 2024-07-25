package Basic;

import java.util.Scanner;

public class Print_Series {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		  int N1=s.nextInt();
		  int N2=s.nextInt();
		  int count=1;
		  int i=1;
		  while(count<=N1)
		  {
			  int eq=3*i+2;
			  int rem=eq%N2;
			  if(rem!=0)
			  {
				  System.out.println(eq);
				  count++;
			  }
			  i++;
		  }
	}

}
