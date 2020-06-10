package quarantine_period_2;

import java.util.Scanner;

public class leetcode_1137_nth_tribonaci_no {
	public static void main(String[] args) {
		
	
Scanner s = new Scanner(System.in);

int n = s.nextInt();
int [] dp = new  int [n+1];

System.out.println(tribonacci(n,dp));
	}

	private static int tribonacci(int n, int[] dp) {

		if(dp[n]!=0)
		{
			return dp[n];
		}
		

        if(n<=0)
        {
            return 0;
        }
        if(n==1||n==2)
        {
            return 1;
        }
        
        
      int r1=  tribonacci(n-1, dp);
       
              int r2=  tribonacci(n-2, dp);
       
              int r3=  tribonacci(n-3, dp);
       
        int sum = r1+r2+r3;
        
        dp[n]=sum;
        return sum;
	}


}
