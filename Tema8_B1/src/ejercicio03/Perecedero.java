package ejercicio03;

/**
 * Clase Perecedero, subclase de Productos
 * 
 * @author isabelkatharinaloerzer
 *
 */
public class Perecedero extends Productos {

	/**
	 * Atributo entero de diasdeCaducidad.
	 */
	protected int diasCaducidad;

	/**
	 * Constructor Perecedero sin parámetros.
	 */
	public Perecedero() {
		super();

	}

	/**
	 * Constructor Perecedero con todos los parámetros.
	 * 
	 * @param nombre
	 * @param precio
	 * @param diasCaducidad
	 */
	public Perecedero(String nombre, double precio, int diasCaducidad) {
		super(nombre, precio);

		if (diasCaducidad > 0) {

			this.diasCaducidad = diasCaducidad;
		}

	}

	// Métodos getters y setters.
	public int getDiasCaducidad() {
		return diasCaducidad;
	}

	public void setDiasCaducidad(int diasCaducidad) {

		if (diasCaducidad > 0) {

			this.diasCaducidad = diasCaducidad;
		}
	}

	@Override
	/**
	 * Método que calcula el precio dada una cantidad y según los días que le quedan
	 * antes de caducar se aplica un porcentaje u otro.
	 * 
	 * @return PVP devuelve el precio calculado
	 */
	public double calcularPrecio(int cant) {

		double PVP = 0.0;

		if (cant > 0) {

			// Llamamos a la función de la clase padre.
			PVP = super.calcularPrecio(cant);

			if (diasCaducidad == 1) {

				// El precio se reduce entre 4.
				PVP = PVP / 4;

			} else if (diasCaducidad == 2) {

				// Se reduce entre 3.
				PVP = PVP / 3;

			} else if (diasCaducidad == 3) {

				// Se reduce a la mitad.
				PVP = PVP / 2;
			}

		}

		return PVP;
	}

	@Override
	/**
	 * Método que devuelve un String con un mensaje tipo con toda la información de
	 * la clase.
	 */
	public String toString() {

		String res = super.toString();

		res += "Días a caducar: " + diasCaducidad + "\n";

		return res;
	}
}
