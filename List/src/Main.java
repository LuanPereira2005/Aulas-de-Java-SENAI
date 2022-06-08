import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		// Instancia de uma ArrayList
		// ArrayList e literalmente uma lista em que se pode colocar qualquer tipo de dado e ate mesmo objetos dependendo da assinatura do seu new.
		List lista = new ArrayList();
		
		// Metodo para adicionar dados na sua lista
		lista.add("Abc");
		lista.add(12);
		lista.add(true);
		
		// For para mostrar o que esta na lista.
		for (int x = 0; x < lista.size(); x++) {
			System.out.println(lista.get(x));
		}
		// Enhanced For para mostrar o que esta na lista.
		for (Object valor : lista) {
			System.out.println(valor);
		}
		// Syso usado para pular uma linha
		System.out.println();

		// Metodo usado para remover objetos ou dados em que o parametro para isso e o indice
		lista.remove(0);

		// Enhanced For para mostrar o que esta na lista.
		for (Object valor : lista) {
			System.out.println(valor);
		}
		// Syso usado para pular uma linha
		System.out.println();
		
		// Metodo para adicionar dados na sua lista mas em um indice especifico,nesse caso 0
		lista.add(0, "Cachorro Quente com Purê");

		// Enhanced For para mostrar o que esta na lista.
		for (Object valor : lista) {
			System.out.println(valor);
		}
		System.out.println();
		
		lista.set(0, "Fiat Uno Com Escada e Adesivo de Firma");
		
		for (Object valor : lista) {
			System.out.println(valor);
		}
		// Syso usado para pular uma linha
		System.out.println();
		
		// Metodo usado para limpar a lista 
		lista.clear();
		
		// Teste condicional para ver se a lista esta vazia
		if(lista.isEmpty()) {
			System.out.println("Sua Lista Está Vazia.");
			
		// Instanciando objetos da classe conta
		Conta conta1 = new Conta("Dj Azeitona", 200.50);
		Conta conta2 = new Conta("Dj Cleitôn Rasta", 225.50);
		
		// Instanciando uma lista de objetos da classe Conta, fazendo assim com que ele aceite apenas objetos dessa classe
		List<Conta> listaDeContas = new ArrayList<Conta>();
		
		// Metodo para adicionar objetos na sua lista
		listaDeContas.add(conta1);
		listaDeContas.add(conta2);
		
		// Enhanced For para mostrar o que esta na lista.
		for(Conta conta : listaDeContas) {
			System.out.println(conta);
		}
		
		}
	}
}
