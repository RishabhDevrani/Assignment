package Recursion;
import java.util.*;
public class String_reverseword {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String input= s.nextLine();
		String reversedString = reverseWords(input);
        System.out.println(reversedString);
    }
    public static String reverseWords(String s) {
        String[] words = s.split("\\s+");
        int left = 0;
        int right = words.length - 1;
        while (left < right) {
            String temp = words[left];
            words[left] = words[right];
            words[right] = temp;
            left++;
            right--;
        }
        String reversedString = String.join(" ", words);
        return reversedString;
	}
}