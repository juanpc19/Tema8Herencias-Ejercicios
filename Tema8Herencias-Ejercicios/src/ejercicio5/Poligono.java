package ejercicio5;

public abstract class Poligono {

	public Poligono() {
	}

	public Poligono(int numeroLados) {
		this.numeroLados = numeroLados;
	}

	protected int numeroLados;

	public int getNumeroLados() {
		return numeroLados;
	}

	public abstract double area();

	@Override
	public String toString() {
		return "Poligono [numeroLados=" + numeroLados + "]";
	}

}
