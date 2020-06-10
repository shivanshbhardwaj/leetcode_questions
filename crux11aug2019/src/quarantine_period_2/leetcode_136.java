package quarantine_period_2;

import java.util.Scanner;

public class leetcode_136 {

		static Scanner s = new Scanner(System.in);

		public static void main(String[] args) {

  	int n = s.nextInt();
			int[] arr = new int[n];
			int[] a = input(arr);
			
			System.out.println(singleNumber(a));
			
		

		}

		private static int  singleNumber(int[] nums) {
			
			int e=nums[0];
			int r=0;
			for(int n=1;n<nums.length;n++)
			{
				r=e^nums[n];
				e=r;
			}
			
			return e;
			
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
