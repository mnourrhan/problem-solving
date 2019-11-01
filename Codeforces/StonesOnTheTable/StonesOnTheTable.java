package adhoc;
// http://codeforces.com/contest/266/problem/A
	
import java.util.HashMap;
import java.util.Scanner;

public class StonesOnTheTable {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<Character, Character> stones_neighbor = new HashMap<Character, Character>();
		int stones_number = sc.nextInt();
		String stones = sc.next();
		int neighbor_count = 0;
		for(int i = 0 ; i < stones_number; i++) {
			if(stones_neighbor.containsKey(stones.charAt(i))) {
				neighbor_count++;
			}else {
				stones_neighbor.clear();
				stones_neighbor.put(stones.charAt(i), stones.charAt(i));
			}
		}
		System.out.println(neighbor_count);
	}

}
