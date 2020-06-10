package quarantine_period_2;

import java.util.ArrayList;
import java.util.Scanner;

public class leetcode_160_intersection_of_linklist {
static Scanner s = new Scanner(System.in);

public static void main(String[] args) {

//	int n1 = s.nextInt();
//	int n2 = s.nextInt();
//	int[] arr1 = new int[n1];
//	int[] arr2 = new int[n2];
//	int[] a1 = input(arr1);
//	int[] a2 = input(arr2);
	StringBuilder sb= new  StringBuilder();
	ArrayList<Integer> al =new ArrayList<Integer>();
	Math.pow(2, 31);
	System.out.println(Math.pow(2, 31));
	
//	display(a1);
//	display(a2);

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
