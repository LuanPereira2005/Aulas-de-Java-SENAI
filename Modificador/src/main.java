
public class main {

	public static void main(String[] args) {

		// Instanciando um objeto da classe ContaBancaria
		ContaBancaria conta1 = new ContaBancaria(true, 3.0);

		// Usando o metodo verSaldo do objeto conta1
		System.out.println(conta1.verSaldo());

		// Instanciando outro objeto da classe ContaBancaria
		ContaBancaria conta2 = new ContaBancaria();

		// Usando o metodo verSaldo do objeto conta2
		System.out.println(conta2.verSaldo());

		// Instanciando um objeto da classe Cliente
		Cliente cliente = new Cliente();

		// Usando os sets e gets do objeto cliente
		cliente.setNome("Luan");
		cliente.setCpf(0);
		cliente.setNumConta(0);

		System.out.println(cliente.getNome());
		System.out.println(cliente.getCpf());
		System.out.println(cliente.getNumConta());

		// Imprimir na tela o objeto cliente
		System.out.println(cliente);

		// Instanciando outro objeto da classe Cliente
		Cliente cliente2 = new Cliente();

		// // Usando os sets do objeto cliente2
		cliente2.setNome("Luan");
		cliente2.setCpf(0);
		cliente2.setNumConta(0);

		// cliente2 = cliente;

		// Imprimir na tela o objeto cliente2
		System.out.println(cliente2);

		// Testes condicionais else if comparando os objetos e os atributos dos objetos,
		// usando gets, apenas as variaveis e o .equals
		if (cliente.getNome() == cliente2.getNome()) {
			System.out.println("os nomes são iguais");
		} else {
			System.out.println("os nomes são diferentes");
		}

		if (cliente == cliente2) {
			System.out.println("os objetos são iguais");
		} else {
			System.out.println("os objetos são diferentes");
		}

		if (cliente.equals(cliente2)) {
			System.out.println("os objetos são iguais");
		} else {
			System.out.println("os objetos são diferentes");
		}

	}

}
