package ejercicio02;

/**
 * Clase Técnico, subclase de Operario.
 * 
 * @author isabelkatharinaloerzer
 *
 */
public class Tecnico extends Operario {

	/**
	 * Constructor Tecnico que hereda de la superclase.
	 * 
	 * @param nombre
	 */
	public Tecnico(String nombre) {

		super(nombre);
	}

	/**
	 * Método que devuelve un String con un mensaje tipo con toda la información de
	 * la clase.
	 */
	public String toString() {

		String res = super.toString();

		res += " -> Técnico";

		return res;
	}

}
