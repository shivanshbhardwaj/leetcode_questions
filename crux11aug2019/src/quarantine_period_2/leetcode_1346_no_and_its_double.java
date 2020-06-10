package quarantine_period_2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class leetcode_1346_no_and_its_double {
	
	
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {

		int n = s.nextInt();
		int[] arr = new int[n];
		int[] a = input(arr);
		System.out.println(work(arr));

	}

	private static boolean work(int[] arr) {

		
		
		HashMap<Integer, Integer> h = new HashMap<Integer, Integer>();
		
		
		for (int i = 0; i < arr.length; i++) {
			
			h.put(arr[i],arr[i]);
		}
		
		for (int i = 0; i < arr.length; i++) {
			
			if(h.containsKey(arr[i])&&h.containsKey(2*arr[i]))
			{
				return true ;
			}
		}
		return false;
		
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
