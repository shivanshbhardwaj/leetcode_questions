package quarantine_period_2;

import java.util.ArrayList;
import java.util.Scanner;

public class leetcode_653_two_sum_four {
	 static int count=0;
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		TreeNode root = null;
		int k = s.nextInt();
		findTarget(root, k);

	}

	public static boolean findTarget(TreeNode root, int k) {


		ArrayList<Integer>	w= work(root, count, k);
		if(w.isEmpty()) {
			return true;
		}
		else {
			return false;
		}

	}

	private static ArrayList<Integer> work(TreeNode root, int count, int target) {

		if (root.left == null && root.right == null) {
			ArrayList<Integer> al = new ArrayList<Integer>();
			al.add(root.val);
			return al;
		}
		ArrayList<Integer> q = new ArrayList<Integer>();
		if(count==0) {

		ArrayList<Integer> a = null;
		if (root.left != null)
			a = work(root.left, count, target);

		ArrayList<Integer> b = null;
		if (root.right != null)
			b = work(root.right, count, target);

		ArrayList<Integer> r = new ArrayList<Integer>();
 if(a!=null)
		for (int val : a) {

			if (val + root.val == target) {
				r.removeAll(r);
				
				count++;
			}

			if(b!=null)
			for (int val2 : b) {

				if (root.val + val2 == target) {
					count++;

				}

				if (val + val2 == target) {
					count++;
				} else {
					r.add(val2);
				}
			}
			if (count < 1) {
				r.add(val);
			}
		}
		return r;
		}
		return q;
		

	}

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode() {
		}

		TreeNode(int val) {
			this.val = val;
		}

		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;

		}
	}
}