package ejercicio2;

/**
 * clase Directivo contiene constructores y metodo to string con herencia de
 * clase Empleado
 * 
 * @author juanpesca19
 *
 */
public class Directivo extends Empleado {

	/**
	 * constructor sin parametros de entrada
	 */
	public Directivo() {
		super();
	}

	/**
	 * constructor con parametros de entrada
	 * 
	 * @param nombre contendra valor para atributo nombre
	 */
	public Directivo(String nombre) {
		// construye el objeto heredando el atributo nombre de su super (Empleado)
		super(nombre);
	}

	/**
	 * metodo que devolvera una cadena con una cadena igual al tipo que hereda + con
	 * el atributo nombre heredado de su super + su tipo añadido a la cadena
	 */
	@Override
	public String toString() {
		String resultado = super.toString() + " -> Directivo";

		return resultado;
	}

}
