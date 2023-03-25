package chandu_100programs;

import java.util.Scanner;

public class IfelseClause2 {

	public static void main(String[] args) {
		
		int marksObtained,passingmarks;
		
		passingmarks = 40;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter marks scored by you");
		
		marksObtained = sc.nextInt();
		
		if (marksObtained>=passingmarks) {
			System.out.println("you passed the exam");
		}
		else {
			System.out.println("you fail the exam");
		}
		

	}

}
