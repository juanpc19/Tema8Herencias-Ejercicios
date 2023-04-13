package ejercicio1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int seleccionUsuario = 0;

		int hora;

		int minuto;

		int segundo;

		Scanner dogma = new Scanner(System.in);

		HoraExacta reloj = new HoraExacta(0, 0, 0);

		while (seleccionUsuario != 4)

			System.out.println(
					"Seleccione una opcion:\n1.Establecer hora exacta:\n2.Incrementar hora en 1 segundo.\n3.Mostrar hora exacta.\n4.Salir.");

		switch (seleccionUsuario) {

		case 1 -> {
			System.out.println("Introduzca un valor para hora:");
			hora = dogma.nextInt();

			System.out.println("Introduzca un valor para minuto:");
			minuto = dogma.nextInt();

			System.out.println("Introduzca un valor para segundo:");
			segundo = dogma.nextInt();

			if (hora >= 0 & hora <= 23 && minuto >= 0 & minuto <= 59 && segundo >= 0 & segundo <= 59) {
				reloj = new HoraExacta(hora, minuto, segundo);
			} else {
				System.out.println("Datos introducidos no validos, introduzca la hora de nuevo.");
			}

		}
		case 2 -> {
			reloj.inc();

		}
		case 3 -> {
			reloj.toString();
		}
		case 4 -> {
			System.out.println("Cerrando programa...");
		}

		default -> {
			System.out.println("Asegurese de introducir una opcion valida: 1,2,3,4.");
		}

		}

		dogma.close();
	}

}
