package Array;

import java.util.Scanner;

public class Nthroot {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int T = s.nextInt();
		while (T > 0) {
			int N = s.nextInt();
			int M = s.nextInt();
			System.out.println(rootmn(N, M));
			T--;
		}
	}

	public static int rootmn(int N, int M) {
		int s = 1;
		int e = M;
		int ans = -1;
		int x = 0;
		while (s <= e) {
			x = (s + e) / 2;
			if (Math.pow(x, N) <= M) {
				ans = x;
				s = x + 1;
			} else {
				e = x - 1;
			}
		}
		if (Math.pow(ans, N) == M) {
			return ans;
		} else {
			return -1;
		}
	}
}
