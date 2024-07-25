package Array;

import java.util.Scanner;

public class Times_ali {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int x = scn.nextInt();
		int[] arr = new int[x];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();

		}
		int ali = scn.nextInt();
		int cnt = 0;
		for (int j = 0; j < arr.length; j++) {
			if (arr[j] == ali) {
				cnt++;
			}

		}
		System.out.println(cnt);
	}

}
