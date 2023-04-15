package ejercicio3;

public class Producto {

	protected String nombre;

	protected double precio;

	public Producto() {
	}

	public Producto(String nombre, double precio) {
		if (precio >= 0) {
			this.nombre = nombre;
			this.precio = precio;
		}
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		if (precio >= 0) {
			this.precio = precio;
		}
	}

	@Override
	public String toString() {
		String resultado = "Nombre: " + nombre + ", Precio: " + precio;

		return resultado;
	}

	public double calcular(int cantidad) {
		double resultado = 0;

		if (precio >= 0) {
			resultado = precio * cantidad;
		}

		return resultado;
	}

}
