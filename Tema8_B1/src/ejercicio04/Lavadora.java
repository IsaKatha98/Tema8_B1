package ejercicio04;

/**
 * Clase Lavadora, que es una subclase de Electrodoméstico.
 * 
 * @author isabelkatharinaloerzer
 */
public class Lavadora extends Electrodomestico {

	/**
	 * Atributo carga, 5 por defecto.
	 */
	protected double carga = 5;

	/**
	 * Constructor vacío heredado de Electrodoméstico.
	 */
	public Lavadora() {
		super();

	}

	/**
	 * Constructor heredado de Electrodoméstico con precioBase y peso.
	 * 
	 * @param precioBase
	 * @param peso
	 */

	public Lavadora(double precioBase, double peso) {
		super(precioBase, peso);

	}

	/**
	 * Constructor heredado de Electrodoméstico con carga.
	 * 
	 * @param precioBase
	 * @param color
	 * @param consumo
	 * @param peso
	 * @param carga
	 */

	public Lavadora(double precioBase, String color, char consumo, double peso, double carga) {
		super(precioBase, color, consumo, peso);

		if (carga >= 0) {

			this.carga = carga;
		}

	}

	// Métodos getters y setters
	public double getCarga() {
		return carga;
	}

	/**
	 * Método que devuelve un String con un mensaje tipo con toda la información de
	 * la clase.
	 */
	public String toString() {

		String res = super.toString();

		res += "Carga: " + this.carga + "kg; \n";

		return res;
	}

	@Override
	/**
	 * Método que calcula el precio final de una lavadora, añadiendo 50 al precio en
	 * caso de que su carga sea superior a 30.
	 * 
	 * @return precioFinal
	 */
	public double precioFinal() {

		double precioFinal = super.precioFinal();

		if (carga > 30) {

			precioFinal += 50;
		}

		return precioFinal;
	}

}
