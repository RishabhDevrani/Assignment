package Array;

import java.util.Scanner;

public class Target_Sum_Pairs {
	public static void main() {
		
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	if (n > 1 && n < 1000) {
	int[] arr = new int[n];
	for (int i = 0; i < arr.length; i++) {
	arr[i] = sc.nextInt();
	}
	int target = sc.nextInt();
	targetSum(arr, target);
	}
	}

	public static void insertion(int[] arr) {
		for (int counter = 1; counter <= arr.length - 1; counter++) {
			int val = arr[counter];
			int j = counter - 1;
			while (j >= 0 && arr[j] > val) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = val;
		}
	}

	public static void targetSum(int[] arr, int target) {
		insertion(arr);
		
		int left = 0;
		int right = arr.length - 1;
		while (left < right) {
			int sum = arr[left] + arr[right];
			if (sum > target) {
				right--;
			} else if (sum < target) {
				left++;
			} else {
				System.out.println(arr[left] + " and " + arr[right]);
				left++;
				right--;
			}
		}
	}
}
