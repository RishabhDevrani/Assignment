package Array;

import java.util.Scanner;

public class Icecream {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int size = scn.nextInt();

		int[] arr = new int[size];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}

		int cnt = -1;
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];

			}

		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == min) {
				System.out.print(i + 1);

			}
		}
	}
}
