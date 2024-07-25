package Pattern;

public class Pattern30 {
	public static void main(String[] args) {
		int n=5;
	     int row=1;
	     while(row<=n)
	     {
	    	 int num=n;
	    	 int count=0;
	    	 while(count<n)
	    	 {
	    		 if(count+row==n)
	    		 {
	    			 System.out.print(num+" ");
	    		 }
	    		 else
	    		 {
	    			 System.out.print(num+" ");
	    		 }
	    		 num--;
	    		 count++;
	    	 }
	    	 row++;
	    	 System.out.println();
	     }		
	}

}
