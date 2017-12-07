package app1;

public class Return {

	public static void main(String[] args) {
		boolean t = false;
		System.out.println("Before the Return.");
		if(t)return; // return to caller
		System.out.println("This won't execute.");

	}

}
