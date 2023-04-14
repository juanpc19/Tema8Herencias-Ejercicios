package ejercicio3;

public class Perecedero extends Producto {

	protected int diasCaducar;

	public Perecedero() {
		super();
	}

	public Perecedero(String nombre, double precio) {
		super(nombre, precio);
	}

	public int getDiasCaducar() {
		return diasCaducar;
	}

	public void setDiasCaducar(int diasCaducar) {
		this.diasCaducar = diasCaducar;
	}

	@Override
	public String toString() {
		String resultado = super.toString() + "Dias para caducar: " + diasCaducar;

		return resultado;
	}

	public double calcular(int cantidad) {
		double resultado = 0;

		resultado = precio * cantidad;

		switch (diasCaducar) {

		case 1 -> {
			resultado = resultado / 4;
		}
		case 2 -> {
			resultado = resultado / 3;
		}

		case 3 -> {
			resultado = resultado / 2;
		}
		}

		return resultado;
	}
}
