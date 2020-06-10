package quarantine_period_2;

import java.util.Scanner;

public class leetcode_70_climbing_stairs {
	
	
	public static void main(String[] args) {
	
		
		
		Scanner s = new Scanner (System.in);
		
		int n = s.nextInt();
		
		int [] a  =  new int [ n+1];
		System.out.println(climbStairs(n,a));
		
		
		
		
		
	}

	private static int climbStairs(int n, int[] a) {
		
	     
        if( n>0 &&a[n]!=0)
        {
            return a[n];
        }
		
	if(n<0)
		{
			return 0;
		}
		if( n==0)
		{
			return 1;
		}
		
		 int r = climbStairs(n-2, a);
		 int r2=climbStairs(n-1, a);
		
		 
		 a[n]=r+r2;
		return r+r2;
		
		
	}

	
}
