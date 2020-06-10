package quarantine_period_2;

import java.util.Scanner;

public class leetcode_66_plus_one {static Scanner s = new Scanner(System.in);

public static void main(String[] args) {

	int n = s.nextInt();
	int[] arr = new int[n];
	int[] a = input(arr);
	work(arr);

}

private static void work(int[] digits) {
	  
   
    
    double j =0;
    int p=digits.length-1;
    for(int n=0;n<digits.length;n++)
    {
        
        j+=(digits[n]*Math.pow(10,p));
        
        p--;
    }	
    j=j+1;
    
    System.out.println(j);
    
   
    double a=j;
    int x=0;
    while(a>0)
    {
    	
    	a=a/10;
    	x++;
    }
    System.out.println(x);
    
    int [] ar=new int [x];
    
    for (int i = x-1; i >=0; i--) {
		ar[i]=(int) (j%10);
		j=j/10;
    	
	}
    display(ar);
    
    
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
