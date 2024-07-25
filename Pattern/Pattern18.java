package Pattern;

public class Pattern18 {
	public static void main(String[] args) {
		int n = 7;
		int row = 1;
		int nsp = n / 2;
		int nst = 1;
		int star=1;
		while (row <= n) {
			int csp = 0;
			while (csp < nsp) {
				System.out.print("  ");
				csp++;
			}
			int cst = 0;
			while (cst < nst) {
				System.out.print("* ");
				star++;
				cst++;
			}
			row++;
			if (row <= n / 2 + 1) {
				nst = nst + 2;
				nsp--;
			} else {
				nsp++;
				nst = nst - 2;
			}
			System.out.println();
		}
	}

}
