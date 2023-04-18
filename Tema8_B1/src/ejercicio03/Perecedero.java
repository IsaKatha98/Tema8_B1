package ejercicio03;

public class Perecedero extends Productos {

	protected int diasCaducidad;
	
	public Perecedero() {
		super();
		
	}

	public Perecedero(String nombre, double precio, int diasCaducidad) {
		super(nombre, precio);
		
		if (diasCaducidad>0) {
			
			this.diasCaducidad=diasCaducidad;
		}

	}

	public int getDiasCaducidad() {
		return diasCaducidad;
	}

	public void setDiasCaducidad(int diasCaducidad) {
		
		if(diasCaducidad>0) {
		
			this.diasCaducidad = diasCaducidad;
		}
	}
	
	@Override
		public double calcularPrecio (int cant) {
			
			double PVP=0.0;
			
			if (cant>0) {
				
				PVP=precio*cant;
			
				if (diasCaducidad==1) {
					
					//El precio se reduce entre 4.
					PVP=PVP/4;
				
				} else if (diasCaducidad==2) {
					
					//Se reduce entre 3.
					PVP=PVP/3;
				
				} else if (diasCaducidad==3) {
					
					//Se reduce a la mitad.
					PVP=PVP/2;
				}
			
			}
			
			
			return PVP;
		}
		
	}
	
	
	
	
		


