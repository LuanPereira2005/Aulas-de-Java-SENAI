// Criacao de classe
public class Pessoas {
	// Criacao de atributos
	String nome;
	int num_fig; // Número de figurinhas da pessoa//

	// Metodo para receber figurinhas transferidas de outras pessoas
	void receber(int num_fig, Pessoas pessoa) {

		pessoa.num_fig += num_fig;
	}

	// Metodo para transferir figurinhas para outras pessoas com um retorno booelan
	// para dizer se a operacao deu certo ou nao
	boolean dar(int num_fig, Pessoas pessoa) {
		boolean msg;

		if (num_fig > this.num_fig) {
			System.out.println("Erro");
			msg = false;
		} else {

			this.num_fig -= num_fig;

			pessoa.receber(num_fig, pessoa);
			msg = true;
		}
		return msg;

	}
}