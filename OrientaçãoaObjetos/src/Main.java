
public class Main {

	public static void main(String[] args) {
		
		Pessoas pessoa1 = new Pessoas();
		
		pessoa1.nome = "Cleito Rasta";
		pessoa1.num_fig = 5;
		
		pessoa1.receber(5);
		
		System.out.println(pessoa1.nome);
		System.out.println(pessoa1.num_fig);

	}

}
