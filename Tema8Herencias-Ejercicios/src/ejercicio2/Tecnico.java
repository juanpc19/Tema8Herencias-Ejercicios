package ejercicio2;

/**
 * clase Tecnico contiene constructores y metodo to string con herencia de clase
 * Operario
 * 
 * @author juanpesca19
 *
 */
public class Tecnico extends Operario {

	/**
	 * constructor sin parametros de entrada
	 */
	public Tecnico() {
		super();
	}

	/**
	 * constructor con parametros de entrada
	 * 
	 * @param nombre contendra valor para atributo nombre
	 */
	public Tecnico(String nombre) {
		// construye el objeto heredando el atributo nombre de su super (Operario)
		super(nombre);
	}

	/**
	 * metodo que devolvera una cadena con una cadena igual al tipo que hereda + con
	 * el atributo nombre heredado de su super + su tipo añadido a la cadena
	 */
	@Override
	public String toString() {
		String resultado = super.toString() + " -> Tecnico";

		return resultado;
	}

}
