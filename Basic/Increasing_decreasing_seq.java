package Basic;

import java.util.Scanner;

public class Increasing_decreasing_seq {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int prev=s.nextInt();
		int cnt=1;
		boolean goingUp = false;
		boolean isValid = true;
		    while(cnt < n){
		        int curr = s.nextInt();
		        int diff = curr - prev;
		        if(diff == 0){  
		            isValid = false;
		        }else if(diff > 0){  
		            goingUp = true;
		        }else if(goingUp && diff < 0){
		            isValid = false;
		        }
		        prev = curr;
		        cnt++;
		    }
		    System.out.println(isValid);
	}

}
