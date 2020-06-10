package quarantine_period_2;

import java.util.Scanner;

public class LEET_CODE_190_reverse_nits {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int n = s.nextInt(2);

		System.out.println(work(n));

	}

	private static int work(int n) {

		String s = Integer.toString(n, 2);
		System.out.println(s);

		StringBuilder sb = new StringBuilder();

		for (int i = s.length() - 1; i >= 0; i--) {
			

			sb.append(s.charAt(i));

		}
		String str = sb.toString();

		int a = Integer.parseInt(str);
		
		

		return a;
	}
}