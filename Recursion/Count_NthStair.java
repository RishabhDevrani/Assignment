package Recursion;
import java.util.*;
public class Count_NthStair {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		System.out.println(ways(N));
	}
	public static int ways(int N)
	{
		if(N<=1)
		{
			return 1;
		}
		return (N/2+1);
	}
}
