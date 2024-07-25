package Array;

import java.util.Scanner;

public class Divisible_subarray {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		for (int i = 0; i < t; i++) {
			int n = scn.nextInt();
			int[] arr = new int[n];
			for (int j = 0; j < n; j++) {
				arr[j] = scn.nextInt();
			}
			System.out.println(divisibleSubArrays3(arr));
		}
	}

	public static long divisibleSubArrays3(int[] arr) {
		int n = arr.length;
		long[] mod = new long[n];
		mod[0]++;
		long ans = 0;
		long sum = 0;
		for (int i : arr) {
			sum = (sum + i) % n;
			if (sum < 0) {
				sum += n;
			}
			ans += mod[(int) sum];
			mod[(int) sum]++;
		}
		return ans;
	}

}
