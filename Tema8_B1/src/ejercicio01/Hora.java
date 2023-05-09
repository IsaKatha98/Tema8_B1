package ejercicio01;

/**
 * Clase Hora que calcula el objeto Hora y que aumenta los segundos.
 * 
 * @author isabelkatharinaloerzer
 *
 */

public class Hora {
	// Se ponen los atributos protected para que se puedan heredar.

	/**
	 * Atributo hora.
	 */
	protected int hora = 0;

	/**
	 * Atributo minutos.
	 */
	protected int min = 0;

	/**
	 * Costructor Hora con parámetros hora y minutos.
	 * 
	 * @param hora
	 * @param min
	 */
	public Hora(int hora, int min) {

		// Comprobaciones antes de asignarle valor a los atributos.
		if (hora > 0 && hora <= 23) {
			this.hora = hora;
		}

		if (min > 0 && min <= 59) {
			this.min = min;
		}

	}

	/**
	 * Método que incrementa la hora por un minuto.
	 */
	public void inc() {

		min++;

		if (min >= 60) {

			min = 0;
			hora++;

			if (hora == 24) {
				hora = 0;
			}
		}

	}

	/**
	 * Método que comprueba que el valor asignado a minutos es válido.
	 * 
	 * @param valor
	 * @return
	 */
	public boolean setMinutos(int valor) {

		boolean valido = false;

		// Tenemos que comprobar si valor es un número válido.
		// Si lo es, se le asigna a min.
		if (valor > 0 && valor <= 59) {

			min = valor;
			valido = true;
		}

		return valido;

	}

	/**
	 * Método que comprueba que el valor asignado a hora es válido.
	 * 
	 * @param valor
	 * @return
	 */
	public boolean setHora(int valor) {

		boolean valido = false;

		// Tenemos que comprobar si valor es un número válido.
		// Si lo es, se le asigna a min.
		if (valor > 0 && valor <= 23) {

			hora = valor;
			valido = true;
		}

		return valido;
	}

	@Override
	/**
	 * Método que devuelve un String con un mensaje tipo con toda la información de
	 * la clase.
	 * 
	 */
	public String toString() {

		String res = "La hora es:";

		if (hora <= 9) {

			res += "0";
		}

		res += hora + ":";

		if (min <= 9) {
			res += "0";
		}

		res += min;

		return res;
	}

}
