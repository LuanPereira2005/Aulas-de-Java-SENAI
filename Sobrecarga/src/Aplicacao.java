import java.util.Scanner;

public class Aplicacao {

	public static void main(String[] args) {

		Matematica matematica = new Matematica();

		System.out.println("Somar dois n�meros");
		System.out.println("Digite o primeiro n�mero");

		Scanner numeros = new Scanner(System.in);

		int x = numeros.nextInt();

		System.out.println("Digite o segundo n�mero");

		int y = numeros.nextInt();

		int soma = matematica.somar(x, y);

		System.out.println("O resultado � " + soma);

		soma = matematica.somar(x, y);

		System.out.println("O resultado � " + soma);

		double soma2 = matematica.somar(x, y);

		System.out.println("O resultado � " + soma2);

	}

}
