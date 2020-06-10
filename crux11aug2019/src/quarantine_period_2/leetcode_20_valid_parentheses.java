package quarantine_period_2;

import java.util.HashMap;
import java.util.Scanner;

public class leetcode_20_valid_parentheses {
public static void main(String[] args) {
	
	Scanner s= new Scanner(System.in);
	
	String str = s.next();
	
	System.out.println(isValid(str));
	
	
	
}

private static boolean isValid(String s) {
	
	
	HashMap<Character, Integer>  closing_bracket = new HashMap<Character, Integer>();
	HashMap<Character, Integer>  opening_bracket= new HashMap<Character, Integer>();
	
	closing_bracket.put(')', -1);
	closing_bracket.put(']', -2);
	closing_bracket.put('}', -3);
	
	
	opening_bracket.put('(',1);
	opening_bracket.put('{',2);
	opening_bracket.put('[',3);
	
	char[] c= {'}',')',']'};
	char[] o= {'{','(','['};
	
	int i=0;
	int j=0;
	int k=0;
	int p=1;
	
	if(c.equals(s.charAt(0)))
	{
		return false;
	}
	
	while(p<s.length())
	{
		if(opening_bracket.get(s.charAt(p-1))+closing_bracket.get(s.charAt(p))==0)
		{
			p++;
			continue;
		}
		if(c.equals(s.charAt(p))&&o.equals(s.charAt(p-1)))
		{
			return false;
		}
		
		
		if(o.equals(s.charAt(p))&&o.equals(s.charAt(p-1)))
		{
			continue;
		}
		
		
		p++;
		
	
} 
	return true;
}
}