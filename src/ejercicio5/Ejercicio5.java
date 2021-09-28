package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("First number: ");
		double a = input.nextDouble();

		System.out.print("Second number: ");
		double b = input.nextDouble();
		
		System.out.println("Result: " + (a % b));

		input.close();
	}

}
