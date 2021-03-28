package DiegoColinas;

import java.util.Scanner;

public class Codigo_prueba {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("¿Quieres escribir hola mundo?(Si/No)");
		String respuesta=sc.nextLine();
		if(respuesta.equals("Si"))
			System.out.println("Hola World");
		else
			System.out.println("Adios");
	}

}
