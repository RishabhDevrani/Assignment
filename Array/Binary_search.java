package Array;

import java.util.Scanner;

public class Binary_search {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        int M = sc.nextInt();
        int result = binarySearch(arr, M);
        if (result == -1) {
            System.out.println();
        } 
         {
            System.out.println(result);
        }
}
public static int binarySearch(int[] arr, int target) {
    int left = 0;
    int right = arr.length - 1;
    int comparisons = 0;
    while (left <= right && comparisons < 10) {
        int mid = left + (right - left) / 2;
        comparisons++;
        if (arr[mid] == target) {
            return mid; 
        }
        else if (arr[mid] < target) {
            left = mid + 1;
        } else {
            right = mid - 1;
        }
    }
    return -1; 
	}

}
