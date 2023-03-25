package chandu_100programs;

import java.util.Scanner;

public class FindLargestNum {

	public static void main(String[] args) {
		
		int x,y,z;
		System.out.println("enter three integers");
		Scanner sc = new Scanner(System.in);
		
		x = sc.nextInt();                              //&& T-T = T , F-T = F , T-F = F , F-F = F
		y = sc.nextInt();                              
		z = sc.nextInt();                              // T-T = T , F-T = T , T-F = T , F-F = F
		
		if (x>y && x>z)
			System.out.println("First number is largest");
		
		else if (y>x && y>z)
			System.out.println("Second number is largest");
		
		else if (z>x && z>y)
			System.out.println("Third number is largest");
		
		else 
			System.out.println("entered numerbs or not distinct");
				

	}

}
