package ejercicio04;

public class MainElectrodomestico {

	public static void main(String[] args) {
		
		Electrodomestico electro= new Electrodomestico(200.85, "gris", 'B', 7.98);
		
		
				
		System.out.println(electro);
		
		
		Lavadora samsung= new Lavadora (300, "blanca", 'A', 20.50, 40);
		
		System.out.println(samsung);

	}

}
