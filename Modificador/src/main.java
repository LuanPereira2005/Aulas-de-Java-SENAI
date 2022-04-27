
public class main {

	public static void main(String[] args) {

		ContaBancaria conta1 = new ContaBancaria(true,3.0);

		System.out.println(conta1.verSaldo());

		ContaBancaria conta2 = new ContaBancaria();

		System.out.println(conta2.verSaldo());

	}

}
