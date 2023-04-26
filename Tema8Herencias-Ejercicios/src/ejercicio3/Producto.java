package ejercicio3;

/**
 * clase que contendra metodos para crear, modificar, y mostrar percio de un
 * producto ademas de calcular su costo en base a cantidad comprada del mismo
 * 
 * @author juanpesca19
 *
 */
public class Producto {

	protected String nombre;// atributo que guardara el valor de nombre

	protected double precio;// atributo que guardara el valor de precio

	/**
	 * constructor sin parametros
	 */
	public Producto() {
	}

	/**
	 * constructor con parametros
	 * 
	 * @param nombre contendra valor para atributo nombre
	 * @param precio contendra valor para atributo precio
	 */
	public Producto(String nombre, double precio) {
		// si valor de parametro de entrada mayor o igual a 0
		if (precio >= 0) {
			// doy su valor a atributo precio
			this.nombre = nombre;
			this.precio = precio;
		}
	}

	/**
	 * getter de atributo nombre
	 * 
	 * @return nombre devolvera valor actual de atributo nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * setter de atributo nombre
	 * 
	 * @param nombre contendra valor para atributo nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * getter de atributo precio
	 * 
	 * @return precio devolvera valor actual de atributo precio
	 */
	public double getPrecio() {
		return precio;
	}

	/**
	 * setter de atributo precio
	 * 
	 * @param precio contendra valor para atributo precio
	 */
	public void setPrecio(double precio) {
		// si valor de parametro de entrada mayor o igual a 0
		if (precio >= 0) {
			// doy su valor a atributo precio
			this.precio = precio;
		}
	}

	/**
	 * metodo que devolera una cadena con los atributos del objeto que lo llame
	 */
	@Override
	public String toString() {
		String resultado = "Nombre: " + nombre + ", Precio: " + precio;

		return resultado;
	}

	/**
	 * metodo que calculara el precio total en base a la cantidad del producto
	 * comprado
	 * 
	 * @param cantidad contendra cantidad del producto comprado
	 * @return resultado devolvera valor de resultado
	 */
	public double calcular(int cantidad) {
		double resultado = 0;

		// guardo en resultado el valor de precio por cantidad
		resultado = precio * cantidad;

		return resultado;
	}

}
