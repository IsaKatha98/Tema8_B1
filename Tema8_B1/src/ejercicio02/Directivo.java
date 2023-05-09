package ejercicio02;

/**
 * Clase Directivo, que hereda de la clase Empleado.
 * 
 * @author isabelkatharinaloerzer
 *
 */
public class Directivo extends Empleado {

	/**
	 * Constructor Directivo que hereda con el nombre de la superclase.
	 * 
	 * @param nombre
	 */
	public Directivo(String nombre) {

		super(nombre);
	}

	/**
	 * Método que devuelve un String con un mensaje tipo con toda la información de
	 * la clase.
	 */
	public String toString() {

		String res = super.toString();

		res += " -> Directivo";

		return res;
	}

}
