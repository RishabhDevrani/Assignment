package Pattern;

public class Pattern5 {
	public static void main(String[] args) {
		int num = 5;
		int row = 1;
		int tot_sp = 0;
		int tot_st = num;
		while (row <= num) {
			int cnt_sp = 0;
			while (cnt_sp < tot_sp) {
				System.out.print("  ");
				cnt_sp++;
			}
			int cnt_st = 0;
			while (cnt_st < tot_st) {
				System.out.print("* ");
				cnt_st++;
			}
			tot_st--;
			System.out.println();
			tot_sp++;
			row++;
		}
	}

}
