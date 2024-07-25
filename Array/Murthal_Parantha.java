package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Murthal_Parantha {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Input: Number of paranthas
		int P = scanner.nextInt();

		// Input: Number of cooks
		int L = scanner.nextInt();

		// Input: Ranks of cooks
		int[] ranks = new int[L];
		for (int i = 0; i < L; i++) {
			ranks[i] = scanner.nextInt();
		}

		// Sorting ranks in ascending order
		Arrays.sort(ranks);

		// Calculate minimum time needed
		int time = findMinimumTime(P, ranks);

		// Output: Minimum time needed
		System.out.println(time);

		// Close scanner
		scanner.close();
	}

	public static int findMinimumTime(int P, int[] ranks) {
		int low = 0;
		int high = 100000; // A large upper limit to find the minimum time

		while (low < high) {
			int mid = low + (high - low) / 2;

			if (canCookInTime(P, ranks, mid)) {
				high = mid;
			} else {
				low = mid + 1;
			}
		}

		return low;
	}

	public static boolean canCookInTime(int P, int[] ranks, int time) {
		int paranthasCooked = 0;

		for (int i = 0; i < ranks.length; i++) {
			int rank = ranks[i];
			int cooked = 0;
			int j = 1;

			while (cooked + (j * rank) <= time) {
				cooked += (j * rank);
				j++;
				paranthasCooked++;

				if (paranthasCooked >= P) {
					return true;
				}
			}
		}

		return false;
	}

}
