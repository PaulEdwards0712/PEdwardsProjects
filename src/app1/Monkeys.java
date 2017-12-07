package app1;

public class Monkeys {

	
	public static void main(String[] args) { 
		System.out.println("Are Monkeys in trouble: " +
				checisOneMonkeySmiling(true, false));
}

static boolean checisOneMonkeySmiling(boolean aSmile, boolean bSmile) {
	if(aSmile == bSmile) {
		return true;
	}
	else {
		return false;
	}
}
	
}


