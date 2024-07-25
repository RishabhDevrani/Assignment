package Array;

import java.util.Scanner;

public class Running_Array {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = s.nextInt();
		}
		runningsum(arr);
	}

	public static void runningsum(int[] arr) {
		int runningSum = 0;
		int[] runningSums = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			runningSum = runningSum + arr[i];
			runningSums[i] = runningSum;
		}
		// System.out.println(runningSum);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(runningSums[i] + " ");
		}
	}
}
