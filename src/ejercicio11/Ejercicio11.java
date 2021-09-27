package ejercicio11;

import java.util.Scanner;

public class Ejercicio11 {
	public static void main(String[] args) {
		final double IRPF = 0.12;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Salario bruto: ");
		double salario = entrada.nextDouble();
		
		System.out.println();
		
		entrada.close();
	}
}
