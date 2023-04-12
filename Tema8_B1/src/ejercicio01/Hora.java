package ejercicio01;

public class Hora {
	
	int hora=0;
	
	int min=0;
	
	public Hora (int hora, int min) {
		
		//Comprobaciones antes de asignarle valor a los atributos.
		if (hora>0&&hora<=23) {
			this.hora=hora;
		}
		
		if (min>0&&min<=59) {
			this.min=min;
		}
		
	}
	
	public void inc () {
		
		this.min++;
		
		if (this.min==60) {
			
			this.min=0;
			this.hora++;
			
			if (this.hora==24) {
				this.hora=0;
			}
		}
		
	}
	
	public boolean setMinutos (int min) {
		
		boolean valor =false;
		
		if (min>0&&min<=59) {
			
			this.min=min;
			valor=true;
		}
		
		return valor;
		
	}
	
	public boolean setHora (int hora) {
		
		boolean valor= false;
		
		if (hora>0&&hora<=23) {
			
			this.hora=hora;
			valor=true;
		}
		
		return valor;
	}
	
	public String toString () {
		
		String res="";
		
		res+="La hora es: "+this.hora+":"+min;
		
		return res;
	}

}
