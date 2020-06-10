package quarantine_period_2;

import java.util.HashMap;
import java.util.Scanner;

public class leetcode_1160 {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {

		int n = s.nextInt();
		String[] arr = new String[n];
		input(arr);
		HashMap<Character, Integer> h = new HashMap<>();
		
		String str = s.next();
		map(str, h);

		
		
		System.out.println(work(str, arr, h));

	}

	private static void input(String[] arr) {
		for (int n = 0; n < arr.length; n++) {
			arr[n] = s.next();
		}
		
	}

	private static int work(String chars, String[] words, HashMap<Character, Integer> h) {

//		if (words.length > 1000 && words.length < 1 && chars.length() > 100) {
//			return 0;
//		}
		int result=0;
		
		int count = 0;

		while (count < words.length) {
			int ans = 0;
			HashMap<Character, Integer> h2 = new HashMap<>();

			map(words[count], h2);
			
for (int i = 0; i < words[count].length(); i++) {
char c= words[count].charAt(i);
			if (h.containsKey(c)  &&   (h2.get(c)<=h.get(c))   ) {
			ans=ans+1;
				
			}
			else {
				ans=0;
				break;
			}
}
			
		
		
result+=ans;	
h2.clear(); 
count++;
		}

		return result;
	}

	private static void map(String str, HashMap<Character, Integer> h) {

		for (int n = 0; n < str.length(); n++) {
			if (h.get(str.charAt(n)) == null) {
				h.put(str.charAt(n), 1);
			} else {
				h.put(str.charAt(n), h.get(str.charAt(n)) + 1);
			}
//			System.out.println(n);
		}
	}
}
