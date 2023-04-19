package ejercicio03;

public class Perecedero extends Productos {

	protected int diasCaducidad;

	public Perecedero() {
		super();

	}

	public Perecedero(String nombre, double precio, int diasCaducidad) {
		super(nombre, precio);

		if (diasCaducidad > 0) {

			this.diasCaducidad = diasCaducidad;
		}

	}

	public int getDiasCaducidad() {
		return diasCaducidad;
	}

	public void setDiasCaducidad(int diasCaducidad) {

		if (diasCaducidad > 0) {

			this.diasCaducidad = diasCaducidad;
		}
	}

	@Override
	public double calcularPrecio(int cant) {

		double PVP = 0.0;

		if (cant > 0) {

			//Llamamos a la función de la clase padre.
			PVP=super.calcularPrecio(cant);

			if (diasCaducidad == 1) {

				// El precio se reduce entre 4.
				PVP = PVP / 4;

			} else if (diasCaducidad == 2) {

				// Se reduce entre 3.
				PVP = PVP / 3;

			} else if (diasCaducidad == 3) {

				// Se reduce a la mitad.
				PVP = PVP / 2;
			}

		}

		return PVP;
	}
	
	@Override
	public String toString() {
		
		String res=super.toString();
		
		res+="Días a caducar: "+diasCaducidad+"\n";
		
		return res;
	}
}
