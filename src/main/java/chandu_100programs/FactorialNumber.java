package chandu_100programs;

public class FactorialNumber {

	public static void main(String[] args) {
			
		int i, fact=1;
		
		int number = 10;
		
		for (i=1;i<=10;i++)
		{
			fact = fact*i;
		}
      System.out.println("factorial of "+number+ "is" +" "+ fact);
	}

}
