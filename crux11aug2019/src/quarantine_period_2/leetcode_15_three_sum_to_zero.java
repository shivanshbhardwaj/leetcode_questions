package quarantine_period_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class leetcode_15_three_sum_to_zero {

	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {

		int n = s.nextInt();

		int[] arr = new int[n];

		int[] a = input(arr);

		List<List<Integer>> aa = work(a);
		display2(aa);
	}

	private static void display2(List<List<Integer>> aa) {

		for (int i = 0; i < aa.size(); i++) {
			for (int j = 0; j < aa.get(i).size(); j++) {
				System.out.print(aa.get(i).get(j) + " ");

			}
			System.out.println();

		}
	}

	private static List<List<Integer>> work(int[] nums) {
  
		HashMap<Integer, Integer> h = new HashMap<Integer, Integer>();

		for (int i = 0; i < nums.length; i++) {

			h.put(i, nums[i]);
		}

		List<List<Integer>> l = new LinkedList<List<Integer>>();

		work2(nums, h, l);

		return l;
		
	}

	private static void work2(int[] nums, HashMap<Integer, Integer> h, List<List<Integer>> l2) {
	
		int i=0;
		Arrays.parallelSort(nums);
		
		
		while(i<nums.length-2)
		{
			for (int j = i+1; j < nums.length; j++) {
				
				
			}
			
		}
		
		
	}

	public static void display(int[] arr) {
		for (int a = 0; a < arr.length; a++) {
			System.out.print(arr[a] + " ");
		}
	}

	public static int[] input(int[] arr) {
		for (int a = 0; a < arr.length; a++) {
			arr[a] = s.nextInt();
		}
		return arr;
	}

}
