package quarantine_period_2;

import java.util.Scanner;

public class leetcode_88_merge_two_sorted_arrays {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {

		int n1 = s.nextInt();
		int n2 = s.nextInt();
		int[] nums1 = new int[n1];
		int[] a = input(nums1);

		int[] nums2 = new int[n2];

		int[] b = input(nums2);

		merge(nums1, n1, nums2, n2);
//		display(a);
//		display(b);

	}

	private static void merge(int[] nums1, int m, int[] nums2, int n) {

		int i = 0;
		int j = 0;
		int l = nums1.length - 1;
		while (j<nums2.length&&i<l) {

			if (nums2[j] <= nums1[i]) {

				copy(nums1,l-1,i);

				nums1[i] = nums2[j];
				
             l--;
             j++;
			}
			i++;
			

		}
		
		while(i<nums1.length&&j<nums2.length)
		{
			nums1[i]=nums2[j];
			i++;
			j++;
			
		}System.out.println();
		System.out.println("and indices are");
		System.out.println(i+"    "+j);
display(nums1);
	}

	
	private static void copy(int[] nums1, int s, int i) {

		for (int j =s; j >=i; j--) {
			
			nums1[j]=nums1[j-1];
			
		}
		display(nums1);
		
	}

	public static void display(int[] arr) {
		for (int a = 0; a < arr.length; a++) {
			System.out.print(" ----"+arr[a]);
		}
	}

	public static int[] input(int[] arr) {
		for (int a = 0; a < arr.length; a++) {
			arr[a] = s.nextInt();
		}
		return arr;
	}

}
