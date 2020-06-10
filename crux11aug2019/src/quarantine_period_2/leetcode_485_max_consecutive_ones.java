package quarantine_period_2;

import java.util.Scanner;

public class leetcode_485_max_consecutive_ones {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {

		int n = s.nextInt();
		int[] arr = new int[n];
		int[] nums = input(arr);

		System.out.println(findMaxConsecutiveOnes(nums));

	}

	private static int findMaxConsecutiveOnes(int[] nums) {

		if ((nums.length == 0)||(nums.length == 1 && nums[0] == 0)) {
			return 0;
		}
		

		int power = 0;
		int l1 = 0;
		int l2 = 0;
		int count = 0;
		int i = 0;
		while (i < nums.length - 1) {

			if (nums[i] != nums[i + 1]) {
				count++;
			}

			if (count == 2) {
				l1 = 0;
				l2 = 0;
				count = 0;
			}

			if (count == 0 && nums[i] == 1) {
				l1++;
			}

			if (count == 1 && nums[i] == 1) {
				l2++;
			}

			power = Math.max(power, Math.max(l1, l2));

			i++;
		}
		if (power == 1)
			return power;
		else
			return power + 1;
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
