package Recursion;
import java.util.Scanner;
public class maximum_swaps {
	static String max;
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.next();
		int k=s.nextInt();
		max=str;
		findmaximum(str.toCharArray(),k);
		System.out.println(max+"\n");
	}
	public static void findmaximum(char str[],int k)
	{
		if(k==0)
		{
			return;
		}
		int n=str.length;
		for(int i=0;i<n-1;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(str[i]<str[j])
				{
					char t=str[i];
					str[i]=str[j];
					str[j]=t;
					if(String.valueOf(str).compareTo(max)>0)
					max=String.valueOf(str);
					findmaximum(str,k-1);
					char c=str[i];
					str[i]=str[j];
					str[j]=c;
				}
			}
		}
	}
}