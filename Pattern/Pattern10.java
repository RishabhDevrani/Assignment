package Pattern;

public class Pattern10 {
	public static void main(String[] args) {
		int row=1;
		int num=5;
		int tot_sp=0;
		int tot_st=2*num-1;
		while(row<=num)
		{
			int cnt_sp=0;
			while(cnt_sp<tot_sp)
			{
				System.out.print("  ");
				cnt_sp++;
			}
			int cnt_st=0;
			while(cnt_st<tot_st)
			{
				System.out.print("* ");
				cnt_st++;
			}
			tot_st=tot_st-2;
			tot_sp++;
			System.out.println();
			row++;
		}
	}

}
