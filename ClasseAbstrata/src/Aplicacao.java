
public class Aplicacao {

	public static void main(String[] args) {
		
		// Item item = new Item(); Demonstra��o de que n�o d� pra instanciar objeto a partir de uma classe abstrata
	
		//Cria��o de variavel e inst�ncia do objeto
		Item item = new Cogumelo();
		
		//Utiliza��o do met�do pegar do objeto Cogumelo
		item.pegar();
		
		//Atribui��o de variavel � inst�ncia do objeto
		item = new Diamante();
		
		//Utiliza��o do met�do pegar do objeto Diamante
		item.pegar();
		
		//Atribui��o de variavel � inst�ncia do objeto
		item = new Moeda();
		
		//Utiliza��o do met�do pegar do objeto Moeda
		item.pegar();
		
		
	}

}
