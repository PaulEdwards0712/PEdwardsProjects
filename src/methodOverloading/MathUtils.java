package methodOverloading;

public class MathUtils {

	public int sum(int num1, int num2) {
		return num1+num2;
	}
	
	public double sum(double num1, double num2) {
		return num1+num2;
	}
	
public int sum(int num1, int num2, int num3) {
		return num1 + num3 + num2;
	}

}