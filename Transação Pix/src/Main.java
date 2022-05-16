import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		
		Cliente cliente1 = new Cliente();
		Pix pix1 = new Pix();
		Cliente cliente2 = new Cliente();
		Pix pix2 = new Pix();
		
		cliente1.nome = "Dj Azeitona";
		cliente1.conta = 2525;
		cliente1.saldo = 500;
		pix1.valor = 200;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Escolha o menu");
		String menu = scanner.next();
		
		if(menu=="1")
			
		cliente1.versaldo(cliente1.saldo);
				
		cliente1.adicionar(pix1.valor);
		
		cliente2.nome = "Cleito Rasta";
		cliente2.conta = 5050;
		cliente2.saldo= 800;
		pix2.valor= 200;
				
		cliente2.dar(pix2.valor);
		
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
