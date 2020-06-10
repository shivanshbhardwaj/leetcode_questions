package quarantine_period_2;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class leetcode_1009_compement_of_A_base_integer {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int n = s.nextInt();

		System.out.println(bitwiseComplement(n));

	}

	private static int bitwiseComplement(int N) {

		String a = Integer.toBinaryString(N);

		int i = 0;
		StringBuilder sb = new StringBuilder();

		while (i < a.length()) {

			if (a.charAt(i) == '0') {
				sb.append('1');
			} else {
				sb.append('0');
			}
			i++;
		}

		List<Integer> list = new LinkedList<Integer>();

		String[] numbers = sb.toString().split("");// if spaces are uneven, use \\s+ instead of " "
		for (String number : numbers) {
			list.add(Integer.valueOf(number));
		}

		int h = sb.length() - 1;
		int l = list.size() - 1;
		int no = 0;
		int m = 0;
		while (l >= 0) {
			no = no + (int) (list.get(l) * (Math.pow(2, m)));
			m++;
			h--;
			l--;
		}

		return no;

	}

}
