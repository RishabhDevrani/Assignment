package Recursion;
import java.util.*;
public class Count_recurrence {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
        String inputString = s.nextLine();
        char characterToCount = s.next().charAt(0);
        int count = countOccurrences(inputString, characterToCount, 0);
        System.out.println(count);
    }

    private static int countOccurrences(String str, char target, int index) {
        if (index >= str.length()) {
            return 0;
        }
        int currentCount = (str.charAt(index) == target) ? 1 : 0; 
        return currentCount + countOccurrences(str, target, index + 1);
    }
}
