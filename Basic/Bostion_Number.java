package Basic;

import java.util.Scanner;

public class Bostion_Number {
	public static void main(String[] args) {
		 Scanner s=new Scanner(System.in);
			int num=s.nextInt();
			//System.out.println(num);
			int backup=num;
			int sumOfDigit=0;
			while(num>0)
			{
				sumOfDigit=sumOfDigit+(num%10);
				num=num/10;
			}
			num=backup;
			int div=2;
			int sumOfFac=0;
			while(num>1)
			{
				if(num%div==0)
				{
				//	System.out.println(div);
					num=num/div;
					int div_copy=div;
					while(div_copy>0)
					{
						int dig=div_copy%10;
						sumOfFac=sumOfFac+dig;
						div_copy=div_copy/10;			
					}
				} else {
					div++;
				}
			}
			//System.out.println(sumOfDigit);
			if(sumOfDigit==sumOfFac)
			{
				System.out.println("1");
			}
			else
			{
	           System.out.println("0");
		}  
	}
}
