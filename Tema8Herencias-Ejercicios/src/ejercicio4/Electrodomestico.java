package ejercicio4;

public class Electrodomestico {

	enum Color {
		BLANCO, NEGRO, ROJO, AZUL, GRIS
	}

	enum ConsumoEnergetico {
		A, B, C, D, E, F
	}

	protected double precioBase = 100;
	protected double peso = 5;
	protected Color color = Color.valueOf("BLANCO");
	protected ConsumoEnergetico consumoEnergetico = ConsumoEnergetico.valueOf(String.valueOf('F'));

	public Electrodomestico(double precioBase, double peso, String color, char consumoEnergetico) {
		String consumoEnergeticoCadena = String.valueOf(consumoEnergetico);

		if (comprobarColor(color)) {
			this.color = Color.valueOf(color);
		}

		if (comprobarCosumoEnergetico(consumoEnergetico)) {
			this.consumoEnergetico = ConsumoEnergetico.valueOf(consumoEnergeticoCadena);
		}

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

	private boolean comprobarCosumoEnergetico(char letra) {
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
		return comprobar;
	}

	private boolean comprobarColor(String color) {
		boolean comprobar = false;
		try {
			for (Color col : Color.values()) {
				if (col.name().equals(color)) {
					comprobar = true;
					break;
				}
			}

		} catch (Exception e) {
			comprobar = false;
		}
		return comprobar;
	}

	public void precioFinal() {

		switch (consumoEnergetico) {
		case A -> {
			precioBase += 100;
		}

		case B -> {
			precioBase += 80;
		}

		case C -> {
			precioBase += 60;
		}

		case D -> {
			precioBase += 50;
		}

		case E -> {
			precioBase += 30;
		}

		case F -> {
			precioBase += 10;
		}

		default -> {

		}
		}

		if (peso >= 0 && peso <= 19) {
			precioBase += 10;

		} else if (peso >= 20 && peso <= 49) {
			precioBase += 50;

		} else if (peso >= 50 && peso <= 79) {
			precioBase += 80;

		} else if (peso > 80) {
			precioBase += 100;
		}

	}

	@Override
	public String toString() {
		String mensaje = "PrecioBase: " + precioBase + ", peso: " + peso + ", color: " + color + ", consumoEnergetico: "
				+ consumoEnergetico;

		return mensaje;
	}

}
