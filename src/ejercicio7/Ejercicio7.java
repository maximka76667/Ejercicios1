package ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Base de tri�ngulo: ");
		double base = input.nextDouble();
		
		System.out.print("Altura: ");
		double altura = input.nextDouble();

		System.out.println("�rea: " + (altura * base / 2));

		input.close();
	}
}
