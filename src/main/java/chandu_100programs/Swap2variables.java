package chandu_100programs;

import java.util.Scanner;

public class Swap2variables {

	public static void main(String[] args) {
	int x,y,t;   // swap two numbers
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the value of x and y");
	
	x=sc.nextInt();
	y=sc.nextInt();
	
	System.out.println("before swapping numbers:"+x+"  "+y);
	//swapping
	t=x;
	x=y;
	y=t;
	System.out.println("after swapping:"+x+" "+y);
	System.out.println();

	}

}
