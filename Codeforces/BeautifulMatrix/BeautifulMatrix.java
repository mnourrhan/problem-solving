//http://codeforces.com/contest/263/problem/A
package adhoc;

import java.util.Scanner;

public class BeautifulMatrix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int j_index = 0;
		int i_index = 0;
		for(int i = 0; i < 5 ; i++) {
			String row = sc.nextLine();
			int index_of_1 = row.indexOf('1');
			if(index_of_1 == -1) {
				continue;
			}else {
				j_index = index_of_1/2;
				i_index = i;
				break;
			}
		}
		int moves = Math.abs(2-j_index) + Math.abs(2-i_index);
		System.out.println(moves);
	}

}
