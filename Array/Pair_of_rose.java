package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Pair_of_rose {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int T = s.nextInt();
		while (T > 0) {
			T--;
			int arr[] = new int[s.nextInt()];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = s.nextInt();
			}
			int A = s.nextInt();
			solve2(arr, A);
		}
	}

	public static void solve2(int arr[], int A) {
		Arrays.sort(arr);
		int s = 0;
		int e = arr.length - 1;
		int r1 = 0;
		int r2 = 0;
		while (s < e) {
			if (arr[s] + arr[e] == A) {
				r1 = arr[s];
				r2 = arr[e];
				s++;
				e--;
			} else if (arr[s] + arr[e] < A) {
				s++;
			} else {
				e--;
			}
		}
		System.out.println("Deepak should buy roses whose prices are " + r1 + " and " + r2 + ".");
	}

	public static void solve(int arr[], int A) {
		int r1 = 0;
		int r2 = 0;
		int diff = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] + arr[j] == A) {
					if (Math.abs(arr[i] - arr[j]) < diff) {
						r1 = arr[i];
						r2 = arr[j];
						diff = Math.abs(arr[i] - arr[j]);
					}
				}
			}
		}
		System.out.println(
				"Deepak should buy roses whose prices are " + Math.min(r1, r2) + " and " + Math.max(r1, r2) + ".");

	}

}
