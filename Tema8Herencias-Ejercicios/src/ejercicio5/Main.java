package ejercicio5;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int seleccionUsuario = 0;

		double lado1;

		double lado2;

		double lado3;

		Poligono lista[] = new Poligono[0];

		Scanner dogma = new Scanner(System.in);

		while (seleccionUsuario != 4) {

			System.out.println("Seleccione una opcion: \n 1. Introducir triangulo."
					+ " \n 2. Introducir rectangulo. \n 3. Mostrar lista de poligonos: \n 4. Cerrar programa.");

			seleccionUsuario = dogma.nextInt();

			switch (seleccionUsuario) {

			case 1 -> {
				System.out.println("Introduzca datos para triangulo: ");

				System.out.println("Introduzca valor para lado 1:");
				lado1 = dogma.nextDouble();

				System.out.println("Introduzca valor para lado 2:");
				lado2 = dogma.nextDouble();

				System.out.println("Introduzca valor para lado 3:");
				lado3 = dogma.nextDouble();

				if (lado1 > 0 && lado2 > 0 && lado3 > 0) {

					lista = Arrays.copyOf(lista, lista.length + 1);
					lista[lista.length - 1] = new Triangulo(3, lado1, lado2, lado3);
				} else {
					System.out.println("Introduccion de datos erronea, pruebe otra vez. ");
				}
			}

			case 2 -> {
				System.out.println("Introduzca datos para rectangulo: ");

				System.out.println("Introduzca valor para lado 1:");
				lado1 = dogma.nextDouble();

				System.out.println("Introduzca valor para lado 2:");
				lado2 = dogma.nextDouble();

				if (lado1 > 0 && lado2 > 0) {

					lista = Arrays.copyOf(lista, lista.length + 1);
					lista[lista.length - 1] = new Rectangulo(4, lado1, lado2);
				} else {
					System.out.println("Introduccion de datos erronea, pruebe otra vez. ");
				}
			}

			case 3 -> {

				for (int i = 0; i < lista.length; i++) {
					System.out.println(lista[i].toString());
					System.out.println("Area " + lista[i].area());
				}
			}

			case 4 -> {
				// comunico cierre de programa con mensaje por pantalla
				System.out.println("Cerrando programa...");
			}

			default -> {
				// muestro mensaje de error por pantalla indicando opciones correctas
				System.err.println("Asegurese de seleccionar una opcion entre el 1 y el 4 incluidos.");
				System.out.println();
			}

			}
		}

		dogma.close();
	}

}
