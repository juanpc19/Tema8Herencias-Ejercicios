package ejercicio4;

public class Main {

	public static void main(String[] args) {

		double totalLavadoras = 0;// guarda precio total de lavadoras

		double totalTelevisores = 0;// guarda precio total de televisores

		double totalElectrodomesticos = 0;// guarda precio total de electrodomesticos

		// array tipo Electrodomestico de nombre lista y longitud 10
		Electrodomestico lista[] = new Electrodomestico[10];

		// creo 10 objetos de diferentes tipos con valores introducidos a mano
		lista[0] = new Electrodomestico(10, 1, "BLANCO", 'A');

		lista[1] = new Electrodomestico(20, 2, "NEGRO", 'B');

		lista[2] = new Electrodomestico(30, 3, "ROJO", 'C');

		lista[3] = new Electrodomestico(40, 4, "AZUL", 'D');

		lista[4] = new Electrodomestico(50, 5, "GRIS", 'E');

		lista[5] = new Electrodomestico(60, 6, "BLANCO", 'F');

		lista[6] = new Lavadora(10, 1, "ROJO", 'C', 10);

		lista[7] = new Lavadora(20, 2);

		lista[8] = new Television(10, 1, "AZUL", 'D', 40, true);

		lista[9] = new Television(20, 2);

		// recorro el array mostrando toda la informacion de cada electrodomestico
		for (int i = 0; i < lista.length; i++) {
			System.out.println(lista[i]);
		}

		// recorro el array modificando el precioBase de cada electrodomestico llamando
		// al metodo precioFinal mostrando el despues el nuevo precioBase
		for (int i = 0; i < lista.length; i++) {
			lista[i].precioFinal();
			System.out.println(lista[i].getPrecioBase());
		}

		// recorro el array evaluando que tipo de objeto hay en cada posicion con uso de
		// instanceof
		for (int i = 0; i < lista.length; i++) {
			// si es tipo Lavadora
			if (lista[i] instanceof Lavadora) {
				// agrego el valor del precioBase actual del objeto en posicion actual a
				// totalLavadoras
				totalLavadoras += lista[i].getPrecioBase();

				// si es tipo Television
			} else if (lista[i] instanceof Television) {
				// agrego el valor del precioBase actual del objeto en posicion actual a
				// totalTelevisores
				totalTelevisores += lista[i].getPrecioBase();

				// Si es tipo Electrodomestico
			} else if (lista[i] instanceof Electrodomestico) {
				// agrego el valor del precioBase actual del objeto en posicion actual a
				// totalElectrodomesticos
				totalElectrodomesticos += lista[i].getPrecioBase();
			}
		}

		// añado valor de totalLavadoras y valor de totalTelevisores a
		// totalEletrodomesticos
		totalElectrodomesticos += totalLavadoras + totalTelevisores;

		// muestro mensaje por pantalla con los valores finales del total de lavadoras,
		// televisores y electrodomesticos
		System.out.println("Precio total de lavadoras: " + totalLavadoras + "Precio total de televisores: "
				+ totalTelevisores + "Precio total de electrodomesticos: " + totalElectrodomesticos);

	}

}
