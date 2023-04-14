package ejercicio3;

public class NoPerecedero extends Producto {

	protected String tipo;

	public NoPerecedero() {
		super();
	}

	public NoPerecedero(String nombre, double precio) {
		super(nombre, precio);
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		String resultado = super.toString() + "tipo: " + tipo;

		return resultado;
	}

	public double calcular(int cantidad) {
		double resultado = 0;

		resultado = precio * cantidad;

		return resultado;
	}
}
