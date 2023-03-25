package chandu_100programs;

import java.util.Scanner;

public class FahrenheitToCelsius {

	public static void main(String[] args) {
	/*	float Fahrenheit, Celsius;
		Fahrenheit = 48;
		Celsius = ((Fahrenheit-32)*5)/9;
		System.out.println("temparature in Celsius="+Celsius);

	}

}*/
     float temparature;
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter tem in Fahrenheit");
     temparature = sc.nextInt();
     temparature = ((temparature-32)*5)/9;
     System.out.println("temparature in celsius="+temparature);
     
     
     
	}}
     