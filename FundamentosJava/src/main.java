import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// Criação de variavel e atribuição de valores a ela
//		int x = 100;
//		double y = 200;
//		short z = (short) 32767;
//
//		int a = 0;
//		double b = 0;
//
//		a = (int) z; // Casting explicito//
//		b = x; // Casting implicito//
//
//		System.out.println(b);
//		System.out.println(a);
//
//		int idade = 50000000;
//
//		if (idade < 18) {
//			System.out.println("vaza otário!");
//			System.out.println("cê é burro man, cê só tem " + idade + " anos");
//		} else if (idade < 60) {
//			System.out.println("Pode ficar parcero já que você tem " + idade + " anos");
//		} else if (idade < 100) {
//			System.out.println("Cê tem " + idade + "anos");
//			System.out.println("Volta para o asilo, velhote!");
//		} else {
//			System.out.println("Caramba cê tem " + idade + " anos");
//			System.out.println("Sai pra lá, Peter do Ei Nerd kkkkkk");
//		}
//		
//		String estacao = "Verão";
//
//		switch (estacao) {
//
//		case "Outono":
//
//			System.out.println("Hora das folhas caírem!");
//
//			break;
//
//		case "Verão":
//
//			System.out.println("Calor de 500° vem aí");
//
//			break;
//
//		case "Inverno":
//
//			System.out.println("Frio de -500° vem aí");
//
//			break;
//
//		case "Primavera":
//
//			System.out.println("Hora das flores nascerem!");
//
//			break;
//		}

//			int num;
//			
//			Scanner entrada = new Scanner(System.in);
//			
//			System.out.println("Escreva um numero");
//			
//			num=Integer.parseInt(entrada.nextLine());
//
//			switch (num) {
//
//			case 1:
//
//				System.out.println("Domingo");
//
//				break;
//				
//			case 2:
//
//				System.out.println("Segunda");
//				
//				break;
//
//			case 3:
//
//				System.out.println("Terça");
//				
//				break;
//
//			case 4:
//
//				System.out.println("Quarta");
//				
//				break;
//
//			case 5:
//
//				System.out.println("Quinta");
//				
//				break;
//
//			case 6:
//
//				System.out.println("Sexta");
//				
//				break;
//
//			case 7:
//
//				System.out.println("Sabado");
//				
//				break;
//				
//			default:
//				
//				System.out.println("Esse dia da semana não existe");
//			}

//		char caractere = 'a';
//		
//		switch(caractere) {
//			case 'a':
//				System.out.println("Seu caractere é " + caractere);
//				break;
//			case 'b':
//				System.out.println("Seu caractere é " + caractere);
//				break;
//			default:
//				System.out.println("Valor inválido");
//		
//		}
//
//		String cor;
//
//		Scanner entrada = new Scanner(System.in);
//
//		System.out.println("Qual a cor do semaforo?");
//
//		cor = entrada.next();
//
//		switch (cor) {
//		case "Verde":
//			System.out.println("Pôem na quinta e vai!!!");
//			break;
//		case "Amarelo":
//			System.out.println("Vai que dá!");
//			break;
//		case "Vermelho":
//			System.out.println("Parar pra não ser multado LOL");
//			break;
//		}
//		int x=0;
//		
//		while(x<10) {
//			x = x+1;
//			System.out.println(x);
//		}
//	}
//}

//		for(int x=0; x<11; x+=2) {
//			System.out.println(x);
//		}
//		int a=0;
//		
//		Scanner entrada = new Scanner(System.in);
//		
//		System.out.println("Escolha a tabuada");
//		
//		a=Integer.parseInt(entrada.nextLine());
//		
//		for(int b=a; b<a*10.5; b+=a) {
//			System.out.println(b + " x " + a + " = " + b);
//		}

//		double z = 0;
//		double x = 0;
//		double y = 0;
//		String op = "";
//		
//		Scanner entrada = new Scanner(System.in);
//		
//		System.out.println("Escreva o primeiro número");
//		x=Integer.parseInt(entrada.nextLine());
//		System.out.println("Escreva o segundo número");
//		y=Integer.parseInt(entrada.nextLine());
//		System.out.println("Escreva a operação");
//		op=entrada.next();
//
//		switch (op) {
//		case "+":
//			z = x + y;
//			System.out.println(z);
//			break;
//		case "-":
//			z = x - y;
//			System.out.println(z);
//			break;
//		case "*":
//			z = x * y;
//			System.out.println(z);
//			break;
//		case "/":
//			z = x / y;
//			System.out.println(z);
//			break;
//		}
//		for(int x=0; x<=1000000; x+=1) {
//			System.out.println(x);
//		}
//
//		int x1 = 3;
//		int z1 = 5;
//		int y1 = 7;
//
//		System.out.println(x1);
//		System.out.println(y1);
//		System.out.println(z1);
//		System.out.println();
//
//		double x[] = { 3, 5, 3, 5 };
//
//		for (int aux = 0; aux < x.length; aux++) {
//			System.out.println("valor do indice " + aux + " = " + x[aux]);
//		}
//		String nome[] = { "Luan", "Marquinhos", "Emanuel", "Vitão" };
//
//		for (int aux = 0; aux < nome.length; aux++) {
//			System.out.println(nome[aux]);
//			if (nome[aux] == "Marquinhos") {
//				System.out.println("O indice de " + nome[aux] + " é = " + aux);
//			}
//		}
//		int[] a = new int[5];
//		String[] b = new String[4];
//		double[] c = new double[3];
//
//		a[3] = 5;
//
//		int[] numero = new int[6];
//		Scanner teclado = new Scanner(System.in);
//
//		for (int aux = 0; aux < numero.length; aux++) {
//			System.out.println("Digite um número qualquer");
//			numero[aux] = teclado.nextInt();
//		}
//		for (int aux = 0; aux < numero.length; aux++) {
//			System.out.println("Indice "+aux+" = " +numero[aux]);
//		}
		
//		int[] arrayQualquer = new int[5];
//		
//		Object [] arrayObject = new Object[7];
//		
//		arrayObject[0] = "Queijo de pão";
//		arrayObject[1] = 25;
//		arrayObject[2] = 'A';
//		arrayObject[3] = 2554545845455465454.2;
//		arrayObject[4] = true;
//		arrayObject[5] = arrayQualquer;
//		
//		
//		for (int aux = 0; aux < arrayObject.length;aux++) {
//			System.out.println("Indice "+aux+ " = "+arrayObject[aux]);
//		}
		
		int[][] arrayBidirecional = new int[5][3];
		
		arrayBidirecional[0][0] = 8;
		arrayBidirecional[4][1] = 5;
		
		for (int linha = 0; linha < arrayBidirecional.length;linha++) {
			for (int coluna = 0;coluna < arrayBidirecional[0].length;coluna++) {
				System.out.print("Indice [" + linha + "][" + coluna + "] = " + arrayBidirecional[linha][coluna]+"    ");
			}
		System.out.println();	
			
		}
	}
}
