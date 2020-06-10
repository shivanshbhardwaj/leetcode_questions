package quarantine_period_2;

import java.util.HashMap;
import java.util.Scanner;

public class leetcode_242_valid_anagram {
public static void main(String[] args) {
	

	Scanner s= new Scanner(System.in);
	String s1= s.next();
	String s2= s.next();
	
	
	 System.out.println(isAnagram(s1, s2));
	 
	
	
	
	
}

private static void map(HashMap<Character, Integer> h, String s) {

	for (int i = 0; i < s.length(); i++) {
		
		if(h.containsKey(s.charAt(i))==false)
		h.put(s.charAt(i),1);
		else
			h.put(s.charAt(i),h.get(s.charAt(i))+1);
		
	}
	
	
}

private static boolean isAnagram(String s1, String s2) {
	HashMap<Character, Integer> h1= new HashMap<Character, Integer>();
	HashMap<Character, Integer> h2= new HashMap<Character, Integer>();
	
	map(h1,s1);
	map(h2,s2);
	
	
	 return work(s1,s2,h1,h2);
	
}

private static boolean work(String s1, String s2, HashMap<Character, Integer> h1, HashMap<Character, Integer> h2) {

	if(h1.equals(h2))
	{
		return true;
	}
	else
		return false;
}	
	
}
