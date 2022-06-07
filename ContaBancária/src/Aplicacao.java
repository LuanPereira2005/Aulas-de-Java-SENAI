
public class Aplicacao {

	public static void main(String[] args) {

		// Instancia de dois objetos, um da classe ContaCorrente e o outro da
		// ContaInvestimento.
		ContaCorrente conta1 = new ContaCorrente();
		ContaInvestimento conta2 = new ContaInvestimento();

		// Uso dos metodos genericos da classe abstrata (ContaBancaria).
		conta1.verSaldo();
		conta1.depositar(10);
		conta1.sacar(10);
		conta1.transferir(10, conta2);

		conta2.verSaldo();
		conta2.depositar(10);
		conta2.sacar(10);
		conta2.transferir(10, conta1);

		// Imprimir na tela o retorno dos metodos sobrescritos das classes especificas.
		System.out.println(conta1.calcularSaldo());
		System.out.println(conta2.calcularSaldo());
	}

}
