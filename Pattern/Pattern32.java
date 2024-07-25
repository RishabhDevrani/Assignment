package Pattern;

public class Pattern32 {
	public static void main(String[] args) {
		int num=5;
		int row=1;
		int tot_st=1;
		int c=row;
		while(row<=2*num-1)
		{
			int cnt_st=0;
			while(cnt_st<tot_st)
			{
				if(cnt_st%2!=0)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print(c+" ");
				}
				cnt_st++;
			}
			row++;
			if(row<=num)
			{
				c++;
				tot_st=tot_st+2;
			}
			else
			{
				c--;
				tot_st=tot_st-2;
			}
			System.out.println();
		}
	}

}
