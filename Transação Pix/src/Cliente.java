// Criando uma classe
public class Cliente {

	// Criando os atributos
	String nome;
	int conta;
	Pix pix;
	float saldo;

	// Criando metodos da classe para receber e dar dinheiro e ver o atributo saldo
	// atual
	void adicionar(float saldo) {
		this.saldo += saldo;

	}

	void dar(float saldo) {
		this.saldo -= saldo;

	}

	void versaldo(float saldo) {
		System.out.println("Esse é o seu saldo:");
		System.out.println(saldo);

	}
}
