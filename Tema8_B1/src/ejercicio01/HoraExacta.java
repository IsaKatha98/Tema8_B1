package ejercicio01;

public class HoraExacta extends Hora {
	
	int seg=0;
	
	public HoraExacta (int hora, int min, int seg) {
		
		//Hora y min lo cogemos de la clase padre Hora y seg la añadimos 
		//en esta clase.
		super(hora, min);
		
		if (seg>0&&seg<=59) {
			
			this.seg=seg;
		}
	
	}
	
	public void setSegundo (int seg) {
		
		if (seg>0&&seg<=59) {
			
		}
	}
	
	public void inc() {
		
		this.seg++;
		
		if (this.seg>59) {
			
			this.seg=0;

			super.inc();
		
		}
	}

	
}
