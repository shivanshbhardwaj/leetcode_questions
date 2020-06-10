package quarantine_period_2;

import java.util.HashMap;
import java.util.Scanner;

public class leet_code_2_add_two_nos {

	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {

//		String str= s.next();
		ListNode l1 = null;
		ListNode l2 = null;

		input(l1, l2);
		addTwoNumbers(l1, l2);

	}

	private static void input(ListNode l1, ListNode l2) {

		int n = s.nextInt();

		int p = s.nextInt();
		l1.val = p;
		ListNode temp = l1;
		while (n >= 0) {
			ListNode l21 = null;
			l21.val = s.nextInt();

			temp.next = l21;

			temp = l21;

			n--;

		}

		int n2 = s.nextInt();

		int p2 = s.nextInt();
		l2.val = p2;
		ListNode temp2 = l2;
		while (n2 >= 0) {
			ListNode l21 = null;
			l21.val = s.nextInt();

			temp2.next = l21;

			temp2 = l21;

			n2--;

		}
	}

	public class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}

	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

		StringBuilder sb1 = new StringBuilder();
		StringBuilder sb2 = new StringBuilder();
		ListNode x1 = l1;
		ListNode x2 = l2;

		while (x1 != null) {
			sb1.append(x1.val);

			x1 = x1.next;

		}

		while (x2 != null) {
			sb2.append(x2.val);

			x2 = x2.next;

		}

		int k = Integer.parseInt(sb1.toString());
		int l = Integer.parseInt(sb2.toString());

		int sum = k + l;

		ListNode q = null;

		q.val = sum % 10;

		sum = sum / 10;
		ListNode t = q;

		while (sum > 0) {
			ListNode g = null;
			g.next = t;
			g.val = sum % 10;

			t = g;

			sum = sum / 10;

		}

		return t;

	}

}