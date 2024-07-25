package Basic;

import java.util.Scanner;

public class Prime_Factor2 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
	    int n=s.nextInt();
	    int div = 2;
			int count = 0;
			while (n!= 1) {
				if (n % div == 0) {
					n = n / div;
					count++;
				} else {
					if (count > 0) {
					System.out.print(div);
					}
					count = 0;
					div++;
				}
			}
			if (count > 0) {
				System.out.print(div);
			}
	}

}
