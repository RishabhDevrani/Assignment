package DP_HM;
import java.util.*;
public class K_LCS {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		int M=s.nextInt();
		int K=s.nextInt();
		int arr1[]=new int[N];
		for(int i=0;i<N;i++)
		{
			arr1[i]=s.nextInt();
		}
		int arr2[]=new int[M];
		for(int i=0;i<M;i++)
		{
			arr2[i]=s.nextInt();
		}
		int dp[][][]=new int[N+1][M+1][K+1];
		for(int i=0;i<=N;i++)
		{
			for(int j=0;j<=M;j++)
			{
				for(int l=0;l<=K;l++)
				{
					if(i==0||j==0)
					{
						dp[i][j][l]=0;
					}
					else
					{
						dp[i][j][l]=Math.max(dp[i-1][j][l], dp[i][j-1][l]);
						if(arr1[i-1]==arr2[j-1])
						{
							dp[i][j][l]=Math.max(dp[i][j][l], dp[i-1][j-1][l]+1);
						}
						if(l>0)
						{
							dp[i][j][l]=Math.max(dp[i][j][l], dp[i-1][j-1][l-1]+1);
						}
					}
				}
			}
		}
		System.out.println(dp[N][M][K]);
	}
}