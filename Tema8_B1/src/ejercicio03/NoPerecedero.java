package ejercicio03;

/**
 * Clase NoPerecedero, subclase de Productos
 * 
 * @author isabelkatharinaloerzer
 *
 */
public class NoPerecedero extends Productos {

	/**
	 * Atributo de tipo String.
	 */
	private String tipo;

	/**
	 * Constructor sin parámetros.
	 */
	public NoPerecedero() {
		super();

	}

	/**
	 * Constructor NoPerecedero con parámetros.
	 * 
	 * @param nombre
	 * @param precio
	 * @param tipo
	 */
	public NoPerecedero(String nombre, double precio, String tipo) {
		super(nombre, precio);
		this.tipo = tipo;

	}

	// Métodos getters y setters.
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	/**
	 * Método que devuelve un String con un mensaje tipo con toda la información de
	 * la clase.
	 */
	public String toString() {

		String res = super.toString();

		res += "Tipo: " + tipo + "\n";

		return res;
	}

}
