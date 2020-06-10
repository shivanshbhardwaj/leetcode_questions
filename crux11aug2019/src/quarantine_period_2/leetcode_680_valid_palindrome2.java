package quarantine_period_2;

import java.util.HashMap;

public class leetcode_680_valid_palindrome2 {

	public static void main(String[] args) {
		System.out.println(isPalindrome("0P"));
	}

	public static boolean isPalindrome(String s) {

		s = s.toUpperCase();

		for (int i = 0; i < s.length(); i++) {

		String	str = s.substring(0, i) + s.substring(i + 1, s.length() - 1);

			int s1 = 0;
			int end = str.length() - 1;

			HashMap<Integer, Integer> h = new HashMap<Integer, Integer>();
			for (int n = 48; n <= 57; n++) {
				h.put(n, n);
			}

			for (int n1 = 65; n1 <= 90; n1++) {
				h.put(n1, n1);
			}

			for (int n2 = 97; n2 <= 122; n2++) {
				h.put(n2, n2);
			}

			int count = 0;
			while (s1 < end) {
				if (h.containsKey((int) str.charAt(s1)) && h.containsKey((int) str.charAt(end))) {
					count++;
					if (str.charAt(s1) != str.charAt(end)) {
						continue;
					}

				}
				if (h.containsKey((int) str.charAt(s1)) && !h.containsKey((int) str.charAt(end)))
					end--;
				else if (!h.containsKey((int) str.charAt(s1)) && h.containsKey((int) str.charAt(end)))
					s1++;
				else {
					s1++;
					end--;
				}
			}
			System.out.println(count);
			return true;

		}
		return false;
	}

}
