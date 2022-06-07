import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		// Instancia de um objeto da classe Numeros
		Numeros numero1 = new Numeros();

		// Criacao de um scanner
		Scanner entrada = new Scanner(System.in);

		// Uso de Scanner para atribuir valores em atributos.
		System.out.println("Voc� quer calcular a �rea de:");
		System.out.println("1-Quadrado");
		System.out.println("2-Ret�ngulo");
		System.out.println("3-Tri�ngulo");

		int menu = entrada.nextInt();

		// Uso do teste condicional if.
		if (menu == 1) {

			// Criacao de um outro scanner
			Scanner l = new Scanner(System.in);

			// Uso de Scanner para atribuir valores em atributos.
			System.out.println("Digite um dos lados do quadrado");

			double L = l.nextDouble();

			// Criacao de variavel e atribuicao do retorno do metodo .ca a ela
			double area = numero1.ca(L);

			System.out.println("O resultado � " + area);

		} else {

			if (menu == 2) {

				System.out.println("Digite a altura do ret�ngulo");

				// Criacao de outro scanner.
				Scanner ab = new Scanner(System.in);
				
				// Uso do Scanner para atribuir valores a variaveis.
				int A = ab.nextInt();

				System.out.println("Digite a base do ret�ngulo");

				int B = ab.nextInt();

				// Criacao de variavel e atribuicao do retorno do metodo .ca a ela
				int area2 = numero1.ca(A, B);

				System.out.println("O resultado � " + area2);

			} else {

				if (menu == 3) {
					// Criacao de outro scanner.
					Scanner ba = new Scanner(System.in);
					
					// Uso do Scanner para atribuir valores a variaveis.
					System.out.println("Digite a base do tri�ngulo");

					double b = ba.nextDouble();

					System.out.println("Digite a base do tri�ngulo");

					double a = ba.nextDouble();
					// Criacao de variavel e atribuicao do retorno do metodo .ca a ela
					double area3 = numero1.ca(b, a);

					System.out.println("O resultado � " + area3);

				} else {

				}
			}
		}
	}
}
