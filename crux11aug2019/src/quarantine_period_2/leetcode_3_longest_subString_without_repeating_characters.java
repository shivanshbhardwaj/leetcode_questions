package quarantine_period_2;

import java.util.HashMap;
import java.util.Scanner;

public class leetcode_3_longest_subString_without_repeating_characters {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		String str = s.next();

		System.out.println(lengthOfLongestSubstring(str));

	}

	private static int lengthOfLongestSubstring(String s) {

		int n = 0;

		int starting = 0;

		int length = 0;

		int count = 0;

		HashMap<Character, Integer> h = new HashMap<Character, Integer>();

		while (n < s.length()) {


		
			length = Math.max(length, count);
			
			
			if (h.containsKey(s.charAt(n)) == false) {

				h.put(s.charAt(n), n);

				count++;
				n++;

			} else {
				
			
//				System.out.println(length);
				
				
				count = count - h.get(s.charAt(n)) -1;
				
				
				h.remove(s.charAt(n));
				
				starting++;
			}

		
		}
		System.out.println(starting);
		return length;
	}
}
