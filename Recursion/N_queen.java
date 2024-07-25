package Recursion;

import java.util.Scanner;

public class N_queen {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] queens = new int[N];    
        int waysCount = countWays(queens, 0, N);
        printConfigurations(queens, 0, N);
        System.out.println();
        System.out.println(waysCount);
    }
    public static int countWays(int[] queens, int row, int N) {
        if (row == N) {
            return 1; 
        }

        int count = 0;
        for (int col = 0; col < N; col++) {
            if (isValid(queens, row, col)) {
                queens[row] = col;
                count = count + countWays(queens, row + 1, N);
            }
        }
        return count;
    }
    public static void printConfigurations(int[] queens, int row, int N) {
        if (row == N) {
            for (int i = 0; i < N; i++) {
                System.out.print("{" + (i + 1) + "-" + (queens[i] + 1) + "} ");
            }
            return;
        }
        for (int col = 0; col < N; col++) {
            if (isValid(queens, row, col)) {
                queens[row] = col; 
                printConfigurations(queens, row + 1, N);
            }
        }
    }
    public static boolean isValid(int[] queens, int row, int col) {
        for (int i = 0; i < row; i++) {
            if (queens[i] == col || queens[i] - i == col - row || queens[i] + i == col + row) {
                return false; 
            }
        }
        return true;
	}
}