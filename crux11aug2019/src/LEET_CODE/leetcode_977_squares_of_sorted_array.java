package LEET_CODE;

import java.util.Arrays;
import java.util.Scanner;

public class leetcode_977_squares_of_sorted_array {
static Scanner s = new Scanner(System.in);

public static void main(String[] args) {

	int n = s.nextInt();
	int[] arr = new int[n];
	int[] a = input(arr);
	
	sortedSquares(a);
	display(a);

}

private static int[] sortedSquares(int[] A) {

	int n=0;
	
	while(n<A.length)
	{
	A[n]=A[n]*A[n];	
	
	n++;
	}
	
	
	Arrays.parallelSort(A);
	
	return A;
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
