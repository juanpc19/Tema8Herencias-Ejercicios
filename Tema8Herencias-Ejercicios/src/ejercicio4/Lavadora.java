package ejercicio4;

public class Lavadora extends Electrodomestico {

	protected double carga = 5;// atributo que guardara valor de carga, inicializo a 5 para usar como valor por
								// defecto

	/**
	 * constructor con parametros entrada
	 * 
	 * @param precioBase        contendra valor para atributo precioBase
	 * @param peso              contendra valor para atributo peso
	 * @param color             contendra valor para atributo color
	 * @param consumoEnergetico contendra valor para atributo consumoEnergetico
	 */
	public Lavadora(double precioBase, double peso, String color, char consumoEnergetico) {
		// hereda todo del super
		super(precioBase, peso, color, consumoEnergetico);

	}

	/**
	 * constructor con 2 parametros de entrada
	 * 
	 * @param precioBase contendra valor para atributo precioBase
	 * @param peso       contendra valor para atributo peso
	 */
	public Lavadora(double precioBase, double peso) {
		// hereda precioBase y peso del super y conserva valores por defecto en lo demas
		super(precioBase, peso);

	}

	/**
	 * constuctor con 5 parametros de entrada
	 * 
	 * @param precioBase        contendra valor para atributo precioBase
	 * @param peso              contendra valor para atributo peso
	 * @param color             contendra valor para atributo color
	 * @param consumoEnergetico contendra valor para atributo consumoEnergetico
	 * @param carga             contendra valor para atributo carga
	 */
	public Lavadora(double precioBase, double peso, String color, char consumoEnergetico, double carga) {
		// hereda precioBase, peso, colory consumoEnergetico de su super
		super(precioBase, peso, color, consumoEnergetico);
		if (carga >= 0) {
			this.carga = carga;
		}
	}

	/**
	 * getter de atributo precioBase devolvera el return de su super
	 */
	@Override
	public double getPrecioBase() {
		// hereda su getter de su super
		return super.getPrecioBase();
	}

	/**
	 * getter de atributo carga
	 * 
	 * @return cargar devolvera valor actual de atributo carga
	 */
	public double getCarga() {
		return carga;
	}

	/**
	 * metodo que calculara precio final de electrodomestico tipo Lavadora
	 */
	@Override
	public void precioFinal() {
		// llama a precioFinal de su super
		super.precioFinal();
		// y si carga es mayor a 30
		if (carga > 30) {
			// hace otra modificacion a atributo precioBase
			precioBase += 50;
		}
	}

	/**
	 * funcion que imprimira por pantalla los valores de los atributos del objeto
	 * con el que se llama a la funcion
	 */
	@Override
	public String toString() {
		// añado a la cadena la cadena devuelta al llamar a su toString de su super y
		// luego añado su atributo
		String mensaje = super.toString() + " Carga: " + carga;

		return mensaje;
	}

}
