package ejercicio4;

public class Electrodomestico {

	/**
	 * enumerado que guardara constantes como posibles valores para variable tipo
	 * Color (cada variable seria un objeto)
	 */
	enum Color {
		BLANCO, NEGRO, ROJO, AZUL, GRIS
	}

	/**
	 * enumerado que guardara constantes como posibles valores para variable tipo
	 * ConsumoEnergetico (cada variable seria un objeto)
	 */
	enum ConsumoEnergetico {
		A, B, C, D, E, F
	}

	protected double precioBase = 100;// atributo que guardara el precio base del electrodomestico
	protected double peso = 5;// atributo que guardara el peso del electrodomestico
	protected Color color = Color.valueOf("BLANCO");// atributo color de tipo Color guardara Color del electrodomestico

	// atributo consumoEnergetico de tipo ConsumoEnergetico guardara
	// ConsumoEnergetico del electrodomestico
	protected ConsumoEnergetico consumoEnergetico = ConsumoEnergetico.valueOf(String.valueOf('F'));

	/**
	 * constructor con parametros de entrada
	 * 
	 * @param precioBase        contendra valor para atributo precioBase
	 * @param peso              contendra valor para atributo peso
	 * @param color             contendra valor para atributo color
	 * @param consumoEnergetico contendra valor para atributo consumoEnergetico
	 */
	public Electrodomestico(double precioBase, double peso, String color, char consumoEnergetico) {

		// creo una cadena y le doy el valor de consumoEnergetico que recibo como char
		// porque los enumerados no son comparables con char
		String consumoEnergeticoCadena = String.valueOf(consumoEnergetico);

		// Compruebo si color se encuentra en la lista de enumerados Color con la
		// funcion comprobarColor
		if (comprobarColor(color)) {
			// si se encuentra doy a atributo color valor de color convirtiendolo a tipo
			// Color con valueOf
			this.color = Color.valueOf(color);
		}
		// Compruebo si consumoEnergetico se encuentra en la lista de enumerados
		// comprobarConsumoEnergetico con la funcion comprobarCosumoEnergetico
		if (comprobarConsumoEnergetico(consumoEnergetico)) {
			// si se encuentra doy a atributo consumoEnergetico valor de
			// consumoEnergeticoCadena convirtiendolo a tipo ConsumoEnergetico con valueOf
			this.consumoEnergetico = ConsumoEnergetico.valueOf(consumoEnergeticoCadena);
		}

		// compruebo que precioBase y peso son mayores a 0 antes de asignarlos
		if (precioBase >= 0 && peso >= 0) {
			this.precioBase = precioBase;
			this.peso = peso;
		}
	}

	/**
	 * constructor con 2 parametros de entrada y valores por defecto para los otros
	 * 2 atributos
	 * 
	 * @param precioBase contendra valor para precioBase
	 * @param peso       contendra valor para peso
	 */
	public Electrodomestico(double precioBase, double peso) {
		// doy a atributo color valor por defecto "BLANCO" convirtiendolo a tipo Color
		// con valueOf
		this.color = Color.valueOf("BLANCO");
		
		// doy a atributo consumoEnergetico valor por defecto "F" convirtiendolo a tipo
		// ConsumoEnergetico con valueOf
		this.consumoEnergetico = ConsumoEnergetico.valueOf("F");
		
		// compruebo que precioBase y peso son mayores a 0 antes de asignarlos
		if (precioBase >= 0 && peso >= 0) {
			this.precioBase = precioBase;
			this.peso = peso;
		}
	}

	/**
	 * getter de atributo precioBase
	 * 
	 * @return precioBase devolvera valor actual de atributo precioBase
	 */
	public double getPrecioBase() {
		return precioBase;
	}

	/**
	 * getter de atributo peso
	 * 
	 * @return peso devolvera valor actual de atributo peso
	 */
	public double getPeso() {
		return peso;
	}

	/**
	 * getter de atributo color
	 * 
	 * @return color devolvera valor actual de atributo color
	 */
	public Color getColor() {
		return color;
	}

