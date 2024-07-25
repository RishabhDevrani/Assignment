package Array;

import java.util.Scanner;

public class Max_circular_sum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int[] nums = new int[n];
			for (int i = 0; i < n; i++) {
				nums[i] = sc.nextInt();
			}
			int maxCircularSum = maxCircularSubarraySum(nums);
			System.out.println(maxCircularSum);
		}
	}

	public static int maxCircularSubarraySum(int[] nums) {
		int maxStraightSum = maxSubarraySum(nums);
		int totalSum = 0;
		for (int i = 0; i < nums.length; i++) {
			totalSum += nums[i];
			nums[i] = -nums[i];
		}
		int maxCircularSum = totalSum + maxSubarraySum(nums);
		return (maxCircularSum > maxStraightSum) ? maxCircularSum : maxStraightSum;
	}

	public static int maxSubarraySum(int[] nums) {
		int maxSum = nums[0];
		int currentSum = nums[0];
		for (int i = 1; i < nums.length; i++) {
			currentSum = Math.max(nums[i], currentSum + nums[i]);
			maxSum = Math.max(maxSum, currentSum);
		}
		return maxSum;
	}

}
