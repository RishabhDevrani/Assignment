package Recursion;
import java.util.*;
public class N_Knight
{
	public static void main(String[] args) {
		 Scanner s=new Scanner(System.in);
			int n=s.nextInt();
			boolean visited[][]=new boolean[n][n];
			System.out.println("\n"+place(0,0,n,n,"",visited));
		}
		public static int place(int i,int j,int n,int KTP,String path,boolean[][] visited)
		{
			if(KTP==0)
			{
				System.out.print(path+" ");
				return 1;
			}
			if(j==n)
			{
				i++;
				j=0;
			}
			if(i==n)
			{
				return 0;
			}
			int sp1=0;
			if(isSafe(visited,i,j))
			{
				visited[i][j]=true;
				sp1+=place(i,j+1,n,KTP-1,path+"{"+i+"-"+j+"} ",visited);
				visited[i][j]=false;
			}
			sp1+=place(i,j+1,n,KTP,path,visited);
			return sp1;
		}
		private static boolean isSafe(boolean[][] visited, int i, int j) {
			int t1=i;
			int t2=j;
			if(t1-2>=0&&t2-1>=0)
			{
				if(visited[t1-2][t2-1])
				{
			     return false;
				}
			if(t1-1>=0&&t2-2>=0)
			{
				if(visited[t1-1][t2-2])
				{
					return false;
				}
			if(t1-1>=0&&t2+2<visited.length)
			{
				if(visited[t1-1][t2+2])
				{
					return false;
				}
			if(t1-2>=0&&t2+1<visited.length)
			{
				if(visited[t1-2][t2+1])
				{
					return false;
				}
			}
		}
	}
}
	return true;
	}
}