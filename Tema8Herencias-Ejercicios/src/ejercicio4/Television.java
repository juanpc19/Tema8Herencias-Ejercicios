package ejercicio4;

public class Television extends Electrodomestico {

	protected double resolucion = 20;// atributo que guardara valor de resolucion, inicializo a 20 para usar como
										// valor por defecto

	protected boolean sintonizadorTdt = false;// atributo que guardara si tiene tdt o no, inicializo a false para usar
												// como valor por defecto

	/**
	 * constructor con parametros entrada
	 * 
	 * @param precioBase        contendra valor para atributo precioBase
	 * @param peso              contendra valor para atributo peso
	 * @param color             contendra valor para atributo color
	 * @param consumoEnergetico contendra valor para atributo consumoEnergetico
	 */
	public Television(double precioBase, double peso, String color, char consumoEnergetico) {
		// hereda todo del super
		super(precioBase, peso, color, consumoEnergetico);
	}

	/**
	 * constructor con 2 parametros de entrada
	 * 
	 * @param precioBase contendra valor para atributo precioBase
	 * @param peso       contendra valor para atributo peso
	 */
	public Television(double precioBase, double peso) {
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
	 * @param resolucion        contendra valor para atributo resolucion
	 * @param sintonizadorTdt   contendra valor para atributo sintonizadorTdt
	 */
	public Television(double precioBase, double peso, String color, char consumoEnergetico, double resolucion,
			boolean sintonizadorTdt) {
		// hereda precioBase, peso, color y consumoEnergetico del super
		super(precioBase, peso, color, consumoEnergetico);
		// resolucion mayor o igual a 0 y sintonizadorTdt igual a true o igual a false
		if (resolucion >= 0 && sintonizadorTdt == true || sintonizadorTdt == false) {
			// asigno sus valores a sus atributos
			this.resolucion = resolucion;
			this.sintonizadorTdt = sintonizadorTdt;
		}
	}

	/**
	 * getter de atributo resolucion
	 * 
	 * @return resolucion devolvera valor actual de atributo resolucion
	 */
	public double getResolucion() {
		return resolucion;
	}

	/**
	 * getter de atributo sintonizadorTdt
	 * 
	 * @return sintonizadorTdt devolvera valor actual de atributo sintonizadorTdt
	 */
	public boolean isSintonizadorTdt() {
		return sintonizadorTdt;
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
	 * metodo que calculara precio final de electrodomestico tipo Television
	 */
	@Override
	public void precioFinal() {
		// llama a precioFinal de su super
		super.precioFinal();
		// y si resolucion es mayor a 40
		if (resolucion > 40) {
			// hago otra modificacion a atributo precio base
			precioBase += (precioBase / 100 * 30);

		}
		// y si tiene sintonizador tdt
		if (sintonizadorTdt == true) {
			// hago otra modificacion a atributo precio base
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
		// luego añado sus atributos
		String mensaje = super.toString() + " resolucion: " + resolucion + ", sintonizadorTdt: " + sintonizadorTdt;

		return mensaje;
	}

}
