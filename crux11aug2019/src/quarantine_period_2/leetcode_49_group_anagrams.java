package quarantine_period_2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class leetcode_49_group_anagrams {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {

		int n = s.nextInt();
		String[] arr = new String[n];
		String[] a = input(arr);

		groupAnagrams(arr);
		display(a);

	}

	private static List<List<String>> groupAnagrams(String[] strs) {
		int vidx = 0;
		List<List<String>> l = new ArrayList<List<String>>();

		int t = 0;
		List<List<String>> n = work(strs, vidx, t);

		System.out.println(n);
		return l;
	}

	private static List<List<String>> work(String[] strs, int vidx, int t) {

		if (vidx == strs.length - 1) {
			List<List<String>> l = new ArrayList<List<String>>();

			List<String> bc = new ArrayList<String>();
			bc.add(strs[vidx]);
			l.add(bc);
			return l;
		}

		List<List<String>> r = work(strs, vidx + 1, t);

		List<List<String>> mr = new ArrayList<List<String>>();
		int c=0;
		for(List<String> l:r)
		{List<String> m1= new ArrayList<String>();
			for(String s:l)
			{
				m1.add(s);
				
				
				if(isAnagram(strs[vidx],s) &&c==0)
				{
					m1.add(strs[vidx]);
					
					c=1;
					
					
					
					
				}
			}
		mr.add(m1);
			
			
		}
		if(c==0)
		{List<String> m= new ArrayList<String>();
		
		m.add(strs[vidx]);
			mr.add(m);
		}

		return mr;

	}
	

	private static void map(HashMap<Character, Integer> h, String s) {

		for (int i = 0; i < s.length(); i++) {

			if (h.containsKey(s.charAt(i)) == false)
				h.put(s.charAt(i), 1);
			else
				h.put(s.charAt(i), h.get(s.charAt(i)) + 1);

		}

	}

	private static boolean isAnagram(String s1, String s2) {
		HashMap<Character, Integer> h1 = new HashMap<Character, Integer>();
		HashMap<Character, Integer> h2 = new HashMap<Character, Integer>();

		map(h1, s1);
		map(h2, s2);

		return work1(s1, s2, h1, h2);

	}

	private static boolean work1(String s1, String s2, HashMap<Character, Integer> h1, HashMap<Character, Integer> h2) {

		if (h1.equals(h2)) {
			return true;
		} else
			return false;
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
