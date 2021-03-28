package DiegoColinas;

import java.util.Scanner;

public class Codigo_prueba {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("¿Que deseas escribir?\n"+"1. Hola Mundo\n"+"2. Hola Pepe\n"+"3. Sumar 2+2");
		int respuesta=sc.nextInt();
		switch(respuesta) {
		case 1: System.out.println("Hola World");
				break;
		case 2: System.out.println("Hola Pepe");
				break;
		case 3: System.out.println(2+2);
				break;
		}
	}

}
