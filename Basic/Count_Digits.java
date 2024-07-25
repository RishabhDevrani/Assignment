package Basic;

import java.util.Scanner;

public class Count_Digits {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int item = sc.nextInt();
		countDigit(num, item);
	}

	public static void countDigit(int num, int item) {
		int count = 0;
		while(num != 0) {
		int n = num % 10;
		if (n == item) {
			count++;
		}
		num /= 10;
		}
		System.out.print(count);
	}
}
