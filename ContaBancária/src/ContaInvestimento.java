
public class ContaInvestimento extends ContaBancaria {

	@Override
	public String calcularSaldo() {
		saldo += saldo * 5 / 100;
		return "O seu saldo final �:" + saldo;

	}

}
