package ejercicio05;

public abstract class Poligono {

	protected int numLados;

	public Poligono(int numLados) {

		if (numLados<=3&&numLados>=4) {
			
			this.numLados = numLados;
		}
			
	}

	public int getNumLados() {
		return numLados;
	}

	/**
	 * Método toString de la clase Polígono.
	 */
	
	public String toString() {

		String res = "";

		res = "Tipo de polígono: "+getClass().getName() +"; \n" +"Número de lados: " + getNumLados() + " ; \n";

		return res;
	}
	
	/**
	 * Método abstracto area, técnicamente calcula el area del polígono.
	 * @return
	 */
	public abstract double area();

	
	
	
	
	
	 
	
}
