package adhoc;
//http://codeforces.com/contest/677/problem/A

import java.util.Scanner;

public class Team {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); 
		int problem_count = 0;
        for(int i = 0; i < n ; i++) {
            boolean is_petya_sure = sc.nextInt() != 0;
            boolean is_vasya_sure = sc.nextInt() != 0;
            boolean is_tonya_sure = sc.nextInt() != 0;
            
            if((is_petya_sure && is_vasya_sure) 
            	|| (is_petya_sure && is_tonya_sure) 
            	|| (is_vasya_sure && is_tonya_sure))
            	problem_count++;
        }
		
		System.out.println(problem_count);
	}

}
