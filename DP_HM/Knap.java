package DP_HM;
import java.util.Scanner;
public class Knap {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		int S=s.nextInt();
		int size[]=new int[N];
		int values[]=new int[N];
		for(int i=0;i<N;i++)
		{
			size[i]=s.nextInt();
		}
		for(int i=0;i<N;i++)
		{
			values[i]=s.nextInt();
		}
		int dp[][]=new int[N+1][S+1];
		for(int i=1;i<=N;i++)
		{
			for(int j=1;j<=S;j++)
			{
				if(size[i-1]>j)
				{
					dp[i][j]=dp[i-1][j];
				}
				else
				{
					dp[i][j]=Math.max(dp[i-1][j], values[i-1]+dp[i-1][j-size[i-1]]);
				}
			}
		}
		System.out.println(dp[N][S]);
	}
}