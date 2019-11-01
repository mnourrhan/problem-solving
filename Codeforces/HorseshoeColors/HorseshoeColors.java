//http://codeforces.com/contest/228/problem/A
package adhoc;

import java.util.Scanner;
import java.util.HashMap; // import the HashMap class


public class HorseshoeColors {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<Long, Long> horseshoes = new HashMap<Long, Long>();
		int shoes_count = 0;
		for(int i = 0 ; i < 4; i++) {
			long horseshoe = sc.nextLong();
			if(horseshoes.containsKey(horseshoe)) {
				shoes_count++;
			}else {
				horseshoes.put(horseshoe, horseshoe);
			}
		}
		System.out.println(shoes_count);
	}

}
