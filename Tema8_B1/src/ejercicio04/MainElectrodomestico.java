package ejercicio04;

import java.util.Arrays;

public class MainElectrodomestico {

	public static void main(String[] args) {
		
		Electrodomestico [] electro = new Electrodomestico[10];
		
		electro[0]= new Electrodomestico(200.85, "gris", 'B', 7.98);
		
		electro[1]= new Electrodomestico (400, 50.25);
		
		electro[2]= new Electrodomestico ();
		
		electro[3]= new Lavadora (300, "blanca", 'A', 20.50, 40);
		
		electro[4]= new Lavadora (250, 100);
		
		electro[5]= new Lavadora ();
		
		electro[6]= new Television (450, "azul", 'C', 20.50, 55, true);
		
		electro[7]= new Television (600, 75.90);
		
		electro [8]= new Television ();
		
		electro[9]= new Television (600, "rojo", 'B', 25, 32, false);
		
		//Noas creamos tres variables.
		double totalElectro=0;
		double totalLava=0;
		double totalTeles=0;
		
		
		//Técnicamente el toString ya nos imprime todo, pero vamos a hacerlo igualmente.
		//Recorremos el array con un for-each.
		
		for (Electrodomestico e: electro) {
			
			System.out.println("Precio base -> "+e.getPrecioBase()+" euros.");
			System.out.println("Precio final -> "+e.precioFinal()+ " euros.");
			
			//Necesitamos ir sumando los precios finales de cada clase.
			
			
			//Vamos sumando a la variable correspondiente.
			totalElectro+= e.precioFinal();
			
			//Si identifica el tipo como Lavadora, se sumará a ese total.
			if (e instanceof Lavadora) {
				
				totalLava+=e.precioFinal();
	
			//En caso de que sea una tele
			} else if (e instanceof Television){
				
				totalTeles+=e.precioFinal();
			}
			

		}
		
		//Imprimimos los resultados.
		System.out.println("El total de precio de todos los electrodomésticos: "+totalElectro+" euros.\n");
		System.out.println("El total de precio de todas las lavadoras: "+totalLava+" euros.\n");
		System.out.println("El total de precio de todas las televisiones: "+totalTeles+" euros.\n");
		

	}

}
