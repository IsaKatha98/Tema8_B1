package ejercicio05;

import java.util.Arrays;
import java.util.Scanner;

public class MainPoligono {

	static Poligono[] figuras = new Poligono[0];

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		// Declaramos las variables necesarias.
		int opcion = 0;

		// Hacemos un bucle que se repita hasta que nos salgamos del programa.
		do {

			// Presentamos el menú.
			menu();

			// Preguntamos la opción que quiere el usuario.
			System.out.println("Introduzca la opción que desea: ");
			opcion = sc.nextInt();

			// Hacemos un switch.
			switch (opcion) {

			case 1 -> {

				// Introduce un triángulo
				creaTriangulo();
			}

			case 2 -> {

				// Introduce un rectçangulo.
				creaRectangulo();
			}

			case 3 -> {

				// Muestra todo.
				listado();
			}

			case 4 -> {

				System.out.println("Ha salido del programa.");
			}

			default -> {

				System.err.println("Opción introducida incorrecta");
			}
			}

		} while (opcion != 4);
	}

	private static void menu() {

		System.out.println("Figuras" + "" + "\n===================" + "\n1. Introducir triángulo"
				+ "\n2. Introducir rectángulo" + "\n3. Mostrar" + "\n4. Salir");

	}

	private static void creaTriangulo() {

		// Hacemos una copia del array añadiendo una posición.
		figuras = Arrays.copyOf(figuras, figuras.length + 1);

		double lado1;
		double lado2;
		double lado3;

		// Hacemos una copia del array añadiendo una posición.
		figuras = Arrays.copyOf(figuras, figuras.length + 1);

		sc.nextLine();
		// Pedimos los lados.

		do {
			System.out.println("Introduzca el valor de un lado: ");
			lado1 = sc.nextDouble();

		} while (lado1 < 0);

		do {
			System.out.println("Introduzca el valor de un lado: ");
			lado2 = sc.nextDouble();

		} while (lado2 < 0);

		do {
			System.out.println("Introduzca el valor de un lado: ");
			lado3 = sc.nextDouble();

		} while (lado3 < 0);

		// Asignamos los valores a un triangulo nuevo, en la última posición del array.
		figuras[figuras.length - 1] = new Triangulo(3, lado1, lado2, lado3);

	}

	private static void creaRectangulo() {

		double lado1;
		double lado2;

		// Hacemos una copia del array añadiendo una posición.
		figuras = Arrays.copyOf(figuras, figuras.length + 1);

		sc.nextLine();
		// Pedimos los lados.

		do {
			System.out.println("Introduzca el valor de un lado: ");
			lado1 = sc.nextDouble();

		} while (lado1 < 0);

		do {
			System.out.println("Introduzca el valor de un lado: ");
			lado2 = sc.nextDouble();

		} while (lado2 < 0);

		// Asignamos los valores a un rectángulo nuevo.
		figuras[figuras.length - 1] = new Rectangulo(4, lado1, lado2);

	}

	private static void listado() {

		// Recorremos el array
		for (Poligono fig : figuras) {

			// Imprimimos las posiciones que no sea null.
			if (fig != null) {

				System.out.println(fig);

			}
		}

	}

}
