package Pattern;

public class Pattern22 {
	public static void main(String[] args) {
		int n = 5;
		int row = 1;
		int total_st=n;
		int total_sp=-1;
		while (row <= n) {
			int cnt_st1 = 0;
			while (cnt_st1 < total_st) {
				System.out.print("* ");
				cnt_st1++;
			}
			int cnt_sp = 0;
			while (cnt_sp < total_sp) {
				System.out.print("  ");
				cnt_sp++;
			}
			int cnt_st2 = 0;
			if (row == 1) {
				cnt_st2 = 1;
			}
			while (cnt_st2 <total_st) {
				System.out.print("* ");
				cnt_st2++;
			}
			row++;
			System.out.println();
			total_st--;
			total_sp = total_sp + 2;
		}
	}
}
