package ejercicio13;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		final double PI = 3.1416;

		Scanner input = new Scanner(System.in);

		System.out.print("Radio de la esfera: ");
		double r = input.nextDouble();

		double result = 4 * PI * Math.pow(r, 3) / 3;
		System.out.println("Result: " + result);

		input.close();
	}

}
