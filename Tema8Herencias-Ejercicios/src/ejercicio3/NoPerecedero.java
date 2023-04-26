package ejercicio3;

public class NoPerecedero extends Producto {

	protected String tipo;

	/**
	 * constructor sin parametros
	 */
	public NoPerecedero() {
		super();
	}

	/**
	 * constructor con parametros
	 * 
	 * @param nombre contendra valor para atributo nombre
	 * @param precio contendra valor para atributo precio
	 * @param tipo   contendra valor para atributo tipo
	 */
	public NoPerecedero(String nombre, double precio, String tipo) {
		// heredo nombre y precio de su super
		super(nombre, precio);
		// y asigno tipo con parametro de entrada tipo
		this.tipo = tipo;
	}

	/**
	 * getter de atributo tipo
	 * 
	 * @return tipo devuelve valor actual de tipo
	 */
	public String getTipo() {
		return tipo;
	}

	/**
	 * setter de atributo tipo
	 * 
	 * @param tipo contendra valor para atributo tipo
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	/**
	 * metodo que devolera una cadena con los atributos del objeto que lo llame
	 */
	@Override
	public String toString() {
		String resultado = super.toString() + ", Tipo: " + tipo;

		return resultado;
	}

	// no necesito calcular aqui porque hereda el del padre que hace exactamaente lo
	// mismo
}
