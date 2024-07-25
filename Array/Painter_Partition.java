package Array;

import java.util.Scanner;

public class Painter_Partition {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();
        int N = scanner.nextInt();
        int[] boards = new int[N];
        int maxBoard = 0;
        long sum = 0;

        for (int i = 0; i < N; i++) {
            boards[i] = scanner.nextInt();
            sum += boards[i];
            maxBoard = Math.max(maxBoard, boards[i]);
        }

        long low = maxBoard;
        long high = sum;
        long result = -1;

        while (low <= high) {
            long mid = low + (high - low) / 2;

            if (isPossible(boards, K, mid)) {
                result = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        System.out.println(result);
    }

    private static boolean isPossible(int[] boards, int K, long target) {
        int painters = 1;
        long currentBoardLength = 0;

        for (int board : boards) {
            if (currentBoardLength + board > target) {
                painters++;
                currentBoardLength = board;
                if (painters > K) {
                    return false;
                }
            } else {
                currentBoardLength += board;
            }
        }

        return true;
	}

}
