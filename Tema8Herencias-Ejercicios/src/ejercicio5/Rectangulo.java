package ejercicio5;

public class Rectangulo extends Poligono {

	private double lado1;// atributo que guardara valor del lado1

	private double lado2;// atributo que guardara valor del lado2

	/**
	 * constructor sin parametros de entrada
	 */
	public Rectangulo() {
		super();
	}

	/**
	 * constructor con parametros de entrada
	 * 
	 * @param numeroLados contendra valor para atributo numeroLados
	 * @param lado1       contendra valor para atributo lado1
	 * @param lado2       contendra valor para atributo lado2
	 */
	public Rectangulo(int numeroLados, double lado1, double lado2) {
		// hereda numeroLados de su super
		super(numeroLados);
		// compruebo si los valores de lado1, lado2 y lado3 son mayoeres a 0
		if (lado1 > 0 && lado2 > 0) {
			// si lo son los asigno a sus atributos
			this.lado1 = lado1;
			this.lado2 = lado2;
		}
	}

	/**
	 * getter de atributo lado1
	 * 
	 * @return lado1 devolvera valor actual de lado1
	 */
	public double getLado1() {
		return lado1;
	}

	/**
	 * setter de atributo lado1
	 * 
	 * @param lado1 contendra valor para atributo lado1
	 */
	public void setLado1(double lado1) {
		this.lado1 = lado1;
	}

	/**
	 * getter de atributo lado2
	 * 
	 * @return lado2 devolvera valor actual de lado2
	 */
	public double getLado2() {
		return lado2;
	}

	/**
	 * setter de atributo lado2
	 * 
	 * @param lado2 contendra valor para atributo lado2
	 */
	public void setLado2(double lado2) {
		this.lado2 = lado2;
	}

	/**
	 * metodo que calculara el area del objeto Triangulo que lo llama
	 */
	@Override
	public double area() {
		double resultado;

		resultado = lado1 * lado2;
		return resultado;
	}

	/**
	 * metodo que devolvera una cadena con los valores de los atributos del objeto
	 * que lo llama
	 */
	@Override
	public String toString() {
		String mensaje = "Rectangulo:" + " lado 1: " + lado1 + " lado 2: " + lado2;
		return mensaje;
	}
}
