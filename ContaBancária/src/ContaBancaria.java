
public abstract class ContaBancaria {
	
	protected String nome;
	protected double saldo = 50;

	public void depositar(double x) {
		saldo += x;
		System.out.println("Você depositou R$" + x + " e agora seu saldo é R$" + saldo);
	}

	public void sacar(double x) {
		saldo -= x;
		System.out.println("Você sacou R$" + x + " e agora seu saldo é R$" + saldo);
	}

	public void transferir(double x, ContaBancaria contabancaria) {
		saldo -= x;
		contabancaria.saldo += x;
		System.out.println("Você transferiu R$" + x + " e agora seu saldo é R$" + saldo);

	}

	public void verSaldo() {
		System.out.println("Seu saldo é:" + saldo);

	}

	public abstract String calcularSaldo();

}
