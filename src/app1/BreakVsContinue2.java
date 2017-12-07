package app1;

public class BreakVsContinue2 {

	public static void main(String[] args) {
		System.out.println("Starting Loop");
		for(int n=0;n<7;n++)
		{
			System.out.println("in loop:" +n);
			if(n==2)
			{
				continue;
			}
			System.out.println("Survived First Guard");
			if(n==4)
			{
				break;
			}
			System.out.println("Survived Second Guard");
		}
		System.out.println("End of Loop or Exit via Break");
			}
		}
