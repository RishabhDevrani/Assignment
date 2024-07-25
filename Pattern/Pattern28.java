package Pattern;

public class Pattern28 {
	public static void main(String[] args) {
		int n=5;
	    int row=1;
	    int tot_sp=n-1;
	    int tot_st=1;
	    int num_st=row;
	    while(row<=n)
	    {
	    	int cnt_sp=0;
	    	while(cnt_sp<tot_sp)
	    	{
	    		System.out.print("  ");
	    		cnt_sp++;
	    	}
	    	int num=num_st;
	    	int cnt_st=0;
	    	while(cnt_st<tot_st)
	    	{
	    		System.out.print(num+" ");
	    		if(cnt_st<tot_st/2)
	    		{
	    			num=num+1;
	    		}
	    		else
	    		{
	    			num--;
	    		}
	    		cnt_st++;
	    	}
	    	System.out.println();
	    	row++;
	    	num_st++;
	    	tot_sp--;
	    	tot_st=tot_st+2;
	    }
	}

}
