package adhoc;
// http://codeforces.com/contest/734/problem/A
	
import java.util.Scanner;

public class AntonAndDanik {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);  
	      int n = sc.nextInt();  
	      int anton_count = 0;
	      int danik_count = 0;
          String input = sc.next();
          for(int i = 0; i < n ; i++) {
        	  char winner = input.charAt(i);
	    	  if(winner == 'A') {
	    		  anton_count++;
		      }else {
		    	  danik_count++;
		      }
	    }
          if(anton_count > danik_count) {
        	  System.out.println("Anton");
          }else if(anton_count < danik_count) {
        	  System.out.println("Danik");
          }else {
        	  System.out.println("Friendship");
          }
	}

}
