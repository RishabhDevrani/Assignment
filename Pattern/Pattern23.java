package Pattern;

public class Pattern23 {
	public static void main(String[] args) {
		int num=5;
		int row=1;
		int tot_sp=num-1;
		int tot_num=1;
		while(row<=num)
		{
			int cnt_sp=0;
			while(cnt_sp<tot_sp)
			{
				System.out.print("  ");
				cnt_sp++;
			}
			int cnt_num=0;
			while(cnt_num<tot_num)
			{
				System.out.print("1 ");
				cnt_num++;
			}
			row++;
			System.out.println();
			tot_sp--;
			tot_num=tot_num+2;
		}
	}

}
