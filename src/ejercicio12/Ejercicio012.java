package ejercicio12;

import java.util.Scanner;

public class Ejercicio012 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Altura: ");
		double altura = entrada.nextDouble();
		
		System.out.print("Radio: ");
		double radio = entrada.nextDouble();
		
		double volumen = Math.PI * Math.pow(radio, 2) * altura;
		
		System.out.println("Volumen: " + volumen);
		
		entrada.close();
	}
}
