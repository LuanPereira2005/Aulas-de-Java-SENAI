// Criacao da classe ContaCorrente que extende da classe abstrata ContaBancaria.
public class ContaCorrente extends ContaBancaria {

	// Sobrescrita do metodo abstrato calcularSaldo.
	@Override
	public String calcularSaldo() {
		saldo -= saldo * 10 / 100;
		return "O seu saldo final é:" + saldo;
	}

}
