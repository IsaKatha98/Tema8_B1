package ejercicio04;

public class Electrodomestico {

	protected double precioBase = 100;

	enum Color {
		blanco, negro, rojo, azul, gris
	}

	protected Color color= Color.blanco;

	enum Consumo {
		
		A, B, C, D, E, F
	}

	protected Consumo consumo= Consumo.F;

	protected double peso = 5;

	/**
	 * Constructor por defecto.
	 */

	public Electrodomestico() {

	}

	/**
	 * Constructor Electrodoméstico con precioBase y peso por parámetros.
	 * 
	 * @param precioBase
	 * @param peso
	 */
	public Electrodomestico(double precioBase, double peso) {
		if (precioBase >= 0) {

			this.precioBase = precioBase;

		}

		if (peso >= 0) {

			this.peso = peso;

		}
	}

	public Electrodomestico(double precioBase, String color, char consumo, double peso) {

		if (precioBase >= 0) {

			this.precioBase = precioBase;

		}

		//Llamamos a la función comprobarColor.
		comprobarColor(color);
		
		//Llamamos a la función comprobarConsumoEnergético.
		comprobarConsumoEnergetico(consumo);
		

		if (peso >= 0) {

			this.peso = peso;
		}

	}

	public double getPrecioBase() {
		return precioBase;
	}

	public Color getColor() {
		return color;
	}

	public Consumo getConsumo() {
		return consumo;
	}

	public double getPeso() {
		return peso;
	}

	/**
	 * Método toString de la clase Electrodoméstico.
	 * 
	 */
	public String toString() {

		String res = "";

		res = "Precio base: " + this.precioBase + " euros; \n" 
				+"Precio final: "+precioFinal()+ "euros; \n"
			+ "Color: " + this.color + ";\n" 
			+ "Consumo energético: "+ this.consumo + ";\n" 
				+ "Peso: " + this.peso + " kg; \n";

		return res;
	}

	/**
	 * Método que comprueba la letra del consumo energético y la settea correspondientemente.
	 * 
	 * @param letra
	 */
	private void comprobarConsumoEnergetico(char letra) {

		if (letra=='A'||letra=='B'||letra=='C'||letra=='D'||letra=='E'||letra=='F'){
			
			//Aquí se establece consumo según la letra.
			//se hace String.valueof porque letra es un char
			this.consumo=Consumo.valueOf(String.valueOf(letra));		
	
		} else {
			
			this.consumo=Consumo.F;
		}

	}
	
	/**
	 *Método que comprueba el color del electrodoméstico y lo settea correspondientemente.
	 *
	 * @param color
	 */
	private void comprobarColor (String color) {
		
		if (color.equalsIgnoreCase("blanco")||color.equalsIgnoreCase("rojo")||color.equalsIgnoreCase("azul")||color.equalsIgnoreCase("gris")||color.equalsIgnoreCase("negro")) {
			
			//Se asigna el color
			this.color=Color.valueOf(color);
		
		} else {
			
			this.color=Color.blanco;
		}
	}

	/**
	 * Método que devuelve el precio final según el precio base, el consumo energético y el peso del producto.
	 * 
	 * @return precioFinal
	 */
	public double precioFinal() {

		double precioFinal = precioBase;

		switch (consumo) {

		case A -> {

			precioFinal += 100;

		}

		case B -> {

			precioFinal += 80;

		}

		case C -> {

			precioFinal += 60;
		}

		case D -> {

			precioFinal += 50;
		}

		case E -> {

			precioFinal += 30;
		}

		case F -> {

			precioFinal += 10;
		}

		}

		if (peso >= 0 && peso <= 19) {

			precioFinal += 10;

		} else if (peso > 19 && peso <= 49) {

			precioFinal += 50;

		} else if (peso > 49 && peso <= 79) {

			precioFinal += 80;

		} else if (peso > 79) {

			precioFinal += 100;

		}

		return precioFinal;

	}

}
