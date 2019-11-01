package adhoc;
// http://codeforces.com/contest/266/problem/A
	
import java.util.Map.Entry;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Games {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<Integer, Integer> home_colors = new HashMap<Integer, Integer>();
		HashMap<Integer, Integer> guest_colors = new HashMap<Integer, Integer>();
		int teams_numbers = sc.nextInt();
		int conflicted_colors = 0;
		for(int i = 0 ; i < teams_numbers; i++) {
			int home_color = sc.nextInt();
			int guest_color = sc.nextInt();
			home_colors.put(home_color, home_color);
			guest_colors.put(guest_color, guest_color);
		}
		
		Iterator<Entry<Integer, Integer>> iter1 = home_colors.entrySet().iterator();
		Iterator<Entry<Integer, Integer>> iter2 = guest_colors.entrySet().iterator();
		while(iter1.hasNext() || iter2.hasNext()) {
		  Entry<Integer, Integer> e1 = iter1.next();
		  Entry<Integer, Integer> e2 = iter2.next();
		  if(guest_colors.containsKey(e1.getKey())) {
				conflicted_colors++;
			}
			if(home_colors.containsKey(e2.getKey())) {
				conflicted_colors++;
			}
//		  System.out.println(e1.getKey());
		  System.out.println(conflicted_colors);

		}
		
//		for(int i = 0 ; i < teams_numbers; i++) {
//			if(guest_colors.containsKey(home_color)) {
//				conflicted_colors++;
//			}
//			if(home_colors.containsKey(guest_color)) {
//				conflicted_colors++;
//			}
//		}
		
		System.out.println(conflicted_colors);
	}

}
