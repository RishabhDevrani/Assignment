package Pattern;

public class Pattern8 {
	public static void main(String[] args) {
		int row=1;
		int num=5;
		while(row<=num)
		{
			int cnt_st=0;
			while(cnt_st<num)
			{
				if(row==cnt_st+1||row+cnt_st==num)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
				cnt_st++;
			}
			System.out.println();
			row++;
		}
	}

}
