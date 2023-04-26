package ejercicio3;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		String nombre = "";// guardara valor de nombre

		double precio; // guardara valor de precio

		int diasCaducar;// guardara valor de dias hasta caducar

		String tipo = "";// guardara tipo de producto

		int cantidad = 5;// guardara cantidad del producto comprada, inicializo a 5

		int seleccionUsuario = 0;// guarda seleccion del usuario inicializo a 0 para uso en bucle

		// creo un array de tipo Producto de nombre lista de longitud 0
		Producto lista[] = new Producto[0];

		// creo un escaner y lo nombro dogma
		Scanner dogma = new Scanner(System.in);

		while (seleccionUsuario != 5) {

			// imprimo por pantalla mensaje con el menu
			System.out.println(
					"Seleccione una opcion:\n1. Mostrar productos.\n2. Añadir producto no perecedero.\n3. Añadir producto perecedero."
							+ "\n4. Ver precio total por 5 unidades de cada producto en la lista.\n5. Salir.");

			// recojo la seleccion del usuario con escaner y la asigno a seleccionUsuario
			seleccionUsuario = dogma.nextInt();
			// consumo linea de escaner para evitar errores al cambiar tipo de eacaner
			dogma.nextLine();

			// evaluo seleccionUsuario
			switch (seleccionUsuario) {

			// si seleccionUsuario igual a 1
			case 1 -> {

				// recorro el array lista mostrando por pantalla todos sus productos
				for (int i = 0; i < lista.length; i++) {
					System.out.println(lista[i]);
				}
			}
			// si seleccionUsuario igual a 2
			case 2 -> {

				// solicito y recojo valores para crear nuevo objeto tipo noPerecedero
				System.out.println("Introduzca nombre del producto:");
				nombre = dogma.nextLine();

				System.out.println("Introduzca precio del producto:");
				precio = dogma.nextDouble();
				dogma.nextLine();

				System.out.println("Introduzca tipo del producto:");
				tipo = dogma.nextLine();

				// compruebo si todos los valores son correctos
				if (precio >= 0) {
					// extiendo el array en 1 posicion
					lista = Arrays.copyOf(lista, lista.length + 1);
					// y creo objeto tipo noPerecedero en la ultima posicion recien creada con los
					// valores proporcionados
					lista[lista.length - 1] = new NoPerecedero(nombre, precio, tipo);
				}

			}

			// si seleccionUsuario igual a 3
			case 3 -> {

				// solicito y recojo valores para crear nuevo objeto tipo perecedero
				System.out.println("Introduzca nombre del producto:");
				nombre = dogma.nextLine();

				System.out.println("Introduzca precio del producto:");
				precio = dogma.nextDouble();
				dogma.nextLine();

				System.out.println("Introduzca dias restantes hasta fecha de caducidad del producto:");
				diasCaducar = dogma.nextInt();

				// compruebo si todos los valores son correctos
				if (precio >= 0 && diasCaducar >= 0) {
					// extiendo el array en 1 posicion
					lista = Arrays.copyOf(lista, lista.length + 1);
					// y creo objeto tipo perecedero en la ultima posicion recien creada con los
					// valores proporcionados
					lista[lista.length - 1] = new Perecedero(nombre, precio, diasCaducar);
				}
			}

			// si seleccionUsuario igual a 4
			case 4 -> {
				// recorro el array lista
				for (int i = 0; i < lista.length; i++) {

					// mostrando por pantalla el nombre y el precio total de cada producto llamando
					// al getter con el objeto en la posicion actual y al metodo calcular con el
					// objeto en la posicion actual y pasandole cantidad como parametro de entrada
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

		}

		// cierro escaner
		dogma.close();
	}

}
