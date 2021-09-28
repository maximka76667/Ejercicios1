package ejercicio8;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Radio: ");
		double radio = input.nextDouble();

		System.out.println("Perimetro: " + (2 * Math.PI * radio));

		input.close();
	}

}
