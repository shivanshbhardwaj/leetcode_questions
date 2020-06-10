package quarantine_period_2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class leetcode_350_intersection_of_two_arrays2 {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {

		int n1 = s.nextInt();

		int[] nums1 = new int[n1];

		input(nums1);
		
		int n2 = s.nextInt();
		
		int[] nums2 = new int[n2];
		
		input(nums2);
		
		intersection(nums1, nums2);

//		display(nums1);
//		display(nums2);

	}

	private static int[] intersection(int[] nums1, int[] nums2) {

		HashMap<Integer, Integer> h = new HashMap<Integer, Integer>();

		int i = 0;
		while (i < nums1.length) {
			if (h.containsKey(nums1[i]) == false) {
				h.put(nums1[i], 1);
			}else {

				h.put(nums1[i], h.get(nums1[i]) + 1);
			}
			
			i++;

		}
		System.out.println(h);
		
		
		

		i = 0;
		ArrayList<Integer> al = new ArrayList<Integer>();
		while (i < nums2.length) {
			if ( h.get(nums2[i])!=null&&h.get(nums2[i])>0)  {
				al.add(nums2[i]);
				
				h.put(nums2[i], h.get(nums2[i])-1);
			}
			
			i++;

		}
System.out.println(al);

int [] arr = new int [ al.size()];

for (int j = 0; j < arr.length; j++) {
	
	arr[j]=al.get(j);
}




return arr;
	
		

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
