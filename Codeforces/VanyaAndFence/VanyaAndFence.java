package adhoc;
//http://codeforces.com/contest/677/problem/A

import java.util.Scanner;

public class VanyaAndFence {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);  
	      int n = sc.nextInt();       
	      int h = sc.nextInt();
	      int count = 0;
	      while(n > 0) {
	    	  int p = sc.nextInt();  
	    	  if(p > h) {
		    	  count = count+2;
		      }else {
		    	  count++;
		      }
	    	  n--;
	      }
	      System.out.println(count);
	}

}
