package ejercicio3;

public class Perecedero extends Producto {

	protected int diasCaducar;

	/**
	 * constructor sin parametros
	 */
	public Perecedero() {
		super();
	}

	/**
	 * constructor con parametros
	 * 
	 * @param nombre      contendra valor para atributo nombre
	 * @param precio      contendra valor para atributo precio
	 * @param diasCaducar contendra valor para atributo diasCaducar
	 */
	public Perecedero(String nombre, double precio, int diasCaducar) {
		super(nombre, precio);
		// si valor de parametro de entrada mayor o igual a 0
		if (diasCaducar >= 0) {
			this.diasCaducar = diasCaducar;
		}
	}

	/**
	 * getter de atributo diasCaducar
	 * 
	 * @return devolvera valor actual de atributo diasCaducar
	 */
	public int getDiasCaducar() {
		return diasCaducar;
	}

	/**
	 * setter de atributo diasCaducar
	 * 
	 * @param diasCaducar contendra valor para atributo diasCaducar
	 */
	public void setDiasCaducar(int diasCaducar) {
		// si diasCaducar mayor o igual a 0
		if (diasCaducar >= 0) {
			// doy su valor a atributo diasCaducar
			this.diasCaducar = diasCaducar;
		}
	}

	/**
	 * metodo que devolera una cadena con los atributos del objeto que lo llame
	 */
	@Override
	public String toString() {
		String resultado = super.toString() + ", Dias para caducar: " + diasCaducar;

		return resultado;
	}

	/**
	 * metodo que devolvera valor total de producto comprado
	 */
	public double calcular(int cantidad) {

		// declaro resultado y le doy valor igual a calcular de su super con la cantidad
		// especificada en el parametroo de entrada
		double resultado = super.calcular(cantidad);

		// acto seguido le aplico descuento segun los dias que le quede para caducar
		// haciendo uso de un switch vara evaluar los dias a caducar y aplicando el
		// descuento en cada case
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
