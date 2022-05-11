
public class Aplicacao {

	public static void main(String[] args) {
		
		// Item item = new Item(); Demonstração de que não dá pra instanciar objeto a partir de uma classe abstrata
	
		//Criação de variavel e instância do objeto
		Item item = new Cogumelo();
		
		//Utilização do metódo pegar do objeto Cogumelo
		item.pegar();
		
		//Atribuição de variavel à instância do objeto
		item = new Diamante();
		
		//Utilização do metódo pegar do objeto Diamante
		item.pegar();
		
		//Atribuição de variavel à instância do objeto
		item = new Moeda();
		
		//Utilização do metódo pegar do objeto Moeda
		item.pegar();
		
		
	}

}
