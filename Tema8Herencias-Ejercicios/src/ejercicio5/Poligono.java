package ejercicio5;

public abstract class Poligono {

	protected int numeroLados;// atributo que guardara el numero de lados del poligono

	/**
	 * constructor sin parmetros entrada
	 */
	public Poligono() {
	}

	/**
	 * constructor con parametros entrada
	 * 
	 * @param numeroLados contedndra valor para numeroLados
	 */
	public Poligono(int numeroLados) {
		if (numeroLados >= 0) {
			this.numeroLados = numeroLados;
		}
	}

	/**
	 * getter de atributo numeroLados
	 * 
	 * @return numeroLados devolvera valor actual de atributo numeroLados
	 */
	public int getNumeroLados() {
		return numeroLados;
	}

	/**
	 * metodo abstracto que calcula el area del poligono, sera heredado de sus
	 * subclases
	 * 
	 * @return
	 */
	public abstract double area();

	/**
	 * metodo que devolvera una cadena con los valores de los atributos del objeto
	 * que lo llama
	 */
	@Override
	public String toString() {
		String mensaje = "Numero de lados del poligono: " + numeroLados;
		return mensaje;
	}

}
