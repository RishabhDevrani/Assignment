package Basic;

import java.util.Scanner;

public class LCM {
	public static void main(String[] args) {
		 Scanner s=new Scanner(System.in);
	        int num1=s.nextInt();
	        int num2=s.nextInt();
	        if(num1>num2)
			{
				int temp=num2;
				num2=num1;
				num1=temp;
			}
			int lcm=num2;
			while(lcm>0)
			{
				if(lcm%num2==0&&lcm%num1==0)
				{
					break;
				}
				lcm++;
			}
			System.out.println(lcm);

	}

}
