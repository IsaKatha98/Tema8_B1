package ejercicio01;

/**
 * Clase HoraExacta que es una subclase de Hora.
 * 
 * @author isabelkatharinaloerzer
 *
 */
public class HoraExacta extends Hora {

	/**
	 * Atributo segundos.
	 */
	int seg = 0;

	public HoraExacta(int hora, int min, int seg) {

		// Hora y min lo cogemos de la clase padre Hora y seg la añadimos
		// en esta clase.
		super(hora, min);

		if (seg > 0 && seg <= 59) {

			this.seg = seg;
		}

	}

	/**
	 * Método que comprueba que el valor asignado a segundos es válido.
	 * 
	 * @param valor
	 */
	public void setSegundo(int valor) {

		if (valor > 0 && valor <= 59) {
			seg = valor;
		}
	}

	@Override
	/**
	 * Método heredado de la superclase que incrementa en uno los segundos.
	 */
	public void inc() {

		seg++;

		if (seg == 60) {

			seg = 0;
			super.inc();

		}
	}

	/**
	 * Método que devuelve un String con un mensaje tipo con toda la información de
	 * la clase.
	 * 
	 */
	public String toString() {

		String res = super.toString();

		res += ":";

		if (seg <= 9) {
			res += "0";
		}

		res += seg;

		return res;
	}

}
