package revision;

import java.util.ArrayList;
import java.util.Scanner;

public class vonneumanbinaryrepresentation {
	static Scanner s= new Scanner(System.in);

	static ArrayList<Integer> a= new ArrayList<Integer>();
	
	public static void main(String[] args) {
		
	       int n =s.nextInt();

conv(n);

for(int i=0;i<a.size();i++)

	System.out.println(a.get(i));

	}

	private static void conv(int n) {
	
		while(n!=0)
		{int ans=0;
		int n1=s.nextInt();
		int count=0;
		while(n1>0)
		{
			n1=n1/10;
		int rem=n1%10;
		ans=ans+rem*(int)Math.pow(2,count);
		count++;
	     }
		a.add(ans);
		n--;
		}
	}


}

