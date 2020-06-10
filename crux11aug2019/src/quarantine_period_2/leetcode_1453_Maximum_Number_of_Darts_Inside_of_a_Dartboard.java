package quarantine_period_2;

import java.util.Scanner;

public class leetcode_1453_Maximum_Number_of_Darts_Inside_of_a_Dartboard {
static Scanner s = new Scanner(System.in);

public static void main(String[] args) {

	int n = s.nextInt();
	int[][] arr = new int[n][2];
	 input(arr);
	numPoints(arr, n);

}

private static void numPoints(int[][] points, int r) {

	
	
	
	for (int i = 0; i < points.length; i++) {
		
		for (int j = i+1; j < points.length; j++) {
			
			
			
			
		}
		
	}
	
	
	
	
	
	
}

public static void input(int[][] ar) {

	for (int n = 0; n < ar.length; n++) {
		for (int n1 = 0; n1 < ar.length; n1++) {
			ar[n][n1] = s.nextInt();

		}

	}

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
