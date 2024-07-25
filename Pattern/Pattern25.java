package Pattern;

public class Pattern25 {
	public static void main(String[] args) {
		int n=5;
	       int row=1;
	       int tot_sp=n-1;
	       int tot_num=1;
	       int num=1;
	       while(row<=n)
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
	    		   System.out.print(num+" ");
	    		  cnt_num++;
	    		  num++;
	    	   }
	    	   row++;
	    	   System.out.println();
	    	   tot_sp--;
	    	   tot_num=tot_num+2;
	       }
	}

}
