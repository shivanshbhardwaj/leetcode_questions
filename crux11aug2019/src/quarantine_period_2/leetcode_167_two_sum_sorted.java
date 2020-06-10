package quarantine_period_2;

import java.util.Scanner;

public class leetcode_167_two_sum_sorted {

	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {

		int n = s.nextInt();
		int target = s.nextInt();
		int[] numbers = new int[n];
		int[] a = input(numbers);
		int [] b=twoSum( numbers,  target);
		display(b);

	}

	private static int[] twoSum(int[] numbers, int target) {

		int [] arr = new int [2];
        int i =0;
        int j=numbers.length-1;
        
        while(i<j)
        {
            if((numbers[i]+numbers[j])==target)
            {
                arr[0]=i+1;
                arr[1]=j+1;
                return arr;
            }
            
            
            if((numbers[i]+numbers[j])>target)
            {
                j--;
            }
            
            
            if((numbers[i]+numbers[j])<target)
            {
                i++;
            }
            
            
            
            
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
