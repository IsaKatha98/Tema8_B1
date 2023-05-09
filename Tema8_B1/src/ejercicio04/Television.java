package ejercicio04;

/**
 * Clase Television, que hereda de la clase Electrodoméstico
 * 
 * @author isabelkatharinaloerzer
 */
public class Television extends Electrodomestico {

	/**
	 * Atributo pulgadas, 20 por defecto.
	 */
	protected double pulgadas = 20;

	/**
	 * Atributo tdt, que no tiene por defecto.
	 */
	boolean tdt = false;

	/**
	 * Constructor por defecto heredado por la clase padre.
	 */
	public Television() {
		super();

	}

	/**
	 * Cosntructor Television con precioBase y pase por parámetros.
	 * 
	 * @param precioBase
	 * @param peso
	 */
	public Television(double precioBase, double peso) {
		super(precioBase, peso);

	}

	/**
	 * Contructor Television con todos los parámetros.
	 * 
	 * @param precioBase
	 * @param color
	 * @param consumo
	 * @param peso
	 * @param pulgadas
	 * @param tdt
	 */
	public Television(double precioBase, String color, char consumo, double peso, double pulgadas, boolean tdt) {
		super(precioBase, color, consumo, peso);

		if (pulgadas > 0) {

			this.pulgadas = pulgadas;
		}

		this.tdt = tdt;
	}

	// Mçetodos getter y setter
	public double getPulgadas() {
		return pulgadas;
	}

	public boolean getTdt() {
		return tdt;
	}

	/**
	 * * Método que devuelve un String con un mensaje tipo con toda la información
	 * de la clase.
	 */
	public String toString() {

		String res = super.toString();

		res += "Pulgadas: " + this.pulgadas + "; \n" + "TDT: " + this.tdt + " ;";

		return res;
	}

	@Override
	/**
	 * Método precio final que hereda de la superclase y según el número de pulgadas
	 * y si tiene TDT o no.
	 * 
	 * @return precioFinal
	 */
	public double precioFinal() {

		double precioFinal = super.precioFinal();

		if (pulgadas > 40) {

			precioFinal += precioFinal * 0.3;
		}

		if (tdt = true) {

			precioFinal += 50;
		}

		return precioFinal;
	}

}
