package chandu_100programs;

import java.util.Scanner;

public class CheckOddOrEven {

	public static void main(String[] args) {
		int x;
		
		System.out.println("Enter the integer to check whether it is odd or even");
		
		Scanner sc = new Scanner(System.in);
		
		x = sc.nextInt();
		
		if (x%2 == 0)
			System.out.println("integer is even");
		else 
			System.out.println("integer is odd");

	}

}
