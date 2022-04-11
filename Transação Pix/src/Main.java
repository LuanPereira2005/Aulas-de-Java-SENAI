
public class Main {

	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente();
		Cliente cliente2 = new Cliente();
		
		cliente1.nome = "Dj Azeitona";
		cliente1.conta = 2525;
		cliente1.saldo= 500;
				
		cliente1.adicionar(700);
		
		cliente2.nome = "Cleito Rasta";
		cliente2.conta = 5050;
		cliente2.saldo= 800;
				
		cliente2.dar(700);
		
		System.out.println(cliente1.nome);
		System.out.println(cliente1.conta);
		System.out.println(cliente1.saldo);
		System.out.println(cliente2.nome);
		System.out.println(cliente2.conta);
		System.out.println(cliente2.saldo);
	}

}
