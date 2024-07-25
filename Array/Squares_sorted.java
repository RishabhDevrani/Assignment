package Array;

import java.util.Scanner;

public class Squares_sorted {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int sortedArray[] = new int[size];
		for (int i = 0; i < sortedArray.length; i++) {
			sortedArray[i] = s.nextInt();
		}
		// int sortedArray[]= {-4 ,-1, 0, 3, 10};
		int[] squaredArray = sortedSquares(sortedArray);
		for (int num : squaredArray) {
			System.out.print(num + " ");
		}
	}

	public static int[] sortedSquares(int sortedArray[]) {
		int n = sortedArray.length;
		int result[] = new int[n];
		int left = 0;
		int right = n - 1;
		int index = n - 1;
		while (left <= right) {
			int leftsquare = sortedArray[left] * sortedArray[left];
			int rightsquare = sortedArray[right] * sortedArray[right];
			if (leftsquare > rightsquare) {
				result[index] = leftsquare;
				left++;
			} else {
				result[index] = rightsquare;
				right--;
			}
			index--;
		}
		return result;
	}
}
