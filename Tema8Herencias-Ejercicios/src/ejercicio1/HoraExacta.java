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

	public void inc() {
		segundo++;
		if (segundo == 60) {
			segundo = 0;
			super.inc();
		}

	}

	@Override
	public String toString() {
		return hora + ":" + minuto + ":" + segundo;
	}

}
