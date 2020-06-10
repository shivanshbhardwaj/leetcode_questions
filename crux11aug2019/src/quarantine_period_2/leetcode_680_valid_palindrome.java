package quarantine_period_2;

import java.util.HashMap;
import java.util.Scanner;

public class leetcode_680_valid_palindrome {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		String str = s.next();

		System.out.println(validPalindrome(str));

	}

	private static boolean validPalindrome(String s) {
		
		HashMap<String, Boolean> h = new HashMap<String, Boolean>();
		int i = 0;
		boolean b = false;
		boolean c = false;

		if (check(s))
			return true;

		while (i < s.length()) {
			String x = s.substring(0, i);
			String a = s.substring(0, i) + s.substring(i + 1, s.length());
			System.out.println(a);
			if (h.containsKey(a)) {
				if( h.get(a))
				{
					continue;
				}
			} else {
				b = check(a);
				
				if(b)
					return b;
				
				h.put(a, b);
			}
			


			i++;

		}
//		System.out.println(c);
		return c;
	}

	private static boolean check(String str) {
int i=0;
int j=0;
		if(str.length()%2!=0)
		{
		 i = str.length()/2-1;
		 j = str.length()/2+1;
		}else
		{
			 i = str.length()/2-1;
			 j = str.length()/2;
			
		}
		
		while (i >=0 &&j<=str.length()-1) {
			if (str.charAt(i) != str.charAt(j)) {
				return false;
			}

			i--;
			j++;

		}
		return true;

	}
	

}
