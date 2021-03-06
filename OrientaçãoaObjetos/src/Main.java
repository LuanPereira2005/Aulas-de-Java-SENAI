
public class Main {

	public static void main(String[] args) {
		// Instanciando um objeto da classe Pessoas
		Pessoas pessoa1 = new Pessoas();

		// Atribuindo valores a atributos do objeto pessoa1
		pessoa1.nome = "Cleito Rasta";
		pessoa1.num_fig = 200;

		// Imprimir na tela os atributos do objeto pessoa1
		System.out.println(pessoa1.nome);
		System.out.println(pessoa1.num_fig);

		// Instanciando outro objeto da classe Pessoas
		Pessoas pessoa2 = new Pessoas();

		// Atribuindo valores a atributos do objeto pessoa2
		pessoa2.nome = "Dj Azeitona";
		pessoa2.num_fig = 150;

		// Imprimir na tela os atributos do objeto pessoa2
		System.out.println(pessoa2.nome);
		System.out.println(pessoa2.num_fig);

		// Criando um atributo para receber o retorno do metodo dar que foi utilizado
		// abaixo
		boolean msg = pessoa1.dar(200, pessoa2);

		// Teste condicional para ver se funcionou a transferencia
		if (msg == true) {

			System.out.println(pessoa1.nome);
			System.out.println(pessoa1.num_fig);
			System.out.println(pessoa2.nome);
			System.out.println(pessoa2.num_fig);

		}

	}
}
