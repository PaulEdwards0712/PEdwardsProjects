package app1;

public class BreakVsContinue {

	public static void main(String[] args) {
	   for(int i=0;i<10;i++)
	   {
          if(i==4)
          {
        	  break;
          }
          System.out.print(i+"\t");
	   }
	   	
	   System.out.println("_");
	   for(int i=0;i<10;i++)
	   {
		   if(i==4)
		   {
			   continue;
		   }
		 System.out.print(i+"\t");
	   }
	}
		 
		 
	   	{
}
}