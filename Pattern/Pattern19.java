package Pattern;

public class Pattern19 {
	public static void main(String[] args) {
		int n=7;
		int row=1;
		int tot_sp=-1;
		int tot_st=n/2+1;
		while(row<=n)
		{
			int cnt_st1=0;
			while(cnt_st1<tot_st)
			{
				System.out.print("* ");
				cnt_st1++;
			}
			int cnt_sp=0;
			while(cnt_sp<tot_sp)
			{
				System.out.print("  ");
				cnt_sp++;
			}
			int cnt_st2=0;
			if(row==1 || row==n)
			{
				cnt_st2++;
			}
			while(cnt_st2<tot_st)
			{
				System.out.print("* ");
				cnt_st2++;
			}
			System.out.println();
			row++;
			if(row<=n/2+1)
			{
				tot_st--;
				tot_sp=tot_sp+2;
			}
			else
			{
				tot_st++;
				tot_sp=tot_sp-2;
			}
		}
	}
}
