package ejercicio02;

/**
 * Clase Empleado.
 * 
 * @author isabelkatharinaloerzer
 *
 */
public class Empleado {
	
	/**
	 * Atributo privado nombre, inicializado con una cadena vacía.
	 */
	private String nombre="";
	
	/**
	 * Constructor Empleado por defecto.
	 */
	public Empleado () {
		
	}
	
	/**
	 * Constructor Empleado con parámetro nombre.
	 * 
	 * @param nombre
	 */
	public Empleado (String nombre) {
		
		this.nombre=nombre;
	}

	/**
	 * Método get del atributo nombre.
	 * @return nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Método set del atributo nombre.
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	@Override
	/**
	 * Método que devuelve un String con un mensaje tipo con toda la información de
	 * la clase.
	 */
	public String toString() {
		
		String res="";
		
		res="Empleado "+nombre;
		
		return res;
		
	}

}
