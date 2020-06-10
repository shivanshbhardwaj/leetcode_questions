package quarantine_period_2;

import java.util.ArrayList;
import java.util.Scanner;

public class leetcode_970 {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {

		int x = s.nextInt();
		int y = s.nextInt();
		int bound = s.nextInt();

		int i = work1(x, y, bound);
		System.out.println(i);
		System.out.println(work2(x, y, i, bound));

	}

	private static ArrayList<Integer> work2(int x, int y, int i, int bound) {

		ArrayList<Integer> al = new ArrayList<Integer>();
		
		if(bound==0)
		{
			return al;
		}
		
		if(x==1&&y==1&&bound==1)
		{
			return al;
		}
		
		
		if((x==1&&y==1)||(x>=bound && y>=bound))
		{
			al.add(2);
			return al;
		}
		
		if(x>=bound||y>=bound)
		{
			
			for(int p=0;p<=i;p++)
			{
				int s1=(int) (Math.pow(Math.min(x, y), p)+1);
				
				if(s1<=bound)
				al.add(s1);
			}
			return al;
		}
		
		
		for (int n = 0; n <= i; n++) {
			for (int p = 0; p <= i; p++) {

				int sum = (int) (Math.pow(x, n) + Math.pow(y, p));

				if (sum <= bound&&al.contains(sum)!=true) {
					
					al.add(sum);
				}

			}

		}
return al;
	}

	private static int work1(int x, int y, int bound) {
		int i = 0;
		int d = 5;
		while (d > 1) {

			if (x == 1 && y == 1) {
				return 0;
			}

			if (Math.min(x, y) != 1)
				d = (int) (bound / Math.pow(Math.min(x, y), i));
			else
				d = (int) (bound / Math.pow(Math.max(x, y), i));

			i++;
		}
		return (i - 1);
	}

}
