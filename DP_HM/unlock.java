package DP_HM;

import java.util.HashMap;
import java.util.Scanner;

public class unlock {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int K = s.nextInt();
		int arr[] = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = s.nextInt();
		}
		HashMap<Integer, Integer> HM = new HashMap<>();
		for (int i = 0; i < N; i++) {
			HM.put(arr[i], i);
		}
		int remain = K;
		int current = N;
		for (int i = 0; i < N && remain > 0; i++) {
			int currentindex = HM.get(current);
			if (currentindex != i) {
				HM.put(arr[i], currentindex);
				HM.put(current, i);
				int temp = arr[i];
				arr[i] = arr[currentindex];
				arr[currentindex] = temp;
				remain--;
			}
			current--;
		}
		for (int ali : arr) {
			System.out.print(ali + " ");
		}
	}
}