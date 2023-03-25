package chandu_100programs;

import java.util.Scanner;

public class NestedIfElse {

	public static void main(String[] args) {
		
		int marksObtained ,passingMarks;
		char grade;
		passingMarks = 40;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("input marks scored by you");
		
		marksObtained = sc.nextInt();
		
		if(marksObtained>=passingMarks) {
			
			if (marksObtained>90)
				grade = 'A';
			
			else if (marksObtained>70)
				grade = 'B';
	        
				else if (marksObtained>60)	
					grade = 'C';
					
					else 
						grade = 'D';
			System.out.println("you passed the exam"+grade);
		}
			
			else {
				grade = 'F';
			System.out.println("you fail the exam"+grade);
			}
			
		
		}

	}


