package LEET_CODE;

public class length_of_string {
public static void main(String[] args) {
	
}
	    public int lengthOfLastWord(String s) {
	        String [] arr=   s.split(" ");
	        if(arr[arr.length-1]== null)
	            return 0;
	    else 
	        return arr[arr.length].length();
	        
	    }
	}

