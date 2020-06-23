package LEET_CODE;

import java.util.Scanner;

public class leetcode_1486_xor_operation_in_array {

	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		
		int  n = s.nextInt();
		int  start= s.nextInt();
		xorOperation(n, start);
		
		
	}

	private static void xorOperation(int n, int start) {
		System.out.println("---------------------------");
int ans=0;
		int count =0;
		
		while(count< n )
		{
			
			ans=ans^(start+2*count);
			
			
			count++;
		}
		System.out.println(ans);
		
		
	}
	
	
}
