package LEET_CODE;

import java.util.HashMap;
import java.util.Scanner;

public class leetcode_1446_consecutive_characters {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		String str = s.next();

		System.out.println(maxPower(str));

	}

	private static int maxPower(String s) {
		
		if(s.length()==0)
		{
			return 0;
		}
		if(s.length()==1)
		{
			return 1;
		}
		int power = 0;
		int l1 = 1;
		int l2 = 1;
		int count = 0;
		int i = 0;
		while (i < s.length()-1) {
			
			
			
			
			if (s.charAt(i) != s.charAt(i + 1)) {
				
				count++;
			}

			
			if(count==2)
			{
			 			 	
			 	l1=1;
			 	l2=1;
				
			 	count=0;
				
			}
			
			
			
			if (count == 0 && s.charAt(i) == s.charAt(i + 1)) {
				l1++;

			}

			if (count == 1 && s.charAt(i) == s.charAt(i + 1)) {
				l2++;

			}
			power=Math.max(power, Math.max(l1, l2));
			i++;
			
		
		}

		return power;

	}
}
