package Recursion;
import java.util.*;
import java.util.ArrayList;

public class Tower_of_hanoi {
	static ArrayList<Integer>A=new ArrayList<>();
	static ArrayList<Integer>B=new ArrayList<>();
	static ArrayList<Integer>C=new ArrayList<>();
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int disk=n;disk>=1;disk--)
		{
			A.add(disk);
		}
		//MOVE(n,A,B,C);
		MOVE(n,"A","B","C");
	}
    
    public static void MOVE(int n,String src,String dest,String helper)
    {
    	if(n==0)
    	{
    		return;
    	}
    	MOVE(n-1,src,helper,dest);
    	System.out.println("Moving ring "+n+" from "+src+" to "+dest);
    	//print();
    	MOVE(n-1,helper,dest,src);
    }
	
}
