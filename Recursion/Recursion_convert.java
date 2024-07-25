package Recursion;
import java.util.*;
public class Recursion_convert {
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	 //System.out.println("Enter a number in form of a String:");
     String input = s.nextLine();
     int result = convertToInteger(input);
     System.out.println(result);
 }
 public static int convertToInteger(String str) {
     if (str.length() == 0) {
         return 0;
     }
     int digit = Character.getNumericValue(str.charAt(0));
     return digit * (int) Math.pow(10, str.length() - 1) + convertToInteger(str.substring(1));
	}
}
