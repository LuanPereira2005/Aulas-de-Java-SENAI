
public class Pessoas {
	String nome;
	int num_fig; // Número de figurinhas da pessoa//

	void receber(int num_fig, Pessoas pessoa) {

		pessoa.num_fig += num_fig;
	}

	boolean dar(int num_fig, Pessoas pessoa) {
		boolean msg;
		
		if (num_fig > this.num_fig) {
			System.out.println("Erro");
			msg = false;
		}else {

			this.num_fig -= num_fig;

			pessoa.receber(num_fig, pessoa);
			msg = true;
		}
		return msg;

	}
}