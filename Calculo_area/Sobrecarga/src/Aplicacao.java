import java.util.Scanner;

public class Aplicacao {

	public static void main(String[] args) {

		Matematica matematica = new Matematica();

		System.out.println("Somar dois números");
		System.out.println("Digite o primeiro número");

		Scanner numeros = new Scanner(System.in);

		int x = numeros.nextInt();

		System.out.println("Digite o segundo número");

		int y = numeros.nextInt();

		int soma = matematica.somar(x, y);

		System.out.println("O resultado é " + soma);

		soma = matematica.somar(x, y);

		System.out.println("O resultado é " + soma);

		double soma2 = matematica.somar(x, y);

		System.out.println("O resultado é " + soma2);

	}

}
