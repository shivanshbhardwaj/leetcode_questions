package quarantine_period_2;

import java.util.Scanner;

public class leetcode_746_min_cost_stairs {
static Scanner s = new Scanner(System.in);

public static void main(String[] args) {

	int n = s.nextInt();
	int[] arr = new int[n];
	int[] a = input(arr);
	int [] dp = new int [n+1];
	int sum=0;
	int vidx=-1;
int r=	work(dp,a,vidx);
System.out.println(r);
display(dp);
}

private static int work(int[] dp, int[] cost, int vidx) {

	if(vidx>=0&&dp[vidx]!=0)
	{ 
		return dp[vidx];
	}
	
	
	if(vidx>=cost.length-2)
	{
	
		return cost[vidx];
	}

	
	
	int a=work(dp, cost, vidx+1);
	int b= work(dp, cost,vidx+2);
	
	if(vidx<0)
	{
		return Math.min(a, b);
	}
	
	
	dp[vidx]= Math.min(a, b)+ cost[vidx];
	
	 return Math.min(a, b)+cost[vidx];
	
	
	
	
	
	
}

public static void display(int[] arr) {
	for (int a = 0; a < arr.length; a++) {
		System.out.println(arr[a]);
	}
}

public static int[] input(int[] arr) {
	for (int a = 0; a < arr.length; a++) {
		arr[a] = s.nextInt();
	}
	return arr;
}

}
