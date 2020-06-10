package quarantine_period_2;

import java.util.Scanner;

public class leetcode_80_remove_duplicates {

	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {

		int n = s.nextInt();
		int[] arr = new int[n];
		int[] nums = input(arr);
		int a = removeDuplicates(nums);

		display(nums);

		System.out.println("-----------------------");

		System.out.println(a);

	}

	private static int removeDuplicates(int[] nums) {
		work(nums);
		int r = 0;
		for (int i = 1; i < nums.length - 1; i++) {

			if ((i == nums.length - 2) || (nums[i - 1] == nums[i] && nums[i] == nums[i + 1])) {
				r = i;
				break;
			}
		}
		return r + 1;

	}

	private static void work(int[] nums) {
		int i = 0;
		int l= nums.length - 1;
		while (i != l) {
			
			int p = 0;
			int x = 0;
			for (int j = i + 1; j < nums.length; j++) {

				int k = nums[i];
				System.out.println(i);
			
				if (nums[j] != k && p<=1 ) {
p=0;

				}
				if (nums[j] != k && p>1 ) {
					i = i - (p-3);
					p=1;
					x = j;
					break;
				}
				if(nums[j]==k)
				{
					p++;
				
				}
				
				
			
				    i++;

			}
			
			System.out.println(i);
			System.out.println(x);

			
			if(x!=0)
			{i=i-1;
				copy(nums, i, l);
				l=x;
				i=i-1;
			}
			else
			{
				
			}
		
				
			
			display(nums);

		}

	}

	private static void copy(int[] nums, int i, int x) {

		for (int j = x; j <nums.length ; j++) {

			nums[i] = nums[j];
			i++;
		}
		display(nums);

	}

	public static void display(int[] arr) {
		for (int a = 0; a < arr.length; a++) {
			System.out.print("    " + arr[a]);
		}
		System.out.println();
	}

	public static int[] input(int[] arr) {
		for (int a = 0; a < arr.length; a++) {
			arr[a] = s.nextInt();
		}
		return arr;
	}

}
