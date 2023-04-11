package ejercicio1;

public class Hora {

	protected int hora;

	protected int minuto;

	public Hora(int hora, int minuto) {
		this.hora = hora;
		this.minuto = minuto;
	}

	public boolean setHora(int hora) {
		boolean posible = false;
		if (hora >= 0 & hora <= 23) {
			this.hora = hora;
		}
		return posible;
	}

	public boolean setMinuto(int minuto) {
		boolean posible = false;
		if (minuto >= 0 && minuto <= 59) {
			this.minuto = minuto;
		}
		return posible;
	}

	public void inc() {
		minuto++;
		if (minuto == 60) {
			minuto = 0;
			hora++;
		} 
	}

	@Override
	public String toString() {
		return hora + ":" + minuto;
	}

}
