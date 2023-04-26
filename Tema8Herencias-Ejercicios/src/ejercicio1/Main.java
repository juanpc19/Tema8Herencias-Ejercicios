package ejercicio1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int seleccionUsuario = 0;// guardara la selecion del usuario inicializo a 0 para uso bucle

		int hora;// guardara valor para hora

		int minuto;// guardara valor para minuto

		int segundo;// guardara valor para segundo

		// creo escaner y lo nombro dogma
		Scanner dogma = new Scanner(System.in);

		// creo objeto reloj de tipo HoraExacta y lo inicializo con valores a 0
		HoraExacta reloj = new HoraExacta(0, 0, 0);

		// bucle que se ejecutara mientras seleccionUsuario sea diferente a 4
		while (seleccionUsuario != 4) {

			// muestro mensaje con menu por pantalla
			System.out.println(
					"Seleccione una opcion:\n1.Establecer hora exacta:\n2.Incrementar hora en 1 segundo.\n3.Mostrar hora exacta.\n4.Salir.");

			// recojo valor de seleccion de usuario con escaner y lo asigno a
			// seleccionUsuario
			seleccionUsuario = dogma.nextInt();

			// evaluo seleccionUsuario
			switch (seleccionUsuario) {

			// si seleccionUsuario es igual a 1
			case 1 -> {
				// solicito valores para hora minuto y segundo, los recojo con escaner y los
				// asigno a sus variables
				System.out.println("Introduzca un valor para hora:");
				hora = dogma.nextInt();

				System.out.println("Introduzca un valor para minuto:");
				minuto = dogma.nextInt();

				System.out.println("Introduzca un valor para segundo:");
				segundo = dogma.nextInt();

				// compruebo si los datos son correctos para todas las variables antes de
				// pasarlas al constructor
				if (hora >= 0 & hora <= 23 && minuto >= 0 & minuto <= 59 && segundo >= 0 & segundo <= 59) {
					// si lo son paso los valores al constructor
					reloj = new HoraExacta(hora, minuto, segundo);

					// de lo contrario comunico que no son validos con mensaje de error
				} else {
					System.out.println("Datos introducidos no validos, introduzca la hora de nuevo.");
				}

			}
			// si seleccionUsuario es igual a 2
			case 2 -> {
				// llamo a metodo inc con objeto reloj para incrementar la hora en 1 segundo
				reloj.inc();

			}
			// si seleccionUsuario es igual a 3
			case 3 -> {
				// muestro la hora exacta por pantalla llamando al metodo toString con el objeto
				// reloj
				System.out.println(reloj.toString());
			}
			// si seleccionUsuario es igual a 4
			case 4 -> {
				// cierro el programa y lo comunico con mensaje por pantalla
				System.out.println("Cerrando programa...");
			}
			// si seleccionUsuario es diferente a las opciones esperadas
			default -> {
				// lo comunico mensaje de error por pantalla
				System.out.println("Asegurese de introducir una opcion valida: 1,2,3,4.");
			}

			}

		}

		// cierro escaner
		dogma.close();
	}

}
