package ejercicio03;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		//Nos creamos un producto
		Productos p= new Productos ("Tomate", 0.5);
		
		//Imprimimos resultados.
		System.out.println(p.toString());
		System.out.println(p.calcularPrecio(5));
		
		
		
		//Nos creamos un perecedero.
		Productos p1= new Perecedero("Tomate", 1.5, 3);
		
		//Imprimimos resultados.
		System.out.println(p1.toString());
		System.out.println(p1.calcularPrecio(5));
		
		
		//Creamos un no perecedero.
		Productos p2= new NoPerecedero ("Lata", 5.25, "Comestible");
		
		//Imprimimos resultados.
		System.out.println(p2.toString());
		System.out.println(p2.calcularPrecio(4));
		
		
		
		//Creamos un array de tres productos.
		Productos[] tienda= new Productos [6];
		
		//Inicializamos el array.
		tienda[0]= new Productos("Peine", 2.5);
		tienda[1]= new Productos("Botella", 0.75);
		tienda[2]= new Perecedero ("Tomate", 1.25, 3);
		tienda[3]= new Perecedero ("Manzana", 1.4, 4);
		tienda[4]= new NoPerecedero ("Lata", 3.25, "Comestible");
		tienda[5]= new NoPerecedero ("Rímel", 12, "Maquillaje");
		
		System.out.println(Arrays.toString(tienda));
		
		for (int i=0; i<tienda.length; i++) {
			
			System.out.println(tienda[i].calcularPrecio(5));
		}
		
		
	}

}
