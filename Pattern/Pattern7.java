package Pattern;

public class Pattern7 {
	public static void main(String[] args) {
		int num=5;
		int row=1;
		while(row<=num)
		{
			int cnt_st=0;
			while(cnt_st<num)
			{
				if(row==1||row==num||cnt_st==0||cnt_st==num-1)
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
