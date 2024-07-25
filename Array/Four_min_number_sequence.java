package Array;

import java.util.Scanner;

public class Four_min_number_sequence {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		while (n > 0) {
			String str = scn.next();
			incdec(str);
			n--;
		}
	}

	public static void incdec(String str) {
		int[] arr = new int[str.length() + 1];
		int ans = 1;
		int cntd = 0;
		for (int i = 0; i <= str.length(); i++) {
			if (i == str.length() || str.charAt(i) == 'I') {
				int idx = i;
				for (int cnt = 1; cnt <= cntd + 1; cnt++) {
					arr[idx] = ans;
					idx--;
					ans++;
				}
				cntd = 0;
			} else if (str.charAt(i) == 'D') {
				cntd++;
			}
		}
		for (int ali : arr) {
			System.out.print(ali);
		}
		System.out.println();
	}

}
