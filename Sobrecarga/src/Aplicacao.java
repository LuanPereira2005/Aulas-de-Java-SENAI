import java.util.Scanner;

public class Aplicacao {

	public static void main(String[] args) {

		// Instanciando um objeto da classe Matematica
		Matematica matematica = new Matematica();

		// Criacao e uso de um scanner para atribuir valores a variaveis
		System.out.println("Somar dois n�meros");
		System.out.println("Digite o primeiro n�mero");

		Scanner numeros = new Scanner(System.in);

		int x = numeros.nextInt();

		System.out.println("Digite o segundo n�mero");

		int y = numeros.nextInt();

		// Criando uma variavel e // Atribuindo o valor de retorno do metodo somar e
		// imprimindo a variavel na tela logo depois
		int soma = matematica.somar(x, y);

		System.out.println("O resultado � " + soma);

		// Atribuindo o valor de retorno do metodo somar e imprimindo a variavel na tela
		// logo depois
		soma = matematica.somar(x, y);

		System.out.println("O resultado � " + soma);

		// Atribuindo o valor de retorno do metodo somar e imprimindo a variavel na tela logo depois
		double soma2 = matematica.somar(x, y);

		System.out.println("O resultado � " + soma2);

	}

}
