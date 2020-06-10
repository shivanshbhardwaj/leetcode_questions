package quarantine_period_2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class leetcode_1002_find_common_characters {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {

		int n = s.nextInt();
		String[] arr = new String[n];
		String[] a = input(arr);

		commonChars(arr);

		display(a);

	}

	private static List<String> commonChars(String[] A) {
		int n = 0;

		HashMap<Character, Integer> h = new HashMap<Character, Integer>();
		while (n < A.length) {
			int i = 0;

			while (i < A[n].length()) {

				if (h.containsKey(A[n].charAt(i)) == false) {
					h.put(A[n].charAt(i), 1);
				} else {
					h.put(A[n].charAt(i), h.get(A[n].charAt(i)) + 1);

				}

				i++;
			}
			n++;

		}
		List<String> l = new ArrayList<String>();

		for (int i = 0; i < A[0].length(); i++) {
			double a= (double)h.get(A[0].charAt(i))/A.length;
			System.out.println(a);
			System.out.println(Math.floor(a));
			System.out.println(h.get(A[0].charAt(i)));
			
			
			if( Math.floor(a)==a && h.get(A[0].charAt(i)) >=A.length ) {
				l.add(A[0].charAt(i) + "");
			}

		}
		System.out.println(l);
		return l;

	}
 
	public static void display(String[] a2) {
		for (int a = 0; a < a2.length; a++) {
			System.out.println(a2[a]);
		}
	}

	public static String[] input(String[] arr) {
		for (int a = 0; a < arr.length; a++) {
			arr[a] = s.next();
		}
		return arr;
	}

}
