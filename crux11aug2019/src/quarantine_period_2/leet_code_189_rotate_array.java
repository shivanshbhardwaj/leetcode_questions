package quarantine_period_2;

import java.util.HashMap;
import java.util.Scanner;

public class leet_code_189_rotate_array {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {

		int n = s.nextInt();

		int[] arr = new int[n];

		int r = s.nextInt();

		int[] a = input(arr);
		
		work(a, r);
		
		display(a);

	}

	private static void work(int[] nums, int k) {
		k=k%nums.length;

		HashMap<Integer, Integer> h = new HashMap<Integer, Integer>();

		for (int i = 0; i < nums.length; i++) {

			h.put(i, nums[i]);

		}

		int count = 0;
		int w = 0;
		int k2=nums.length - k;

		while (count < nums.length) {

			while (k > 0) {
				nums[count] = h.get(nums.length - k);
				k--;
				count++;
			}

			while (w < k2) {

				nums[count] = h.get(w);

				w++;
				count++;

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
