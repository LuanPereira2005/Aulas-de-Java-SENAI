// Criacao de uma classe
public class ContaBancaria {

	// Criacao de atributos
	private int numConta;
	private boolean ativo;
	private double saldo;
	private Cliente cliente;
	private double limite;

	// Get e set de saldo

	// Construtores de Conta Bancaria, o primeiro vazio e o outro com dois
	// parametros
	ContaBancaria() {
	}

	ContaBancaria(boolean ativo, double saldo, double limite) {

		this.ativo = ativo;
		this.saldo = saldo;
		this.limite = limite;
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
	public boolean transferir(Cliente cliente, double valor) {
		if (this.saldo >= valor) {
			saldo -= valor;
			cliente.getConta().receba(valor);
		} else if (this.saldo - valor >= limite*-1) {
			saldo -= valor;
			cliente.getConta().receba(valor);
		} else {
			return false;
		}
		return true;
	}

	public int transferirMN(Cliente cliente, double valor) {
		if (this.saldo >= valor) {
			saldo -= valor;
			cliente.getConta().receba(valor);
			return 100;
		} else if (this.saldo - valor >= limite*-1) {
			saldo -= valor;
			cliente.getConta().receba(valor);
			return 101;
		} else {
			return 102;
		}
	}

	// Metodo usado para sacar o valor de saldo
	public boolean sacar(double valor) {
		if (this.saldo >= valor) {
			saldo -= valor;
		} else if (this.saldo - valor >= limite*-1) {
			saldo -= valor;
		} else {
			return false;
		}
		return true;
	}

	public int sacarMN(double valor) {
		if (this.saldo >= valor) {
			saldo -= valor;
			return 100;
		} else if (this.saldo - valor >= limite*-1) {
			saldo -= valor;
			return 101;
		} else {
			return 102;
		}
	}

	public void sacarEX(double valor) throws ContaException{
	if(this.saldo - valor < limite*-1) {
			throw new ContaException("O Saldo e Limite Insuficientes; Seu saldo atual é "+saldo);
		}
		this.saldo -= valor;
	}
}

