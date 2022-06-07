
public class Contador {
	//Criacao de um atributo static int
	private static int valor;
	
	// Construtor de Contador
//	public Contador() {
//		this.valor = 1;
//	}
	
	// Atribuindo valor ao atributo static
	static {
		valor=1;
	}
	
	// Metodos estaticos que serao os mesmos para todas as classes
	public static void incrementar() {
		valor ++;
	}
	
	//Gets and Sets
	public static int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}
	
	

}
