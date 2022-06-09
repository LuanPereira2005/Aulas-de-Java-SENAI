import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// Instanciando 4 objetos de classes diferentes
		Cliente cliente1 = new Cliente();
		Pix pix1 = new Pix();
		Cliente cliente2 = new Cliente();
		Pix pix2 = new Pix();

		// Usando os metodos dos objetos criados
		cliente1.nome = "Dj Azeitona";
		cliente1.conta = 2525;
		cliente1.saldo = 500;
		pix1.valor = 200;

		// Criando e usando um scanner para escolher o menu
		Scanner scanner = new Scanner(System.in);
		System.out.println("Escolha o menu");
		String menu = scanner.next();

		// Usando os metodos dos objetos
		cliente1.versaldo(cliente1.saldo);
		cliente1.adicionar(pix1.valor);

		// Atribuindo valores ao atributos dos objetos
		cliente2.nome = "Cleito Rasta";
		cliente2.conta = 5050;
		cliente2.saldo = 800;
		pix2.valor = 200;

		// Usando o metodo dos objeto cliente2
		cliente2.dar(pix2.valor);

		// Imprimir na tela os atributos dos objetos
		System.out.println(cliente1.nome);
		System.out.println(cliente1.conta);
		System.out.println(pix1.valor);
		System.out.println(cliente1.saldo);
		System.out.println(cliente2.nome);
		System.out.println(cliente2.conta);
		System.out.println(pix2.valor);
		System.out.println(cliente2.saldo);
	}

}
