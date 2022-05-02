
public class main {

	public static void main(String[] args) {

		ContaBancaria conta1 = new ContaBancaria(true,3.0);

		System.out.println(conta1.verSaldo());

		ContaBancaria conta2 = new ContaBancaria();

		System.out.println(conta2.verSaldo());
		
		Cliente cliente = new Cliente();
		
		cliente.setNome("Luan");
		cliente.setCpf(0);
		cliente.setNumConta(0);
		
		System.out.println(cliente.getNome());
		System.out.println(cliente.getCpf());
		System.out.println(cliente.getNumConta());
		
		System.out.println(cliente);
		
		Cliente cliente2 = new Cliente();
		
		cliente2.setNome("Luan");
		cliente2.setCpf(0);
		cliente2.setNumConta(0);
		
		//cliente2 = cliente;
		
		System.out.println(cliente2);
		
		if(cliente.getNome() == cliente2.getNome()) {
			System.out.println("os nomes são iguais");
		}else {
			System.out.println("os nomes são diferentes");	
		}
		
		if(cliente==cliente2) {
			System.out.println("os objetos são iguais");
		}else {
			System.out.println("os objetos são diferentes");	
		}
		
		if(cliente.equals(cliente2)) {
			System.out.println("os objetos são iguais");
		}else {
			System.out.println("os objetos são diferentes");	
		}
		
		
	}

}
