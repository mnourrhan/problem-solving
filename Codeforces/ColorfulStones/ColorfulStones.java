package adhoc;
// http://codeforces.com/contest/265/problem/A
	
import java.util.Scanner;

public class ColorfulStones {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);  
		 String s = sc.nextLine();
	     String t = sc.nextLine();
	     int liss_position = 1;
         for(int i = 0; i < t.length() ; i++) {
        	 if(t.charAt(i) == s.charAt(liss_position - 1)) {
        		 liss_position++;
        	 }
	    }
         
        System.out.println(liss_position);
	}

}
