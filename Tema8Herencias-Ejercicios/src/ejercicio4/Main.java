package ejercicio4;

public class Main {

	public static void main(String[] args) {

		double totalLavadoras = 0;

		double totalTelevisores = 0;

		double totalElectrodomesticos = 0;

		Electrodomestico lista[] = new Electrodomestico[10];

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

		for (int i = 0; i < lista.length; i++) {
			System.out.println(lista[i]);
		}

		for (int i = 0; i < lista.length; i++) {
			lista[i].precioFinal();
			System.out.println(lista[i].getPrecioBase());
		}

		for (int i = 0; i < lista.length; i++) {
			if (lista[i] instanceof Lavadora) {
				totalLavadoras += lista[i].getPrecioBase();

			} else if (lista[i] instanceof Television) {
				totalTelevisores += lista[i].getPrecioBase();

			} else if (lista[i] instanceof Electrodomestico) {
				totalElectrodomesticos += lista[i].getPrecioBase();
			}
		}

		totalElectrodomesticos += totalLavadoras + totalTelevisores;

		System.out.println("Precio total de lavadoras: " + totalLavadoras + "Precio total de televisores: "
				+ totalTelevisores + "Precio total de electrodomesticos: " + totalElectrodomesticos);

	}

}
