package ejercicio1;

/**
 * clase que contendra metodos para modificar y mostrar una hora en horas y
 * minutos
 * 
 * @author jperez
 *
 */
public class Hora {

	protected int hora;// atributo que guardara valor de hora

	protected int minuto;// atributo que guardara valor de minuto

	/**
	 * constructor con parametros de entrada
	 * 
	 * @param hora   contendra valor para atributo hora
	 * @param minuto contendra valor para atributo minuto
	 */
	public Hora(int hora, int minuto) {
		// si hora y minuto estan dentro del rango de valores correctos
		if (hora >= 0 & hora <= 23 && minuto >= 0 && minuto <= 59) {
			// los asigno a sus atributos
			this.hora = hora;
			this.minuto = minuto;
		}
	}

	/**
	 * setter de atributo hora
	 * 
	 * @param hora contendra valor para atributo hora
	 * @return posible devolvera true o false segun sea posible modificar hora o no
	 */
	public boolean setHora(int hora) {
		boolean posible = false;
		// si hora esta dentro del rango de valores correctos
		if (hora >= 0 & hora <= 23) {
			// asgino su valor atributo hora
			this.hora = hora;
			// y doy a posible valor true
			posible = true;
		}
		return posible;
	}

	/**
	 * setter de atributo minuto
	 * 
	 * @param minuto contendra valor para atributo minuto
	 * @return posible devolvera true o false segun sea posible modificar minuto o
	 *         no
	 */
	public boolean setMinuto(int minuto) {
		boolean posible = false;
		// si minuto esta dentro del rango de valores correctos
		if (minuto >= 0 && minuto <= 59) {
			// asigno su valor a atributo minuto
			this.minuto = minuto;
			// y doy a posible valor true
			posible = true;
		}
		return posible;
	}

	/**
	 * metodo que avanzara la hora en 1 minuto haciendo los cambios necesarios en
	 * atributos hora y minuto
	 */
	public void inc() {
		//avanzo 1 minuto
		minuto++;
		//si despues de esto minuto toma un valor igual a 60
		if (minuto == 60) {
			//
			minuto = 0;
			hora++;
			if (hora == 24) {
				hora = 0;
			}
		}
	}

	/**
	 * metodo que devolvera una cadena par imprimir por pantalla del objeto con el
	 * que se le llama
	 */
	@Override
	public String toString() {
		String resultado = "";
		//si hora mayor o igual a 9 anado 0 a la cadena
		if (hora <= 9) {
			resultado += "0";
		}
		//independientemente de condicion anterior anado hora a la cadena
		resultado += hora + ":";
		//si minuto mayor o igual a 9 anado 0 a la cadena
		if (minuto <= 9) {
			
			resultado += "0";
		}
		//independientemente de condicion anterior anado hora a la cadena
		resultado += minuto;

		return resultado;
	}

}
