
public class Lampada {
	
	private boolean ligada;
	
	Lampada(boolean ligada){
		
		this.ligada = ligada;		
	}
	
	public String imprimir() {
		
		if(ligada==true)
			
			return "A lampada está ligada";
		
		else
			
			return "A lampada está desligada";
	}
	
	public String ligar() {
		
		this.ligada = true;
		
		return "A lampada está ligada";	
	}
	public String desligar() {
		
		this.ligada = false;
		
		return "A lampada está desligada";	
	}
	
	

}
