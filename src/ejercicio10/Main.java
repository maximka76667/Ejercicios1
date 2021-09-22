package ejercicio10;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("X: ");
		double x = input.nextDouble();
		
		double result = 2 * Math.pow(x, 2) + 5 * x - 3;
		
		System.out.println("Result: " + result);
		
		input.close();
	}

}
