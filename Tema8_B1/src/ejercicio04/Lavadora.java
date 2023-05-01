package ejercicio04;

public class Lavadora extends Electrodomestico {
	
	/**
	 * Atributo
	 */
	protected double carga= 5;

	/**
	 * Constructor vacío heredado de Electrodoméstico.
	 */
	public Lavadora() {
		super();
		
	}

	/**
	 * Constructor heredado de Electrodoméstico con precioBase y peso.
	 * @param precioBase
	 * @param peso
	 */
	
	public Lavadora(double precioBase, double peso) {
		super(precioBase, peso);
		
	}

	/**
	 * Constructor heredado de Electrodoméstico con carga.
	 * 
	 * @param precioBase
	 * @param color
	 * @param consumo
	 * @param peso
	 * @param carga
	 */
	
	public Lavadora(double precioBase, String color, char consumo, double peso, double carga) {
		super(precioBase, color, consumo, peso);
		
		if (carga>=0) {
			
			this.carga=carga;
		}
	
	}

	public double getCarga() {
		return carga;
	}
	
	public String toString () {
		
		String res= super.toString();
		
		res+="Carga: "+this.carga+ "kg; \n";
		
		return res;
	}
	
	@Override
	public double precioFinal () {
		
		double precioFinal=super.precioFinal();
		
		if (carga>30) {
			
			precioFinal+=50;
		}
		
		return precioFinal;
	}

}
