package quarantine_period_2;

import java.util.Scanner;

public class leetcode_844_backSpace_string_compare {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		String S = s.next();
		String T = s.next();

		System.out.println(backspaceCompare(S, T));

	}

	private static boolean backspaceCompare(String s, String t) {

		int n = 0;

		StringBuilder sb1 = new StringBuilder();
		StringBuilder sb2 = new StringBuilder();

		
		while(s.charAt(n)=='#' &&s.charAt(0)=='#') {
			
			n++;
			
		}
		
		
		
		while (n < s.length()) {
			if (s.charAt(n) == '#') {
				sb1.replace(n - 1, n + 1, "");
				n++;
				continue;
			}

			sb1.append(s.charAt(n));

			n++;

		}

		n = 0;

	while(t.charAt(n)=='#' &&t.charAt(0)=='#') {
			
			n++;
			
		}
		

		while (n < t.length()) {
			if (t.charAt(n) == '#') {
				sb2.replace(n - 1, n + 1, "");
				n++;
				continue;
			}

			sb2.append(t.charAt(n));

			n++;

		}

		if (sb1.compareTo(sb2) == 0) {
			return true;
		} else {
			return false;
		}

	}

}
