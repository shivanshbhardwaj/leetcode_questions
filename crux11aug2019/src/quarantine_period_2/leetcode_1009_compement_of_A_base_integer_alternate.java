package quarantine_period_2;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class leetcode_1009_compement_of_A_base_integer_alternate
{
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int n = s.nextInt();

		System.out.println(bitwiseComplement(n));

	}

	private static int bitwiseComplement(int N) {

		
		String   str=  Integer.toBinaryString(N);
		
		str.length();
		
		int i=0;
		
		StringBuilder sb = new StringBuilder();
	while(i<=str.length()-1)
	{
		sb.append('1');
		i++;
	}
	
	String str2=sb.toString();
	System.out.println(str);
	System.out.println(str2);
	
	
	 i=str.length()-1;
	int m =0 ;
	int no =0;
	while(i>=0)
	{
	
		no=(int) (no+ ((int)str.charAt(i)^(int) str2.charAt(i))*(Math.pow(2, m)));
		i--;
		m++;
	}
	
	
	
	
		return no;

	}

}
