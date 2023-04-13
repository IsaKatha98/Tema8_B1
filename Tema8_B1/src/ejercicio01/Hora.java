package ejercicio01;

public class Hora {
	//Se ponen los atributos protected para que se puedan heredar.
	
	protected int hora=0;
	
	protected int min=0;
	
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
		
		min++;
		
		if (min>=60) {
			
			min=0;
			hora++;
			
			if (hora==24) {
				hora=0;
			}
		}
		
	}
	
	public boolean setMinutos (int valor) {
		
		boolean valido =false;
		
		//Tenemos que comprobar si valor es un número válido.
		//Si lo es, se le asigna a min.
		if (valor>0&&valor<=59) {
			
			min=valor;
			valido=true;
		}
		
		return valido;
		
	}
	
	public boolean setHora (int valor) {
		
		boolean valido= false;
		
		//Tenemos que comprobar si valor es un número válido.
		//Si lo es, se le asigna a min.
		if (valor>0&&valor<=23) {
			
			hora=valor;
			valido=true;
		}
		
		return valido;
	}
	
	@Override
	public String toString () {
		
		String res="La hora es:";
		
		if (hora<=9) {
			
			res+="0";
		}
		
		
		res+=hora+":";
		
		if (min<=9) {
			res+="0";
		}
		
		res+=min;
		
		return res;
	}

}
