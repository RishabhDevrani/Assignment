package Pattern;

public class Pattern24 {
	public static void main(String[] args) {
		int row=1;
		int num=5;
		int tot_sp=num-1;
		int tot_num=1;
		while(row<=num)
		{
			int cnt_sp=1;
			while(cnt_sp<=tot_sp)
			{
				System.out.print("  ");
				cnt_sp++;
			}
			int cnt_num=1;
			while(cnt_num<=tot_num)
			{
				System.out.print(row+" ");
				cnt_num++;
			}
			System.out.println();
			tot_sp--;
			tot_num=tot_num+2;
			row++;
		}
	}

}
