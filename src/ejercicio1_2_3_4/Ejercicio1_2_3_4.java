package ejercicio1_2_3_4;

import java.util.Scanner;

public class Ejercicio1_2_3_4 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("First number: ");
		double a = input.nextDouble();
		
		System.out.print("Second number: ");
		double b = input.nextDouble();

		System.out.println("+: " + (a + b));
		System.out.println("-: " + (a - b));
		System.out.println("*: " + (a * b));
		System.out.println("/: " + (a / b));

		input.close();
	}
}
