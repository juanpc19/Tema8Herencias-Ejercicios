package ejercicio3;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		String nombre = "";

		double precio;

		int diasCaducar;

		String tipo = "";

		int cantidad = 5;

		int seleccionUsuario = 0;

		Producto lista[] = new Producto[0];

		Scanner dogma = new Scanner(System.in);

		do {

			System.out.println(
					"Seleccione una opcion:\n1. Mostrar productos.\n2. Añadir producto no perecedero.\n3. Añadir producto perecedero."
					+ "\n4. Ver precio total por 5 unidades de cada producto en la lista.\n5. Salir.");

			seleccionUsuario = dogma.nextInt();
			dogma.nextLine();

			switch (seleccionUsuario) {

			case 1 -> {

				for (int i = 0; i < lista.length; i++) {
					System.out.println(lista[i]);
				}
			}

			case 2 -> {

				System.out.println("Introduzca nombre del producto:");
				nombre = dogma.nextLine();

				System.out.println("Introduzca precio del producto:");
				precio = dogma.nextDouble();
				dogma.nextLine();

				System.out.println("Introduzca tipo del producto:");
				tipo = dogma.nextLine();

				if (precio >= 0) {
					lista = Arrays.copyOf(lista, lista.length + 1);
					lista[lista.length - 1] = new NoPerecedero(nombre, precio, tipo);
				}

			}

			case 3 -> {

				System.out.println("Introduzca nombre del producto:");
				nombre = dogma.nextLine();

				System.out.println("Introduzca precio del producto:");
				precio = dogma.nextDouble();
				dogma.nextLine();

				System.out.println("Introduzca dias restantes hasta fecha de caducidad del producto:");
				diasCaducar = dogma.nextInt();

				if (precio >= 0 && diasCaducar >= 0) {
					lista = Arrays.copyOf(lista, lista.length + 1);
					lista[lista.length - 1] = new Perecedero(nombre, precio, diasCaducar);
				}
			}

			case 4 -> {
				for (int i = 0; i < lista.length; i++) {

					System.out.println("Este sera el precio total por 5 unidades del producto " + lista[i].getNombre()
							+ ": " + lista[i].calcular(cantidad));
				}
			}

			// si seleccionUsuario igual a 5 cierro el programa
			case 5 -> {
				// comunico cierre de programa con mensaje por pantalla
				System.out.println("Cerrando programa...");
			}

			// si seleccionUsuario igual a diferente a todos los case esperados
			default -> {
				// muestro mensaje de error por pantalla indicando opciones correctas
				System.out.println("Asegurese de seleccionar una opcion entre el 1 y el 5 incluidos.");
				System.out.println();
			}

			}

		} while (seleccionUsuario != 5);

		// cierro escaner
		dogma.close();
	}

}
