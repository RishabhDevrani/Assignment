package Recursion;
import java.util.*;
import java.util.ArrayList;
public class Subsequences {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int N = s.nextInt();
        s.nextLine(); // Consume the newline
        for (int i = 0; i < N; i++) {
            String str = s.nextLine();
            printSubsequences(str);
        }
    }

    public static void printSubsequences(String str) {
        ArrayList<String> subsequences = generateSubsequences(str);
        Collections.sort(subsequences);
        for (String subsequence : subsequences) {
            System.out.println(subsequence);
        }
    }
    public static ArrayList<String> generateSubsequences(String str) {
        ArrayList<String> subsequences = new ArrayList<>();
        generateSubsequencesHelper(str, 0, "", subsequences);
        return subsequences;
    }
    public static void generateSubsequencesHelper(String str,int index,String current,ArrayList<String>subsequences) {
        if (index==str.length()) {
            if (!current.isEmpty()) {
                subsequences.add(current);
            }
            return;
        }
        generateSubsequencesHelper(str,index+1,current+str.charAt(index),subsequences);
        generateSubsequencesHelper(str,index+1,current,subsequences);
	}
}