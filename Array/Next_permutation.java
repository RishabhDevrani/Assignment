package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Next_permutation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int t = 0; t < T; t++) {
			int N = sc.nextInt();
			int[] arr = new int[N];

			for (int i = 0; i < N; i++) {
				arr[i] = sc.nextInt();
			}

			if (nextPermutation(arr)) {
				for (int i = 0; i < N; i++) {
					System.out.print(arr[i] + " ");
				}
				System.out.println();
			} else {

				Arrays.sort(arr);
				for (int i = 0; i < N; i++) {
					System.out.print(arr[i] + " ");
				}
				System.out.println();
			}
		}
	}

	public static boolean nextPermutation(int[] arr) {
		int N = arr.length;
		int i = N - 2;

		while (i >= 0 && arr[i] >= arr[i + 1]) {
			i--;
		}

		if (i < 0) {
			return false;
		}

		int j = N - 1;
		while (arr[j] <= arr[i]) {
			j--;
		}

		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;

		int left = i + 1;
		int right = N - 1;
		while (left < right) {
			int temp2 = arr[left];
			arr[left] = arr[right];
			arr[right] = temp2;
			left++;
			right--;
		}
		return true;

	}

}
