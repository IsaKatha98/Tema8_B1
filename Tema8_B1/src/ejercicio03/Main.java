package ejercicio03;

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

	}

}
