package Pattern;

public class Pattern29 {
	public static void main(String[] args) {
		int num=5;
		int row=1;
		int tot_sp=num-1;
		int tot_st=1;
		int n;
		int zero=0;
		while(row<=num)
		{
			n=row;
			int cnt_sp=1;
			while(cnt_sp<=tot_sp)
			{
				System.out.print("  ");
				cnt_sp++;
			}
			int cnt_st=1;
			while(cnt_st<=tot_st)
			{
				if(cnt_st==1||cnt_st==tot_st)
				{
					System.out.print(n+" ");
				}
				else
				{
					System.out.print(zero+" ");
				}
				cnt_st++;
			}
			System.out.println();
			row++;
			tot_sp--;
			tot_st=tot_st+2;
		}
	}

}
