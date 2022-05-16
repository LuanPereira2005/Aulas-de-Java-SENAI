
public abstract class ContaBancaria {
	
	protected String nome;
	protected double saldo = 50;

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

	public abstract String calcularSaldo();

}
