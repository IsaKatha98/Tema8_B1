package ejercicio01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/*Creamos un escáner para poder leer los datos que introduzca el usuario por
		la consola.*/
										
		Scanner sc= new Scanner (System.in); 
										
		/*Le pediremos al usuario que introduzca los datos y los guardaremos en la 
		* variable correspondiente.*/
										
		System.out.print("Introduzca el número de horas y pulse Intro: ");
		int hora= sc.nextInt();
		System.out.print("Introduzca el número de minutos y pulse Intro: ");
		int min= sc.nextInt();
		
		//Creamos el objeto.
		Hora reloj= new Hora(hora, min);
		
		//Pasamos los valores de las variables a la clase de las funciones.
		reloj.setHora(hora);
		reloj.setMinutos(min);

		//Imprimimos la hora.
		System.out.println(reloj.toString());
		
		//Aumentamos 1.
		System.out.println("Si hacemos un incremento de uno: ");
		reloj.inc();
		System.out.println(reloj.toString());
		
		//Si intentamos settear la hora a 32.
		System.out.println(reloj.setHora(32));
		
	

	}

}
