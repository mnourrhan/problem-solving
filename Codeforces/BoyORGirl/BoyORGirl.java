//https://codeforces.com/contest/236/problem/A
package adhoc;

import java.util.Scanner;
import java.util.HashMap; // import the HashMap class

public class BoyORGirl {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<Character, Integer> user_name_char = new HashMap<Character, Integer>();
		String user_name = sc.next();
		int distinct_letter_count = 0;
		for (int i = 0; i < user_name.length(); i++) {
			if (user_name_char.containsKey(user_name.charAt(i))) {
				continue;
			} else {
				user_name_char.put(user_name.charAt(i), i);
				distinct_letter_count++;
			}
		}
		if (distinct_letter_count % 2 == 0) {
			System.out.println("CHAT WITH HER!");
		}else {
			System.out.println("IGNORE HIM!");
		}
	}

}
