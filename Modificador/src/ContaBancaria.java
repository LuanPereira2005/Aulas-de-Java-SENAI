// Criacao de uma classe
public class ContaBancaria {

	// Criacao de atributos
	private int numConta;
	private boolean ativo;
	private double saldo;

	// Construtores de Conta Bancaria, o primeiro vazio e o outro com dois
	// parametros
	ContaBancaria() {

		saldo = 50.0;
		ativo = true;

	}

	ContaBancaria(boolean ativo, double saldo) {

		this.ativo = ativo;
		this.saldo = saldo;

	}

	// Metodo para receber o valor de uma transferencia
	public void receba(double valor) {

		saldo += valor;

	}

	// Metodo usado para ver o atributo saldo
	public double verSaldo() {

		return saldo;

	}
	
	// Metodo usado para transferir o valor de saldo
	public void dar(double valor) {

		if (saldo >= valor)
			saldo -= valor;

	}

}
