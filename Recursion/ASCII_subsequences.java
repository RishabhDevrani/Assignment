package Recursion;
import java.util.*;
public class ASCII_subsequences {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        //System.out.println("Enter the string:");
        String input = scanner.nextLine();

        //System.out.println("ASCII Subsequences:");
        printASCIISubsequences(input, 0, "");
        //System.out.println("Number of ASCII Subsequences:");
        System.out.println();
        System.out.println(countASCIISubsequences(input, 0, ""));
    }

    public static void printASCIISubsequences(String input, int index, String output) {
        if (index == input.length()) {
            System.out.print(output + " ");
            return;
        }

        char ch = input.charAt(index);
        printASCIISubsequences(input, index + 1, output);
        printASCIISubsequences(input, index + 1, output + ch);
        printASCIISubsequences(input, index + 1, output + (int) ch);
    }

    public static int countASCIISubsequences(String input, int index, String output) {
        if (index == input.length()) {
            return 1;
        }

        char ch = input.charAt(index);
        return countASCIISubsequences(input, index + 1, output)
        		+countASCIISubsequences(input, index + 1, output + ch)
        		+countASCIISubsequences(input, index + 1, output + (int) ch);
	}
}
