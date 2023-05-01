package ejercicio04;

public class MainElectrodomestico {

	public static void main(String[] args) {
		
		Electrodomestico [] electro = new Electrodomestico[10];
		
		electro[0]= new Electrodomestico(200.85, "gris", 'B', 7.98);
		
		electro[1]= new Electrodomestico (400, 50.25);
		
		electro[2]
		
		
				
		//System.out.println(electro);
		
		
		Lavadora samsung= new Lavadora (300, "blanca", 'A', 20.50, 40);
		
		//System.out.println(samsung);
		
		Television lg= new Television (450, "azul", 'C', 20.50, 55, true);
		
		System.out.println(lg);

	}

}
