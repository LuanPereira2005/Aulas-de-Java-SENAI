
public class Aplicacao {

	public static void main(String[] args) {

		ContaCorrente conta1 = new ContaCorrente();
		ContaInvestimento conta2 = new ContaInvestimento();

		conta1.verSaldo();
		conta1.depositar(10);
		conta1.sacar(10);
		conta1.transferir(10, conta2);

		conta2.verSaldo();
		conta2.depositar(10);
		conta2.sacar(10);
		conta2.transferir(10, conta1);

		System.out.println(conta1.calcularSaldo());
		System.out.println(conta2.calcularSaldo());
	}

}
