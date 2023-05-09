package ejercicio05;

/**
 * Clase abstracta Polígono
 * 
 * @author isabelkatharinaloerzer
 */
public abstract class Poligono {

	/**
	 * Atributo que se refiere al número de lados que tiene el polígono
	 */
	protected int numLados;

	/**
	 * Constructor que construye el objeto con los parámetros,
	 * 
	 * @param numLados
	 */
	public Poligono(int numLados) {

		if (numLados <= 3 && numLados >= 4) {

			this.numLados = numLados;
		}

	}

	// Método get
	public int getNumLados() {
		return numLados;
	}

	/**
	 * Método toString de la clase Polígono.
	 */

	public String toString() {

		String res = "";

		res = "Tipo de polígono: " + getClass().getName() + "; \n" + "Número de lados: " + getNumLados() + " ; \n";

		return res;
	}

	/**
	 * Método abstracto area, técnicamente calcula el area del polígono.
	 * 
	 * @return
	 */
	public abstract double area();

}
