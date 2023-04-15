package ejercicio1;

public class Hora {

	protected int hora;

	protected int minuto;

	public Hora(int hora, int minuto) {
		if (hora >= 0 & hora <= 23 && minuto >= 0 && minuto <= 59) {
			this.hora = hora;
			this.minuto = minuto;
		}
	}

	public boolean setHora(int hora) {
		boolean posible = false;
		if (hora >= 0 & hora <= 23) {
			this.hora = hora;
			posible = true;
		}
		return posible;
	}

	public boolean setMinuto(int minuto) {
		boolean posible = false;
		if (minuto >= 0 && minuto <= 59) {
			this.minuto = minuto;
			posible = true;
		}
		return posible;
	}

	public void inc() {
		minuto++;
		if (minuto == 60) {
			minuto = 0;
			hora++;
			if (hora >= 24) {
				hora = 0;
			}
		}
	}

	@Override
	public String toString() {
		String resultado = "";
		if (hora <= 9) {
			resultado += "0";
		}
		resultado += hora + ":";

		if (minuto <= 9) {
			resultado += "0";
		}
		resultado += minuto;

		return resultado;
	}

}
