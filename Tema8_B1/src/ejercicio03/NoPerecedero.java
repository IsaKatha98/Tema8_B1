package ejercicio03;

public class NoPerecedero extends Productos{
	
	private String tipo;

	public NoPerecedero() {
		super();
		
	}

	public NoPerecedero(String nombre, double precio, String tipo) {
		super(nombre, precio);
		this.tipo= tipo;
		
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public String toString () {
		
		String res=super.toString();
		
		res+= "Tipo: "+tipo+"\n";
		
		return res;
	}
	
	
}
