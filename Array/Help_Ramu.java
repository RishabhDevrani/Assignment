package Array;

import java.util.Scanner;

public class Help_Ramu {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();

		while (t-- > 0) {
			int c1 = scanner.nextInt();
			int c2 = scanner.nextInt();
			int c3 = scanner.nextInt();
			int c4 = scanner.nextInt();
			int n = scanner.nextInt();
			int m = scanner.nextInt();

			int[] rickshawUsage = new int[n];
			int[] cabUsage = new int[m];

			for (int i = 0; i < n; i++) {
				rickshawUsage[i] = scanner.nextInt();
			}

			for (int i = 0; i < m; i++) {
				cabUsage[i] = scanner.nextInt();
			}

			int rickshawCost = 0;
			int cabCost = 0;

			for (int i = 0; i < n; i++) {
				rickshawCost += Math.min(rickshawUsage[i] * c1, c2);
			}

			rickshawCost = Math.min(rickshawCost, c3);

			for (int i = 0; i < m; i++) {
				cabCost += Math.min(cabUsage[i] * c1, c2);
			}

			cabCost = Math.min(cabCost, c3);

			int totalCost = Math.min(rickshawCost + cabCost, c4);
			System.out.println(totalCost);
		}

	}

}
