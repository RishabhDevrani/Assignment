package Pattern;

public class Pattern1 {

	public static void main(String[] args) {
		int row=1;
		int num=5;
		while(row<=num)
		{
			int cnt_st=1;
			while(cnt_st<num)
			{
				cnt_st=cnt_st+1;
				System.out.print("*");
			}
			row=row+1;
			System.out.println();
		}

	}

}
