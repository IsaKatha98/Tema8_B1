package ejercicio05;

/**
 * Clase Rectángulo, que hereda de la clase Polígono.
 * 
 * @author isabelkatharinaloerzer
 */
public class Rectangulo extends Poligono {

	/**
	 * Atributo del lado1.
	 */
	protected double lado1;

	/**
	 * Atributo que guarda el valor del lado2.
	 */
	protected double lado2;

	/**
	 * Constructor heredado de la superclase.
	 * 
	 * @param numLados
	 */
	public Rectangulo(int numLados) {
		super(numLados);

	}

	/**
	 * Constructor Rectangulo con parámetros.
	 * 
	 * @param numLados
	 * @param lado1
	 * @param lado2
	 */
	public Rectangulo(int numLados, double lado1, double lado2) {
		super(numLados);

		if (lado1 > 0) {
			this.lado1 = lado1;
		}

		if (lado2 > 0) {
			this.lado2 = lado2;
		}

	}

	/**
	 * Método get del lado1
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
	 * Método get del lado2
	 * 
	 * @return lado2
	 */
	public double getLado2() {
		return lado2;
	}

	/**
	 * Método set del lado 2.
	 * 
	 * @param lado2
	 */
	public void setLado2(double lado2) {

		if (lado2 > 0) {

			this.lado2 = lado2;
		}
	}

	@Override
	public String toString() {

		String res = super.toString();

		res += "Lado 1 = " + this.lado1 + "; \n" + "Lado 2 = " + this.lado2 + "; \n" + "Área: " + area() + " ;\n";

		return res;
	}

	@Override

	/**
	 * Método que calcula el área del rectángulo.
	 * 
	 * @return area
	 */
	public double area() {

		double area;

		area = lado1 * lado2;

		return area;
	}
}
