package quarantine_period_2;

import java.util.Scanner;

public class leetcode_605 {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {

		int n = s.nextInt();

		int[] arr = new int[n];
		int[] a = input(arr);
		int n2 = s.nextInt();
		System.out.println(work(a, n2));
	}

	private static boolean work(int[] flowerbed, int n) {


		  int count = 0;
				if (flowerbed.length > 3) {
		            
		            
					if (flowerbed[0] == 0 && flowerbed[1] == 0) {
						flowerbed[0] = 1;
						count++;
					}
					if (flowerbed[flowerbed.length - 1] == 0 && flowerbed[flowerbed.length - 2] == 0) {
						flowerbed[flowerbed.length - 1] = 1;
						count++;
					}
		            
					for (int n1 = 2; n1 < flowerbed.length - 2; n1++) {

						if (flowerbed[n1] == 0 && flowerbed[n1 - 1] == 0 && flowerbed[n1 + 1] == 0) {

							flowerbed[n1] = 1;

							count++;
						}
					}


				} else {
					if (flowerbed.length == 3)
		            {	if (flowerbed[0] == 1 && flowerbed[1] == 0 && flowerbed[2] == 0||flowerbed[0] == 0 && flowerbed[1] == 0 && flowerbed[2] == 1)
							count++;
					
					if(flowerbed[0] == 0 && flowerbed[1] == 0 && flowerbed[2] == 0)
					{
						count=count+2;
					}
		             
		             
		            }

						 if (flowerbed.length == 2) 
							if (flowerbed[0] == 0 && flowerbed[1] == 0) {
								count++;
							}

						 if (flowerbed.length == 1) 
								if (flowerbed[0] == 0) {
									count++;
								}

							
						}
				

				return n<=count ? true : false;
		    

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
