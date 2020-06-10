package quarantine_period_2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class leetcode_698_partition_to_k_equal_subset {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {

		int n = s.nextInt();
		int[] nums = new int[n];
		int target = s.nextInt();
		int[] a = input(nums);
		canPartitionKSubsets(nums,  target);
//		display(a);

	}

	private static void canPartitionKSubsets(int[] nums, int k) {
		
ArrayList<Integer> al = new  ArrayList<Integer>();
ArrayList<ArrayList<Integer>> all = new  ArrayList<ArrayList<Integer>>();
HashMap<Integer, Integer> h  = new HashMap<Integer, Integer>();
HashMap<Integer, Integer> h2  = new HashMap<Integer, Integer>();
		int vidx=0;
		ArrayList<Integer> bc =find_subset(nums,vidx,al,h,h2,all);
		
		System.out.println(bc);
		System.out.println(all);
		
//		System.out.println(h);
//		System.out.println(h2);
		
		
		
		
		
		
		
	}

	private static ArrayList<Integer> find_subset(int[] nums, int vidx, ArrayList<Integer> al, HashMap<Integer, Integer> h, HashMap<Integer, Integer> h2, ArrayList<ArrayList<Integer>> all) {
		
		
		if(vidx==nums.length-1)
		{
			ArrayList<Integer> bc = new  ArrayList<Integer>();
			
			bc.add(nums[vidx]);
			h.put(nums[vidx],nums.length-vidx);
			all.add(bc);
			return bc;
		}
		
		
	
		ArrayList<Integer> ra = find_subset(nums, vidx+1, al, h, h2, all);
		
		ArrayList<Integer> ma = new  ArrayList<Integer>();
		ArrayList<Integer> a = new  ArrayList<Integer>();
		a.add(nums[vidx]);
		all.add(a);
		
		ma.add(nums[vidx]);
		h.put(nums[vidx],1);
		for(int val:ra)
		{ArrayList<Integer> a2 = new  ArrayList<Integer>();
			ma.add(val);
			a2.add(val);
			a2.add(nums[vidx]);
			all.add(a2);
		}
		all.add(ma);
		return ma;
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
