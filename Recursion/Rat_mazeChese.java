package Recursion;
import java.util.*;
public class Rat_mazeChese {
	static boolean flag;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        char[][] maze = new char[n][m];

        for (int i = 0; i < maze.length; i++) {
                String str = sc.next();
                for (int j = 0; j < str.length(); j++) {
                        maze[i][j] = str.charAt(j);
                }
        }
        int[][] ans = new int[n][m];
        ratWay(maze,0,0,ans);

        if (flag==false)
                System.out.println("NO PATH FOUND");
}

public static void ratWay(char[][] maze,int cr,int cc,int[][] ans) {
        if (cr==maze.length-1&&cc==maze[0].length-1&&maze[cr][cc]!='X') {
                ans[cr][cc] = 1;
                display(ans);
                flag = true;
                return;
        }

        if (cc<0||cr<0||cc>=maze[0].length||cr>=maze.length||maze[cr][cc] == 'X')
                return;
        maze[cr][cc]='X';
        ans[cr][cc]=1;
        ratWay(maze,cr+1,cc,ans);
        ratWay(maze,cr-1,cc,ans);
        ratWay(maze,cr,cc+1,ans);
        ratWay(maze,cr,cc-1,ans);
        maze[cr][cc] = 'O';
        ans[cr][cc] = 0; 
}
public static void display(int ans[][])
{
	for(int i=0;i<ans.length;i++)
	{
		for(int j=0;j<ans[0].length;j++)
		{
			System.out.print(ans[i][j]+" ");
		}
		System.out.println();
	}
}
}