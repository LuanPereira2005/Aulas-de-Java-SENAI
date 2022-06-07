// Criacao da classe abstrata ContaBancaria.
public abstract class ContaBancaria {

	// Criacao de atributos da classe.
	protected String nome;
	protected double saldo = 50;

	// Metodos padroes a todas as classes herdeiras.
	public void depositar(double x) {
		saldo += x;
		System.out.println("Voc� depositou R$" + x + " e agora seu saldo � R$" + saldo);
	}

	public void sacar(double x) {
		saldo -= x;
		System.out.println("Voc� sacou R$" + x + " e agora seu saldo � R$" + saldo);
	}

	public void transferir(double x, ContaBancaria contabancaria) {
		saldo -= x;
		contabancaria.saldo += x;
		System.out.println("Voc� transferiu R$" + x + " e agora seu saldo � R$" + saldo);

	}

	public void verSaldo() {
		System.out.println("Seu saldo �:" + saldo);

	}

	// Criacao de um metodo abstrato
	// Um metodo abstrato e um metodo nao implementado na classe abstrata mas que se
	// encaixa com todas as classes herdeiras.
	public abstract String calcularSaldo();

}
