
public class Lampada {
	
	private boolean ligada;
	
	Lampada(boolean ligada){
		
		this.ligada = ligada;		
	}
	
	public String imprimir() {
		
		if(ligada==true)
			
			return "A lampada est� ligada";
		
		else
			
			return "A lampada est� desligada";
	}
	
	public String ligar() {
		
		this.ligada = true;
		
		return "A lampada est� ligada";	
	}
	public String desligar() {
		
		this.ligada = false;
		
		return "A lampada est� desligada";	
	}
	
	

}
