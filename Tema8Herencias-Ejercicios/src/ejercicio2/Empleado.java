package ejercicio2;

/**
 * clase Empleado que contendra nombre del empleado metodos para modificar el
 * nombre y para convertirlo sin string
 * 
 * @author juanpesca19
 *
 */
public class Empleado {

	private String nombre = ""; // atributo que contendra nombre

	/**
	 * constructor sin parametros de entrada
	 */
	public Empleado() {
		super();
	}

	/**
	 * constructor con paramatros de entrada
	 * 
	 * @param nombre contendra valor para atributo nombre
	 */
	public Empleado(String nombre) {
		super();
		this.nombre = nombre;
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
	 * metodo que devolvera una cadena con una cadena igual a su tipo mas el
	 * atributo nombre del objeto que lo llama
	 */

	@Override
	public String toString() {

		String resultado = "Empleado " + nombre;

		return resultado;
	}

}
