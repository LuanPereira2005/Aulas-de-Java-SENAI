import java.util.Scanner;

public class CalculadoraTop {

	public static void main(String[] args) {
		// Criacao de variaveis
		int n1;
		int n2;
		int total;

		String op = "";
		int control = 0;

		// Uso de Scanner para atribuir valores em atributos.
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite a operação desejada(+, -, /,*):");
		op = entrada.nextLine();

		System.out.println("Digite o primeiro valor:");
		n1 = Integer.parseInt(entrada.nextLine());

		System.out.println("Digite o segundo valor:");
		n2 = Integer.parseInt(entrada.nextLine());

		//Uso da expressao condicional if 
		if (op.equals("+")) {

			System.out.println("O resultado da soma é:" + (n1 + n2));
			control++;

		}
		if (op.equals("-")) {

			System.out.println("O resultado da subtração é:" + (n1 - n2));
			control++;

		}
		if (op.equals("/")) {

			System.out.println("O resultado da divisão é:" + (n1 / n2));
			control++;

		}
		if (op.equals("*")) {

			System.out.println("O resultado da multiplicação é:" + (n1 * n2));
			control++;

		}
		if (control == 0) {
			System.out.println("Operação invalida, tente novamente!");
		}
	}
}
