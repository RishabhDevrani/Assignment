package Pattern;

public class Pattern26 {
	public static void main(String[] args) {
		int n=5;
	     int start_bye=1;
	     int nsp=n-1;
	     int nst=1;
	     int row=1;
	     int ntp=1;
	     while(row<=n)
	     {
	    	 int csp=0;
	    	 while(csp<nsp)
	    	 {
	    		 System.out.print("  ");
	    		 csp++;
	    	 }
	    	 ntp=start_bye;
	    	 int cst=0;
	    	 while(cst<nst)
	    	 {
	    		 System.out.print(ntp+" ");
	    		 cst++;
	    		 if(cst<=nst)
	    		 {
	    			 ntp++;
	    		 }
	    		 else
	    		 {
	    			 ntp++;
	    		 }
	    	 }
	    	 nst=nst+2;
	    	 nsp--;
	    	 row++;
	    	 System.out.println();
	     }
	}

}
