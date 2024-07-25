package Recursion;

import java.util.*;

public class Recursion_keypadcode {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		System.out.println();
		printWords(input, "", 0);
		System.out.println();
		System.out.println(countWords(input, 0));
		s.close();
	}

	public static String[] keypad = { "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wx", "yz" };

	public static void printWords(String str, String current, int index) {
		if (index == str.length()) {
			System.out.print(current + " ");
			return;
		}

		String letters = keypad[str.charAt(index) - '1'];

		for (char letter : letters.toCharArray()) {
			printWords(str, current + letter, index + 1);
		}
	}

	public static int countWords(String str, int index) {
		if (index == str.length()) {
			return 1;
		}
		String letters = keypad[str.charAt(index) - '1'];
		int count = 0;
		for (char letter : letters.toCharArray()) {
			count += countWords(str, index + 1);
		}
		return count;
	}
}