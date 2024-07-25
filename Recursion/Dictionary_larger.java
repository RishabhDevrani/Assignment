package Recursion;
import java.util.*;
import java.util.Arrays;
public class Dictionary_larger
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String input = s.next();
        char[] charArray = input.toCharArray();
        Arrays.sort(charArray);
        String sortedInput = new String(charArray);
        generateWords(sortedInput, "", input);
    }
    public static void generateWords(String remaining, String current, String original) {
        if (current.length() == original.length() && current.compareTo(original) > 0) {
            System.out.println(current);
        } else {
            for (int i = 0; i < remaining.length(); i++) {
                String newRemaining = remaining.substring(0, i) + remaining.substring(i + 1);
                generateWords(newRemaining, current + remaining.charAt(i), original);
            }
        }
     }
}