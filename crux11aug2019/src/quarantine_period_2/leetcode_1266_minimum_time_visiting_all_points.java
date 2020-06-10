package quarantine_period_2;

import java.util.Arrays;
import java.util.Scanner;

public class leetcode_1266_minimum_time_visiting_all_points {static Scanner s = new Scanner(System.in);

public static void main(String[] args) {

	int n = s.nextInt();
	int[][] points = new int[n][2];
	 input(points);
	 System.out.println(minTimeToVisitAllPoints(points));
	 
//	display(points);

}

private static int minTimeToVisitAllPoints(int[][] points) {
	int sum=0;
	
	int s=0;
	for (int j = 0; j < points.length-1; j++) {
		

s+=	work(points[j][0],points[j][1],points[j+1][0],points[j+1][1],sum);
	
System.out.println(s);

	
	}
	return s;
	
}


	
	
	
	
	

private static int work(int sc, int sr, int ec , int er, int step) {
	
	
	if(sc>=ec||sr>=er)
	{
		return Integer.MAX_VALUE  ;
	}
	
	
	if(sc==ec&&sr==er)
	{
		return step;
	}
	
	
	
	
	
 int a = 	work(sc+1, sr, ec, er, step+1);
int b=	work(sc, sr+1, ec, er, step+1);
int c=	work(sc+1, sr+1, ec, er, step+1);
	
	
return  	Math.min(Math.min(a, b),c);
	
	
}

public static void display(int[][] arr) {
	for (int a = 0; a < arr.length; a++) {
		for (int i = 0; i < arr[0].length; i++) {
			System.out.println(arr[a][i]);
		}
		
	}
}

public static void input(int[][] ar) {

	for (int n = 0; n < ar.length; n++) {
		for (int n1 = 0; n1 < ar[0].length; n1++) {
			ar[n][n1] = s.nextInt();

		}

	}

}



}
