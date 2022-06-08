import java.util.Scanner;

public class main {

	public static void main(String[] args) {

		// Criacao de variaveis
		int data;
		int formato;
		int AmPm;
		int dia;
		int mes;
		int ano;
		int hora;
		int min;
		int seg;
		
		// Criacao de um Scanner
		Scanner entrada = new Scanner(System.in);
		
		// Uso do scanner para atribuir valores a atributos
		System.out.println("Digite o dia");

		dia = Integer.parseInt(entrada.next());

		System.out.println("Digite o mês");

		mes = Integer.parseInt(entrada.next());

		System.out.println("Digite o ano");

		ano = Integer.parseInt(entrada.next());

		System.out.println("Escolha o formato da data");
		System.out.println("1-Sem Hora");
		System.out.println("2-Com Hora");

		Data data1 = new Data(dia, mes, ano, 0, 0, 0);

		data = Integer.parseInt(entrada.next());
		// Teste condicional para saber qual o formato da data que sera mostrada.
		if (data == 1) {

			System.out.println(data1.imprimir());

		} else if (data == 2) {

			System.out.println("Digite a hora");

			hora = Integer.parseInt(entrada.next());

			data1.setHora(hora);

			System.out.println("Digite o minuto");

			min = Integer.parseInt(entrada.next());

			data1.setMin(min);

			System.out.println("Digite o segundo");

			seg = Integer.parseInt(entrada.next());
			data1.setSeg(seg);

			System.out.println("Escolha o formato da hora");

			System.out.println("12 ou 24");

			formato = Integer.parseInt(entrada.next());

			if (formato == 24) {

				System.out.println(data1.imprimir(formato));

			} else if (formato == 12) {

				System.out.println("Escolha se será Am ou Pm");
				System.out.println("1-Para Am");
				System.out.println("2-Para Pm");

				AmPm = Integer.parseInt(entrada.next());

				if (AmPm == 1) {

					System.out.println(data1.imprimir(formato, AmPm));

				} else if (AmPm == 2) {

					System.out.println(data1.imprimir(formato, AmPm));

				}

			}
		}

	}

}
