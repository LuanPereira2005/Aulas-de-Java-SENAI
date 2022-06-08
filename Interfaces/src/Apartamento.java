// Criacao de uma classe que implementa de uma interface
public class Apartamento implements ItemCaro{
	// Sobreposicao do metodo da interface ItemCaro
	@Override
	public String getPreco() {
		return "$2500000";
	}

}
