package ejercicio5;

public class Triangulo extends Poligono {

	private double lado1;// atributo que guardara valor del lado1

	private double lado2;// atributo que guardara valor del lado2

	private double lado3;// atributo que guardara valor del lado3

	/**
	 * constructor sin parametros de entrada
	 */
	public Triangulo() {
		super();
	}

	/**
	 * constructor con parametros de entrada
	 * 
	 * @param numeroLados contendra valor para atributo numeroLados
	 * @param lado1       contendra valor para atributo lado1
	 * @param lado2       contendra valor para atributo lado2
	 * @param lado3       contendra valor para atributo lado3
	 */
	public Triangulo(int numeroLados, double lado1, double lado2, double lado3) {
		// hereda numeroLados de su super
		super(numeroLados);
		// compruebo si los valores de lado1, lado2 y lado3 son mayoeres a 0
		if (lado1 > 0 && lado2 > 0 && lado3 > 0) {
			// si lo son los asigno a sus atributos
			this.lado1 = lado1;
			this.lado2 = lado2;
			this.lado3 = lado3;
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
		if (lado1 > 0) {
			this.lado1 = lado1;
		}
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
		if (lado2 > 0) {
			this.lado2 = lado2;
		}
	}

	/**
	 * getter de atributo lado3
	 * 
	 * @return lado3 devolvera valor actual de lado3
	 */
	public double getLado3() {
		return lado3;
	}

	/**
	 * setter de atributo lado3
	 * 
	 * @param lado3 contendra valor para atributo lado3
	 */
	public void setLado3(double lado3) {
		if (lado3 > 0) {
			this.lado3 = lado3;
		}
	}

	/**
	 * metodo que calculara el area del objeto Triangulo que lo llama
	 */
	@Override
	public double area() {
		double resultado;

		// uso la formula de heron para clacular el area sumando toodos sus lados y
		// dividiendo la suma de estos entre 2
		resultado = (lado1 + lado2 + lado3) / 2;
		return resultado;
	}

	/**
	 * metodo que devolvera una cadena con los valores de los atributos del objeto
	 * que lo llama
	 */
	@Override
	public String toString() {
		String mensaje = "Triangulo:" + " lado 1: " + lado1 + " lado 2: " + lado2 + " lado 3: " + lado3;
		return mensaje;
	}
}
