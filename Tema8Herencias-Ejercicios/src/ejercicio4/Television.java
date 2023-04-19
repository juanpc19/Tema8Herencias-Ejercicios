package ejercicio4;

public class Television extends Electrodomestico {

	protected double resolucion = 20;

	protected boolean sintonizadorTdt = false;

	public Television(double precioBase, double peso, String color, char consumoEnergetico) {
		super(precioBase, peso, color, consumoEnergetico);
	}

	public Television(double precioBase, double peso) {
		super(precioBase, peso);
	}

	public Television(double precioBase, double peso, String color, char consumoEnergetico, double resolucion,
			boolean sintonizadorTdt) {
		super(precioBase, peso, color, consumoEnergetico);
		this.resolucion = resolucion;
		this.sintonizadorTdt = sintonizadorTdt;
	}

	public double getResolucion() {
		return resolucion;
	}

	public boolean isSintonizadorTdt() {
		return sintonizadorTdt;
	}

	@Override
	public double getPrecioBase() {
		return super.getPrecioBase();
	}

	@Override
	public void precioFinal() {
		super.precioFinal();
		if (resolucion > 40) {
			precioBase += (precioBase / 100 * 30);
		}
		if (sintonizadorTdt == true) {
			precioBase += 50;
		}
	}

	@Override
	public String toString() {

		String mensaje = super.toString() + " resolucion: " + resolucion + ", sintonizadorTdt: " + sintonizadorTdt;

		return mensaje;
	}

}
