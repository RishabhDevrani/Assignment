package Basic;

import java.util.Scanner;

public class Armstrong {
	public static void main(String[] args) {
		 Scanner s=new Scanner(System.in);
	      int N=s.nextInt();
			int r=0;
			int digit=0;
			int x=N;
			int sum=0;
			int ans=0;
			int num=N;
			while(x>0)
			{
				int rem=x%10;
				digit++;
				x=x/10;
			}
			while(N!=0)
			{
				r=N%10;
				ans=(int) Math.pow(r, digit);
				N=N/10;
				sum=sum+ans;
			}
			if(sum==num)
			{
				System.out.println("true");
			}
			else
			{
				System.out.println("false");
			}
	}
}
