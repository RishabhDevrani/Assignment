package Pattern;

public class Pattern15 {
	public static void main(String[] args) {
		int num=5;
		int row=1;
		int tot_st=num;
		int tot_sp=0;
		while(row<=2*num-1)
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
			row++;
			if(row<=num)
			{
				tot_sp=tot_sp+2;
				tot_st--;
			}
			else
			{
				tot_sp=tot_sp-2;
				tot_st++;
			}
			System.out.println();
	}
	}

}