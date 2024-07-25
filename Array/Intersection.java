package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Intersection {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr1[] = new int[n];
		int arr2[] = new int[n];

		int i = 0;
		while (i < n) {
			arr1[i] = sc.nextInt();
			i++;
		}

		int j = 0;
		while (j < n) {
			arr2[j] = sc.nextInt();
			j++;
		}
//		System.out.println(Arrays.toString(arr1));                      
//		System.out.println(Arrays.toString(arr2));                      
		intersection(arr1, arr2, n);
	}

	public static void intersection(int arr1[], int arr2[], int n) {
		int[] copy = new int[n];
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		int i = 0;
		int j = 0;
		int cnt = 0;
		while (i < n && j < n) {

			if (arr1[i] == arr2[j]) {
				copy[cnt] = arr1[i];
				cnt++;

				i++;
				j++;
			} else if (arr1[i] > arr2[j]) {
				j++;

			} else if (arr1[i] < arr2[j]) {
				i++;
			}
		}
		int x = 0;
		System.out.print("[");
		while (x < cnt) {
			if (x == cnt - 1) {

				System.out.print(copy[x]);
			} else {
				System.out.print(copy[x] + ", ");
			}
			x++;
		}
		System.out.print("]");
	}

}
