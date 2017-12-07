package app1;

public class Absolute {
	public static void main(String[] args) { 
		System.out.println("Absolute Difference is: " + diff21(20));
}
static int diff21(int num) { 

	if (num > 21) {
	    return 2*Math.abs(21 - num); 
	     } else {
	    	 return Math.abs(21 - num);
	     }
}
}	    		
