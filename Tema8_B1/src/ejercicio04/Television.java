package ejercicio04;

public class Television extends Electrodomestico {
	
	protected double pulgadas=20;
	
	boolean tdt=false;

	public Television() {
		super();
		
	}

	public Television(double precioBase, double peso) {
		super(precioBase, peso);
		
	}

	public Television(double precioBase, String color, char consumo, double peso, double pulgadas, boolean tdt) {
		super(precioBase, color, consumo, peso);
		
		if (pulgadas>0) {
			
			this.pulgadas=pulgadas;
		}
		
		this.tdt=tdt;
	}
	
	
}
