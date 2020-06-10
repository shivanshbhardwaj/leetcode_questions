package quarantine_period_2;

import java.util.Scanner;

public class leetcode_27_remove_elements {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {

		int n = s.nextInt();
		int[] arr = new int[n];
		int[] a = input(arr);
		int val = s.nextInt();

		int p=removeElement(arr, val);
		System.out.println(p);
		display(a);

	}

	private static int removeElement(int[] nums, int val) {

		int i = 0;
		int count = 0;
		int x=nums.length - 1;
		while (i <=x ) {

			if (nums[i] == val) {

				
				work2(i, nums);
				count++;
				i--;
				x--;
			} 

			i++;

		}
		return nums.length-count;

	}

	private static void work2(int ss, int[] nums) {

		for (int n = ss; n < nums.length - 1; n++) {

			nums[n] = nums[n + 1];
		}

	}

	public static void display(int[] arr) {
		for (int a = 0; a < arr.length; a++) {
			System.out.print(" " + arr[a]);
		}
	}

	public static int[] input(int[] arr) {
		for (int a = 0; a < arr.length; a++) {
			arr[a] = s.nextInt();
		}
		return arr;
	}

}
