package ejercicio3;

public class NoPerecedero extends Producto {

	protected String tipo;

	public NoPerecedero() {
		super();
	}

	public NoPerecedero(String nombre, double precio, String tipo) {
		super(nombre, precio);
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		String resultado = super.toString() + ", Tipo: " + tipo;

		return resultado;
	}

	public double calcular(int cantidad) {
		double resultado = super.calcular(cantidad);

		return resultado;
	}
}
