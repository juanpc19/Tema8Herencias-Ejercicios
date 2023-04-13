package ejercicio2;

/**
 * clase Operario contiene constructores y metodo to string con herencia de
 * clase Empleado
 * 
 * @author juanpesca19
 *
 */
public class Operario extends Empleado {

	/**
	 * constructor sin parametros de entrada
	 */
	public Operario() {
		super();
	}

	/**
	 * constructor con paramateros de entrada
	 * 
	 * @param nombre contendra valor para atributo nombre
	 */
	public Operario(String nombre) {
		// construye el objeto heredando el atributo nombre de su super (Empleado)
		super(nombre);
	}

	/**
	 * metodo que devolvera una cadena con una cadena igual al tipo que hereda + con
	 * el atributo nombre heredado de su super + su tipo añadido a la cadena
	 */
	@Override
	public String toString() {
		String resultado = super.toString() + " -> Operario";

		return resultado;
	}

}
