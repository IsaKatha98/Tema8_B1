package ejercicio03;

public class Productos {
	
	protected String nombre="";
	
	protected double precio;

	public Productos() {
		super();
		
	}

	public Productos(String nombre, double precio) {
		super();
		this.nombre = nombre;
		this.precio = precio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public double calcularPrecio (int cant) {
		
		double PVP=0.0;
		
		if (cant>0) {
			
			PVP=precio*cant;
		}
		
		return PVP;
	}
	

}
