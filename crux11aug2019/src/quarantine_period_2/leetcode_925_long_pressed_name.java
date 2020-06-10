package quarantine_period_2;

import java.util.Scanner;

public class leetcode_925_long_pressed_name {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		String name= s.next();
		String typed= s.next();
		
		System.out.println(isLongPressedName(name, typed));
		
		
	}

	private static boolean isLongPressedName(String name, String typed) {

	int i=0;
	int j=0;
	int count=0;
	
	while(i<name.length())
	{
		
		
	if(name.charAt(i)==typed.charAt(j))
	{count--;
		j++;
		
	}else {
		if(count>0)
		{
			return false;
		}
		i++;
		
		count++;
	}
		
		
		
	}
	return true;
				
			
			
			
			
		
		
		
		
	}

}