	/**
	 * getter de atributo consumoEnergetico
	 * 
	 * @return consumoEnergetico devolvera valor actual de atributo
	 *         consumoEnergetico
	 */
	public ConsumoEnergetico getConsumoEnergetico() {
		return consumoEnergetico;
	}

	/**
	 * metodo que comprobara si el char pasado como argumento se encuentra en el
	 * enum ConsumoEnergetico
	 * 
	 * @param letra contendra valor a evaluar
	 * @return comprobar devolvera true o false segun el char se encuentre en el
	 *         enum o no
	 */
	private boolean comprobarConsumoEnergetico(char letra) {

		String letraCadena = String.valueOf(letra); // creo una cadena del char letra para compararla a valor enum
		boolean comprobar = false;// guardara true o false segun el char se encuentre en el enum o no, lo
									// inicializo a false

		// hago un try del siguiente bloque de instrucciones
		try {
			// recorro el enum ConsumoEnergetico con .values() y voy extrayendo sus valores
			// en consumo
			for (ConsumoEnergetico consumo : ConsumoEnergetico.values()) {
				// compruebo si el nombre actual de consumo es igual a letraCadena
				if (consumo.name().equals(letraCadena)) {
					// de serlo el char se encuentra en el enumerado ConsumoEnergetico
					// por lo que comprobar pasa a ser true
					comprobar = true;
					// y hago break ya que no puede existir otro enum de igual valor
					break;
				}
			}

			// en caso que el try falle el catch recogera la excepcion (error)
		} catch (Exception e) {
			// y devolvera false
			comprobar = false;
		}
		return comprobar;
	}

	private boolean comprobarColor(String color) {
		boolean comprobar = false;// guardara true o false segun el char se encuentre en el enum o no, lo
		// inicializo a false

		// hago un try del siguiente bloque de instrucciones
		try {
			// recorro el enum Color con .values() y voy extrayendo sus valores
			// en col
			for (Color col : Color.values()) {
				// compruebo si el nombre actual de col es igual a color
				if (col.name().equals(color)) {
					// de serlo el char se encuentra en el enumerado Color
					// por lo que comprobar pasa a ser true
					comprobar = true;
					// y hago break ya que no puede existir otro enum de igual valor
					break;
				}
			}
			// en caso que el try falle el catch recogera la excepcion (error)
		} catch (Exception e) {
			// y devolvera false
			comprobar = false;
		}
		return comprobar;
	}

	/**
	 * metodo que modificara el atributo precioBase para que se convierta en el
	 * precio final
	 */
	public void precioFinal() {

		// evaluo consumoEnergetico para saber que valor añadirle a atributo precioBase
		// en funcion del consumo energetico del electrodomestico
		switch (consumoEnergetico) {

		// le añado un valor diferente en funcion del case que suceda
		case A -> {
			precioBase += 100;
		}

		case B -> {
			precioBase += 80;
		}

		case C -> {
			precioBase += 60;
		}

		case D -> {
			precioBase += 50;
		}

		case E -> {
			precioBase += 30;
		}

		case F -> {
			precioBase += 10;
		}

		default -> {

		}
		}

		// modifico el atributo precioBase en funcion del peso del electrodomestico
		// comprobando en que rango de peso se encuentra el electrodomestico y añadiendo
		// diferentes valores segun la condicion que se cumpla
		if (peso >= 0 && peso <= 19) {
			precioBase += 10;

		} else if (peso >= 20 && peso <= 49) {
			precioBase += 50;

		} else if (peso >= 50 && peso <= 79) {
			precioBase += 80;

		} else if (peso > 80) {
			precioBase += 100;
		}

	}

	/**
	 * funcion que imprimira por pantalla los valores de los atributos del objeto
	 * con el que se llama a la funcion
	 */
	@Override
	public String toString() {
		String mensaje = "PrecioBase: " + precioBase + ", peso: " + peso + ", color: " + color + ", consumoEnergetico: "
				+ consumoEnergetico;

		return mensaje;
	}

}
