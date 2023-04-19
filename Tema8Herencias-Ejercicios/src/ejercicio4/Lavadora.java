package ejercicio4;

public class Lavadora extends Electrodomestico {

	protected double carga = 5;

	public Lavadora(double precioBase, double peso, String color, char consumoEnergetico) {
		super(precioBase, peso, color, consumoEnergetico);

	}

	public Lavadora(double precioBase, double peso) {
		super(precioBase, peso);

	}

	public Lavadora(double precioBase, double peso, String color, char consumoEnergetico, double carga) {
		super(precioBase, peso, color, consumoEnergetico);
		this.carga = carga;
	}

	@Override
	public double getPrecioBase() {
		return super.getPrecioBase();
	}

	public double getCarga() {
		return carga;
	}

	@Override
	public void precioFinal() {
		super.precioFinal();
		if (carga > 30) {
			precioBase += 50;
		}
	}

	@Override
	public String toString() {
		String mensaje = super.toString() + " Carga: " + carga;

		return mensaje;
	}

}
