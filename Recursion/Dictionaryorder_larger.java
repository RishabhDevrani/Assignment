package Recursion;
import java.util.*;
public class Dictionaryorder_larger {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String input = s.nextLine();
	    printLexicographicallySmallerWords(input, "");
  }
	    public static void printLexicographicallySmallerWords(String remaining, String current) {
	        if (remaining.length() == 0) {
	            System.out.println(current);
	            return;
	        }
	        for (int i = 0; i < remaining.length(); i++) {
	            char chosen = remaining.charAt(i);
	            String newRemaining = remaining.substring(0, i) + remaining.substring(i+1);
	            printLexicographicallySmallerWords(newRemaining, current + chosen);
	    }
    }
}