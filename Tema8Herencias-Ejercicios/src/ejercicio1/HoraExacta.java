package ejercicio1;

public class HoraExacta extends Hora {

	protected int segundo;

	public HoraExacta(int hora, int minuto, int segundo) {
		super(hora, minuto);
	}

	public void setSegundos(int segundo) {
		if (segundo <= 0 && segundo >= 59) {
			this.segundo = segundo;
		}
	}

	@Override
	public void inc() {
		segundo++;
		if (segundo == 60) {
			segundo = 0;
			super.inc();
		}
	}

	@Override
	public String toString() {
		String resultado = super.toString() + ":";

		if (segundo <= 9) {
			resultado += "0";
		}
		resultado += segundo;

		return resultado;
	}

}
