package Pattern;

public class Pattern33 {
	public static void main(String[] args) {
		int n=10;
	       int row=1;
	       int tot_sp=n-1;
	       int tot_st=1;
	       int row_num=n;
	       while(row<=n)
	       {
	    	   int curr_sp=0;
	    	   while(curr_sp<tot_sp)
	    	   {
	    		   System.out.print("  ");
	    		   curr_sp++;
	    	   }
	    	   int num=row_num;
	    	   int curr_st=0;
	    	   while(curr_st<tot_st)
	    	   {
	    		   System.out.print(num%10+" ");
	    		   if(curr_st<tot_st/2)
	    		   {
	    			   num++;
	    		   }
	    		   else
	    		   {
	    			   num--;
	    		   }
	    		   curr_st++;
	    	   }
	    		   System.out.println();
	    		   row++;
	    		   tot_st=tot_st+2;
	    		   tot_sp--;
	    		   row_num--;
	    	   }
	}

}
