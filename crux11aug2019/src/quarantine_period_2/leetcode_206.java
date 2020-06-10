package quarantine_period_2;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

import L21_Oct16.link_list_garima_mam;
import rashidbhaiyabacktracking.work_board;

public class leetcode_206 {
	static Scanner s= new Scanner(System.in);
	
	public static void main(String[] args) {
		
	link_list_garima_mam l= new link_list_garima_mam();
	
	input(l);
		
		work(l); 
		
		
	}

	private static void work(link_list_garima_mam l) {

		   HashMap<Integer,Integer> h = new HashMap<Integer, Integer>();
	    for(int n=0; n<=31;n++)
	    {
	        h.put(n,n);
	    }
	    
	    for(int n1=65 ;n1<=90 ;n1++)
	    {
	        h.put(n1,n1);
	    }
	    
	    for(int n2= 97;n2<=122 ;n2++)
	    {
	        h.put(n2,n2);
	    }
	    
	    
	    
	}
	    
	public static void input(link_list_garima_mam l) {

		for (int n = 0; n < l.size(); n++) {
			
			l.addlast(s.nextInt());

			}

	}

	
	
}
