package ejercicio4;

public class Electrodomestico {

	enum Color {
		BLANCO, NEGRO, ROJO, AZUL, GRIS
	}

	enum ConsumoEnergetico {
		A, B, C, D, E, F
	}

	private double precioBase = 100;
	private double peso = 5;
	private Color color;
	private ConsumoEnergetico consumoEnergetico;

	public Electrodomestico(double precioBase, double peso, Color color, ConsumoEnergetico consumoEnergetico) {
		this.color = color;
		this.consumoEnergetico = consumoEnergetico;
		this.precioBase = precioBase;
		this.peso = peso;
	}

	public Electrodomestico(double precioBase, double peso) {
		this.color = Color.valueOf("BLANCO");
		this.consumoEnergetico = ConsumoEnergetico.valueOf("F");
		this.precioBase = precioBase;
		this.peso = peso;
	}

	public double getPrecioBase() {
		return precioBase;
	}

	public double getPeso() {
		return peso;
	}

	public Color getColor() {
		return color;
	}

	public ConsumoEnergetico getConsumoEnergetico() {
		return consumoEnergetico;
	}

	private void comprobarCosumoEnergetico(char letra) {

		String letraCadena = String.valueOf(letra);
		boolean comprobar = false;
		try {
			for (ConsumoEnergetico consumo : ConsumoEnergetico.values()) {
				if (consumo.name().equals(letraCadena)) {

					comprobar = true;
					break;
				}
			}

		} catch (Exception e) {
			comprobar = false;
		}

	}

}
