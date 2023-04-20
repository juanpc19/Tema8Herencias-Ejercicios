package ejercicio5;

public class Rectangulo extends Poligono {

	public Rectangulo(double lado1, double lado2) {
		super();
		this.lado1 = lado1;
		this.lado2 = lado2;
	}

	public Rectangulo() {
		super();
		// TODO Auto-generated constructor stub
	}

	private double lado1;

	private double lado2;

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
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String toString() {
		return "Poligono [numeroLados=" + numeroLados + "]";
	}
}
