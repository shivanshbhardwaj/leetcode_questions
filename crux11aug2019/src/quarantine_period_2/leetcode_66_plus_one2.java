package quarantine_period_2;

import java.util.Scanner;

public class leetcode_66_plus_one2 {static Scanner s = new Scanner(System.in);

public static void main(String[] args) {

//	int n = s.nextInt();
//	int[] arr = new int[n];
//	int[] a = input(arr);
//	work(arr);
System.out.println(Add(999999999,1));
}

private static void work(int[] digits) {
	  
   
 
    
}
static int Add(int x, int y) 
{ 
    // Iterate till there is no carry 
    while (y != 0)  
    { 
        // carry now contains common 
        // set bits of x and y 
        int carry = x & y; 
System.out.println(carry);
        // Sum of bits of x and  
        // y where at least one  
        // of the bits is not set 
        x = x ^ y; 
        System.out.println(x);

        // Carry is shifted by  
        // one so that adding it  
        // to x gives the required sum 
        y = carry << 1; 
        System.out.println(y);
    } 
    return x; 
}

public static void display(int[] arr) {
	for (int a = 0; a < arr.length; a++) {
		System.out.print("  "+arr[a]);
	}
}

public static int[] input(int[] arr) {
	for (int a = 0; a < arr.length; a++) {
		arr[a] = s.nextInt();
	}
	return arr;
}


}
