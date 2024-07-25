package Pattern;

public class Pattern2 {
	public static void main(String[] args) {
		int num=5;
		int row=1;
		while(row<=num)
		{
			int cnt_st=0;
			int tot_st=row;
			while(cnt_st<tot_st)
			{
				System.out.print("* ");
				cnt_st++;
			}
			System.out.println();
			row++;
		}
		
	}

}
