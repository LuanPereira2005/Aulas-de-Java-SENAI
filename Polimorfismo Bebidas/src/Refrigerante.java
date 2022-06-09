// Criacao de uma sub classe que extende de Bebida
public class Refrigerante extends Bebida {

	// Construtor da classe Refrigerante
	public Refrigerante() {
		super("refrigerante", false);
	}
	
	// Sobreposicao de um metodo da superclasse
	@Override
	public void preparar() {
		super.preparar();
		System.out.println("Colocando gelo no copo");
	}

}
