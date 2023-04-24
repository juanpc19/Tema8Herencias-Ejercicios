package ejercicio5;

public class Rectangulo extends Poligono {

	private double lado1;

	private double lado2;

	public Rectangulo() {
		super();
	}

	public Rectangulo(int numeroLados, double lado1, double lado2) {
		super(numeroLados);
		this.lado1 = lado1;
		this.lado2 = lado2;
	}

	public double getLado1() {
		return lado1;
	}

	public void setLado1(double lado1) {
		this.lado1 = lado1;
	}

	public double getLado2() {
		return lado2;
	}

	public void setLado2(double lado2) {
		this.lado2 = lado2;
	}

	@Override
	public double area() {
		double resultado;

		resultado = lado1 * lado2;
		return resultado;
	}

	@Override
	public String toString() {
		String mensaje = "Rectangulo:" + " lado 1: " + lado1 + " lado 2: " + lado2;
		return mensaje;
	}
}
