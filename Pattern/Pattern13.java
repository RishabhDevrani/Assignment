package Pattern;

public class Pattern13 {
	public static void main(String[] args) {
		int num=5;
		int row=1;
		int tot_st=1;
		while(row<=2*num-1)
		{
			int cnt_st=0;
			while(cnt_st<tot_st)
			{
				System.out.print("* ");
				cnt_st++;
			}
			row++;
			if(row<=num)
			{
				tot_st++;
			}
			else
			{
				tot_st--;
			}
			System.out.println();
		}
	}

}
