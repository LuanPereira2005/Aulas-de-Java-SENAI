
public class ContaBancaria {

	private int numConta;
	private boolean ativo;
	private double saldo;
	
	
	
	ContaBancaria() {
		
		saldo = 50.0;
		ativo = true;
	
	}

	ContaBancaria(boolean ativo, double saldo) {
		
		this.ativo = ativo;
		this.saldo = saldo;
		
	}



	public void receba(double valor) {

		saldo += valor;

	}

	public double verSaldo() {

		return saldo;

	}

	public void dar(double valor) {

		if (saldo >= valor)
			saldo -= valor;

	}

}
