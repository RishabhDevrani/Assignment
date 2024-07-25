package Pattern;

public class Pattern11 {
	public static void main(String[] args) {
		int num=5;
		   int row=1;
		   int tot_st=1;
		   int tot_sp=num-1;
		   while(row<=num)
		   {
			   int cnt_sp=0;
			   while(cnt_sp<tot_sp)
			   {
				   System.out.print("  ");
				   cnt_sp++;
			   }
			   int count=0;
			   while(count<tot_st)
			   {
				   if(count%2==0)
				   {
					   System.out.print("* ");
				   }
				   else
				   {
					   System.out.print("  ");
				   }
				   count++;
			   }
			   row++;
			   System.out.println();
			   tot_sp--;
			   tot_st=tot_st+2;
		   }  
	}

}
