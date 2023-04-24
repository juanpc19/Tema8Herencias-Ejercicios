package ejercicio5;

public class Triangulo extends Poligono {

	private double lado1;

	private double lado2;

	private double lado3;

	public Triangulo() {
		super();
	}

	public Triangulo(int numeroLados, double lado1, double lado2, double lado3) {
		super(numeroLados);
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
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

	public double getLado3() {
		return lado3;
	}

	public void setLado3(double lado3) {
		this.lado3 = lado3;
	}

	@Override
	public double area() {
		double resultado;

		resultado = (lado1 + lado2 + lado3) / 2;
		return resultado;
	}

	@Override
	public String toString() {
		String mensaje = "Triangulo:" + " lado 1: " + lado1 + " lado 2: " + lado2 + " lado 3: " + lado3;
		return mensaje;
	}
}
