
public class Main {

	public static void main(String[] args) {

		Pessoas pessoa1 = new Pessoas();

		pessoa1.nome = "Cleito Rasta";
		pessoa1.num_fig = 200;

		System.out.println(pessoa1.nome);
		System.out.println(pessoa1.num_fig);

		Pessoas pessoa2 = new Pessoas();

		pessoa2.nome = "Dj Azeitona";
		pessoa2.num_fig = 150;

		System.out.println(pessoa2.nome);
		System.out.println(pessoa2.num_fig);

		boolean msg = pessoa1.dar(200, pessoa2);

		if (msg == true) {

			System.out.println(pessoa1.nome);
			System.out.println(pessoa1.num_fig);
			System.out.println(pessoa2.nome);
			System.out.println(pessoa2.num_fig);

		}

	}
}
