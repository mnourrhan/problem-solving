//http://codeforces.com/contest/112/problem/A
package adhoc;

import java.util.Scanner;

public class PetyaAndStrings {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String first_string = sc.next();
		String second_string = sc.next();
		int diff = stringCompare(first_string, second_string);
		if (diff < 0) {
			System.out.println(-1);
		} else if (diff > 0) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
	}

	public static int stringCompare(String str1, String str2) {
		for (int i = 0; i < str1.length() && i < str2.length(); i++) {
			char first = Character.toLowerCase(str1.charAt(i));
			char second = Character.toLowerCase(str2.charAt(i));
			if ((int) first == (int) second) {
				continue;
			} else {
				return (int) first - (int) second;
			}
		}
		return 0;
	}
}