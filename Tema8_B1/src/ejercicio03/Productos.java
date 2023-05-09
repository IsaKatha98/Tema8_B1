package ejercicio03;

/**
 * Clase Productos que gestiona los productos de un almacén.
 * 
 * @author isabelkatharinaloerzer
 *
 */
public class Productos {

	/**
	 * Atributo String nombre, inicializado con una cadena vacía.
	 */
	protected String nombre = "";

	/**
	 * Atributo precio
	 */
	protected double precio;

	/**
	 * Constructor Productos por defecto.
	 */
	public Productos() {
		super();

	}

	/**
	 * Constructor Productos con parámetros.
	 * 
	 * @param nombre
	 * @param precio
	 */
	public Productos(String nombre, double precio) {
		this.nombre = nombre;

		if (precio > 0) {

			this.precio = precio;
		}

	}

	// Métodos getters y setters.
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {

		if (precio > 0) {
			this.precio = precio;

		}

	}

	/**
	 * Método que calcula el precio dada una cantidad que se pasa por parámetro.
	 * 
	 * @param cant
	 * @return PVP precio total
	 */
	public double calcularPrecio(int cant) {

		double PVP = 0.0;

		if (cant > 0) {

			PVP = precio * cant;
		}

		return PVP;
	}

	/**
	 * Método que devuelve un String con un mensaje tipo con toda la información de
	 * la clase.
	 */
	public String toString() {

		String res = "";

		res = "Nombre: " + nombre + "\n" + "Precio: " + precio + "\n";

		return res;

	}

}
