package ejercicio9;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Pesetas: ");
		double pesetas = input.nextDouble();
		
		System.out.println("Es " + (pesetas * 0.006) + "€");
		
		input.close();
	}

}
