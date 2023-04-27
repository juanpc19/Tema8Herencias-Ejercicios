package ejercicio5;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int seleccionUsuario = 0;// contendra la seleccion del usuario, inicializo a 0 para uso en bucle

		double lado1;// contendra valor del lado 1

		double lado2; // contendra valor del lado 2

		double lado3; // contendra valor del lado 3

		// creo array lista de tipo Poligono de longitud 0
		Poligono lista[] = new Poligono[0];

		// creo escaner y lo nombro dogma
		Scanner dogma = new Scanner(System.in);

		// bucle while que se ejecutara mientras seleccionUsuario sea diferente a 4
		while (seleccionUsuario != 4) {

			// mensaje que mostrara el menu
			System.out.println("Seleccione una opcion: \n 1. Introducir triangulo."
					+ " \n 2. Introducir rectangulo. \n 3. Mostrar lista de poligonos: \n 4. Cerrar programa.");

			// recojo seleccion usuario y lo asigno a seleccionUsuario con escaner
			seleccionUsuario = dogma.nextInt();

			// evaluo seleccionUsuario
			switch (seleccionUsuario) {

			// si seleccionUsuario tiene valor igual a 1
			case 1 -> {
				// solicito datos del poligono y los asigno a sus variables
				System.out.println("Introduzca datos para triangulo: ");

				System.out.println("Introduzca valor para lado 1:");
				lado1 = dogma.nextDouble();

				System.out.println("Introduzca valor para lado 2:");
				lado2 = dogma.nextDouble();

				System.out.println("Introduzca valor para lado 3:");
				lado3 = dogma.nextDouble();

				// compruebo que los valores son correctos
				if (lado1 > 0 && lado2 > 0 && lado3 > 0) {

					// creo una nueva posicion al final del array
					lista = Arrays.copyOf(lista, lista.length + 1);
					// y creo un objeto tipo triangulo con los datos recogidos en esta nueva
					// posicion
					lista[lista.length - 1] = new Triangulo(3, lado1, lado2, lado3);
					// si los datos no son validos
				} else {
					// lo comunico con mensaje por pantalla
					System.out.println("Introduccion de datos erronea, pruebe otra vez. ");
				}
			}

			// si seleccionUsuario tiene valor igual a 2
			case 2 -> {
				// solicito datos del poligono y los asigno a sus variables
				System.out.println("Introduzca datos para rectangulo: ");

				System.out.println("Introduzca valor para lado 1:");
				lado1 = dogma.nextDouble();

				System.out.println("Introduzca valor para lado 2:");
				lado2 = dogma.nextDouble();

				// compruebo que los valores son correctos
				if (lado1 > 0 && lado2 > 0) {

					// creo una nueva posicion al final del array
					lista = Arrays.copyOf(lista, lista.length + 1);
					// y creo un objeto tipo triangulo con los datos recogidos en esta nueva
					// posicion
					lista[lista.length - 1] = new Rectangulo(4, lado1, lado2);
					// si los datos no son validos
				} else {
					// lo comunico con mensaje por pantalla
					System.out.println("Introduccion de datos erronea, pruebe otra vez. ");
				}
			}

			// si seleccionUsuario tiene valor igual a 3
			case 3 -> {

				// bucle que recorrera el array lista
				for (int i = 0; i < lista.length; i++) {
					// mostrando la informacion de cada objeto haciendo uso del mismo para llamar al
					// metodo toString
					System.out.println(lista[i].toString());
					// y calculando el area de cada objeto haciendo uso del mismo para llamar al
					// metodo abstracto area, que recibira de su clase hijo Rectangulo o Triangulo
					System.out.println("Area " + lista[i].area());
				}
			}

			// si seleccionUsuario tiene valor igual a 4
			case 4 -> {
				// comunico cierre de programa con mensaje por pantalla
				System.out.println("Cerrando programa...");
			}

			// si seleccionUsuario tiene valor diferente a los de los case esperados
			default -> {
				// muestro mensaje de error por pantalla indicando opciones correctas
				System.err.println("Asegurese de seleccionar una opcion entre el 1 y el 4 incluidos.");
				System.out.println();
			}

			}
		}

		// cierro escaner
		dogma.close();
	}

}
