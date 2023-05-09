package ejercicio02;

/**
 * Clase Oficial, que hereda de la clase Operario
 * 
 * @author isabelkatharinaloerzer
 *
 */
public class Oficial extends Operario {

	/**
	 * Constructor Oficial que hereda con el nombre de la superclase.
	 * 
	 * @param nombre
	 */
	public Oficial(String nombre) {

		super(nombre);
	}

	/**
	 * Método que devuelve un String con un mensaje tipo con toda la información de
	 * la clase.
	 */
	public String toString() {

		String res = super.toString();

		res += " -> Oficial";

		return res;
	}

}
