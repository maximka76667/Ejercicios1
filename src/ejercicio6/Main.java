package ejercicio6;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Tu cadena: ");
		String nombre = input.nextLine();
		
		System.out.println("La cadena: " + nombre);
		System.out.println("La longitud de la cadena: " + nombre.length());
		
		input.close();
	}

}
