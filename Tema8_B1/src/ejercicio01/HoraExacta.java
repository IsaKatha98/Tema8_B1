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
	
	public void setSegundo (int valor) {
		
		if (valor>0&&valor<=59) {
			seg=valor;
		}
	}
	
	@Override
	public void inc() {
		
		seg++;
		
		if (seg==60) {
			
			seg=0;
			super.inc();
		
		}
	}
	
	
public String toString () {
		
		String res=super.toString();
		
		res+=":";
			
		if (seg<=9) {
			res+="0";
		}
		
		res+= seg;
		
		return res;
	}


	
}
