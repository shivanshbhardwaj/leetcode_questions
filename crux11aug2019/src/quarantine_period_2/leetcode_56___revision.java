package quarantine_period_2;

import java.util.ArrayList;
import java.util.Scanner;


public class leetcode_56___revision {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {

		int n = s.nextInt();

		int[][] ar = new int[n][2];

		input(ar);

		int[][] a = merge(ar);
		display(a);

	}

	private static void display(int[][] a) {
		for (int n = 0; n < a.length; n++) {
			for (int n1 = 0; n1 < a[0].length; n1++) {

				System.out.print("  " + a[n][n1] + "  ");

			}
			System.out.println();
		}
	}

	private static int[][] merge(int[][] intervals) {

		ArrayList<int[]> al = new ArrayList<int[]>();
		int flag = 0;
		int[][] ra = new int[intervals.length][2];

		for (int n = 0; n < intervals.length; n++) {

			
			
			flag = 0;
			ra[n][0] = intervals[n][0];
			ra[n][1] = intervals[n][1];

//				System.out.println(ra[n][n1]);
//				System.out.println("---------------------");
			if ((((n < intervals.length - 1) && (intervals[n+1][0] >= intervals[n ][0]) )) ||((n < intervals.length - 1)&&(intervals[n][0] ==intervals[n + 1][0])&&(intervals[n][1] ==intervals[n + 1][1])
) ) {

					ra[n][0] = Math.min(intervals[n][0],intervals[n+1][0]);
					ra[n][1] = Math.max(intervals[n][1],intervals[n+1][1]);
			

				flag = 1;
				n++;
			}

			System.out.println();
			if (flag == 1)
				al.add(ra[n - 1]);
			else
				al.add(ra[n]);

		}
		int[][] r = new int[al.size()][];

		al.toArray(r);
		return r;

	}

	public static void input(int[][] ar) {

		for (int n = 0; n < ar.length; n++) {
			for (int n1 = 0; n1 < ar[0].length; n1++) {
				ar[n][n1] = s.nextInt();

			}

		}

	}
}
