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
	protected Color color;
	protected ConsumoEnergetico consumoEnergetico;

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

	
	//comprueba color
	
	
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

}
