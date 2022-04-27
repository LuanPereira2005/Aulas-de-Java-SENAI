import java.util.Scanner;

public class main {

	public static void main(String[] args) {
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
		for(int x=0; x<=1000000000; x+=10) {
			System.out.println(x);
		}

	}
}
