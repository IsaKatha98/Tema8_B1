package ejercicio02;

/**
 * Clase Operario, es una subclase de Empleado.
 * 
 * @author isabelkatharinaloerzer
 *
 */
public class Operario extends Empleado {

	/**
	 * Constructor Operario, que hereda sus parámetros de la superclase.
	 * 
	 * @param nombre
	 */
	public Operario(String nombre) {

		super(nombre);
	}

	@Override
	/**
	 * Método que devuelve un String con un mensaje tipo con toda la información de
	 * la clase.
	 * 
	 */
	public String toString() {

		String res = super.toString();

		res += " -> Operario";

		return res;
	}

}
