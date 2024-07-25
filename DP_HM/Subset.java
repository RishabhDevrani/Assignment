package DP_HM;
import java.util.Scanner;
public class Subset {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		int Sum=s.nextInt();
		int arr[]=new int[N];
		for(int i=0;i<N;i++)
		{
			arr[i]=s.nextInt();
		}
		boolean result=SubsetSum(arr,N,Sum);
		{
			if(result)
			{
				System.out.println("Yes");
			}
			else
			{
				System.out.println("No");
			}
		}
	}
		public static boolean SubsetSum(int arr[],int N,int Sum)
		{
			boolean dp[][]=new boolean[N+1][Sum+1];
			for(int i=0;i<N;i++)
			{
				dp[i][0]=true;
			}
			for(int i=1;i<=N;i++)
			{
				for(int j=1;j<=Sum;j++)
				{
					if(arr[i-1]<=j)
					{
						dp[i][j]=dp[i-1][j] || dp[i-1][j-arr[i-1]];
					}
					else
					{
						dp[i][j]=dp[i-1][j];
					}
				}
			}
			return dp[N][Sum];
	   }
}