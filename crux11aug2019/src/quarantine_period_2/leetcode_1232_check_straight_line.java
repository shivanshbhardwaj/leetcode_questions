package quarantine_period_2;

import java.util.Scanner;

public class leetcode_1232_check_straight_line {

	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {

		int n = s.nextInt();

		int[][] coordinates = new int[n][2];
		input(coordinates);
		System.out.println(checkStraightLine(coordinates));
	}

	private static boolean checkStraightLine(int[][] coordinates) {
		double c ;

		double m ;

		if(coordinates[1][0] - coordinates[0][0] == 0)
		{
			m = Integer.MAX_VALUE;
		}
		else {
			m = (double) (coordinates[1][1] - coordinates[0][1]) / (double)(coordinates[1][0] - coordinates[0][0]);
		}
		
		
		
		
		System.out.println(m);
		for (int n = 2; n < coordinates.length; n++) {

			if((coordinates[n][0] - coordinates[n - 1][0]) == 0)
				c = Integer.MAX_VALUE;
			else
				c = (double)(coordinates[n][1] - coordinates[n - 1][1]) / (double)(coordinates[n][0] - coordinates[n - 1][0]);

			System.out.println("------------");
			System.out.println(c);

			if (c != m) {
				return false;
			}

		}
		return true;
	}

	public static void input(int[][] ar) {

		for (int n = 0; n < ar.length; n++) {
			for (int n1 = 0; n1 < ar[0].length; n1++) {
				ar[n][n1] = s.nextInt();

			}

		}

	}

}
