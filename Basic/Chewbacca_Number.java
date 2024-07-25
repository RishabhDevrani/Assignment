package Basic;

import java.util.Scanner;

public class Chewbacca_Number {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		long num=s.nextLong();
				long ans=0;
				long mult=1;
				while(num>0)
				{
					int t=(int)(num%10);
					if(num!=9 && 9-t<t) 
					{
						t=9-t;
					}
					num=num/10;
					ans=ans+t*mult;
					mult=mult*10;
				}
				System.out.println(ans);
	}

}
