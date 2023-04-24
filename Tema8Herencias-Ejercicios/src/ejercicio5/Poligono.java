package ejercicio5;

public abstract class Poligono {

	protected int numeroLados;

	public Poligono() {
	}

	public Poligono(int numeroLados) {
		this.numeroLados = numeroLados;
	}

	public int getNumeroLados() {
		return numeroLados;
	}

	public abstract double area();

	@Override
	public String toString() {
		String mensaje = "Numero de lados del poligono: " + numeroLados;
		return mensaje;
	}

}
