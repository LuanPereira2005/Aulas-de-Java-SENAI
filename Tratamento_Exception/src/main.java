import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {

	public static void main(String[] args){

		ContaBancaria conta1 = new ContaBancaria(true, 20000, 200);
		Cliente cliente = new Cliente(conta1);
		cliente.setNome("Luan");
		cliente.setCpf(0);
		
		ContaBancaria conta2 = new ContaBancaria(true, 20000, 200);
		Cliente cliente2 = new Cliente(conta2);
		cliente2.setNome("Jucilenio");
		cliente2.setCpf(455454);

//		// Teste Booleano
//		if(cliente.getConta().sacar(200)==true) {
//			System.out.println("Saque realizado com sucesso");
//		}else {
//			System.out.println("Saque não realizado porque o saldo não é suficiente");
//		}
//		System.out.println("Seu saldo atual é " + cliente.getConta().verSaldo());
		
		// Teste Com Exception
		try {
			cliente.getConta().sacarEX(200);
		} catch (ContaException e) {
			System.out.println("Não foi possível realizar a operação porque " + e.getMessage());
			e.printStackTrace();
		}
//		// Teste Booleano
//		
//				if(cliente.getConta().transferir(cliente2,200)==true) {
//					System.out.println("Transferência realizada com sucesso");
//				}else {
//					System.out.println("Transferência não realizada porque o saldo não é suficiente");
//				}
//				System.out.println("Seu saldo atual é " + cliente.getConta().verSaldo());
//				System.out.println("O saldo atual da conta para qual o dinheiro foi é " + cliente2.getConta().verSaldo());		
		
				
//		List<Cliente>listaDeClientes=new ArrayList<Cliente>();
//		listaDeClientes.add(cliente);
//		listaDeClientes.add(cliente2);
//		int menu = 0;
//		while(menu < 4) {
//		System.out.println("Escolha o menu sobre o que você quer fazer");
//		System.out.println("1-Sacar");
//		System.out.println("2-Transferir");
//		System.out.println("3-Ver Saldo");
//		System.out.println("4-Sair");
//		Scanner entrada = new Scanner(System.in);
//		menu = entrada.nextInt();
//		switch (menu) {
//		case 1:
//			// Teste Magic Numbers
//			switch(cliente.getConta().sacarMN(200)) {
//			case 100:
//				System.out.println("Saque realizado com sucesso");
//				break;
//			case 101:
//				System.out.println("Saque realizado com sucesso mas você esta utilizando seu limite");
//				break;
//			case 102:
//				System.out.println("Saque não realizado porque nem o saldo e nem o limite são suficientes");
//				break;
//			}
//			System.out.println("Seu saldo atual é " + cliente.getConta().verSaldo());
//		break;
//		case 2:
//			// Teste Magic Numbers
//			switch(cliente.getConta().transferirMN(cliente2,200)) {
//			case 100:
//				System.out.println("Transferência realizada com sucesso");
//				System.out.println("O saldo atual da conta para qual o dinheiro foi é " + cliente2.getConta().verSaldo());
//				break;
//			case 101:
//				System.out.println("Transferência realizada com sucesso porém você esta utilizando seu limite");
//				System.out.println("O saldo atual da conta para qual o dinheiro foi é " + cliente2.getConta().verSaldo());
//				break;
//			case 102:
//				System.out.println("Transferência não realizada porque o saldo não é suficiente");
//				break;
//			}
//			System.out.println("Seu saldo atual é " + cliente.getConta().verSaldo());
//		break;
//		case 3:
//			System.out.println("Seu saldo atual é " + cliente.getConta().verSaldo());
//			break;
//		case 4:
//			break;
//		}
//		}		
}
}
