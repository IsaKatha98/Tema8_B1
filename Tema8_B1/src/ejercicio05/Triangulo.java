package ejercicio05;

/**
 * Clase Triángulo que hereda de la clase Polígono
 * 
 * @author isabelkatharinaloerzer
 */
public class Triangulo extends Poligono {

	/**
	 * Atributo del lado1.
	 */
	private double lado1;

	/**
	 * Atributo del lado2
	 */
	private double lado2;

	/**
	 * Atributo del lado3
	 */
	private double lado3;

	/**
	 * Constructor heredado de la superclase.
	 * 
	 * @param numLados
	 */
	public Triangulo(int numLados) {
		super(numLados);

	}

	/**
	 * Constructor con parámetros.
	 * 
	 * @param numLados
	 * @param lado1
	 * @param lado2
	 * @param lado3
	 */
	public Triangulo(int numLados, double lado1, double lado2, double lado3) {
		super(numLados);

		if (lado1 > 0) {
			this.lado1 = lado1;
		}

		if (lado2 > 0) {
			this.lado2 = lado2;
		}

		if (lado3 > 0) {
			this.lado3 = lado3;

		}
	}

	/**
	 * Método get del lado1.
	 * 
	 * @return lado1
	 */
	public double getLado1() {
		return lado1;
	}

	/**
	 * Método set del lado 1.
	 * 
	 * @param lado1
	 */

	public void setLado1(double lado1) {

		if (lado1 > 0) {
			this.lado1 = lado1;
		}

	}

	/**
	 * Método get del lado2.
	 * 
	 * @return lado2
	 */
	public double getLado2() {
		return lado2;
	}

	/**
	 * Método set del lado2.
	 * 
	 * @param lado2
	 */
	public void setLado2(double lado2) {

		if (lado2 > 0) {
			this.lado2 = lado2;
		}
	}

	/**
	 * Método get del lado 3.
	 * 
	 * @return lado3
	 */
	public double getLado3() {
		return lado3;
	}

	/**
	 * Método set del lado3.
	 * 
	 * @param lado3
	 */
	public void setLado3(double lado3) {

		if (lado3 > 0) {
			this.lado3 = lado3;
		}
	}

	@Override
	/**
	 * * Método que devuelve un String con un mensaje tipo con toda la información
	 * de la clase.
	 */
	public String toString() {

		String res = super.toString();

		res += "Lado 1 = " + this.lado1 + "; \n" + "Lado 2 = " + this.lado2 + "; \n" + "Lado 3 = " + this.lado3 + "; \n"
				+ "Área: " + area() + " ;\n";

		return res;
	}

	@Override
	/**
	 * Calcular el área del triángulo en cuestión.
	 */
	public double area() {

		double area;
		double semiP;

		// Primero necesitamos calcular el semiperímetro.
		semiP = (lado1 + lado2 + lado3) / 2;

		area = Math.sqrt(semiP * (semiP - lado1) * (semiP - lado2) * (semiP - lado3));

		return area;
	}

}
