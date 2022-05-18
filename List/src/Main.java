import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

//		List lista = new ArrayList();
//
//		lista.add("Abc");
//		lista.add(12);
//		lista.add(true);

//		for (int x = 0; x < lista.size(); x++) {
//			System.out.println(lista.get(x));
//		}
//		for (Object valor : lista) {
//			System.out.println(valor);
//		}
//		System.out.println();
//
//		lista.remove(0);
//
//		for (Object valor : lista) {
//			System.out.println(valor);
//		}
//		System.out.println();
//		
//		lista.add(0, "Cachorro Quente com Purê");
//
//		for (Object valor : lista) {
//			System.out.println(valor);
//		}
//		System.out.println();
//		
//		lista.set(0, "Fiat Uno Com Escada e Adesivo de Firma");
//		
//		for (Object valor : lista) {
//			System.out.println(valor);
//		}
//		System.out.println();
//		
//		lista.clear();
//		
//		if(lista.isEmpty()) {
//			System.out.println("Sua Lista Está Vazia.");
//		
		Conta conta1 = new Conta("Dj Azeitona", 200.50);
		Conta conta2 = new Conta("Dj Cleitôn Rasta", 225.50);
		
		List<Conta> listaDeContas = new ArrayList<Conta>();
		
		listaDeContas.add(conta1);
		listaDeContas.add(conta2);
		
		for(Conta conta : listaDeContas) {
			System.out.println(conta);
		}
		
		}
	}

