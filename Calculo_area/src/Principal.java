import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Numeros numero1 = new Numeros();
		
		System.out.println("Voc� quer calcular a �rea de:");
		System.out.println("1-Quadrado");
		System.out.println("2-Ret�ngulo");
		System.out.println("3-Tri�ngulo");
		
		Scanner entrada = new Scanner(System.in);
		
		int menu = entrada.nextInt();
		
		if(menu==1) {
		
		Scanner l = new Scanner(System.in);

		System.out.println("Digite um dos lados do quadrado");
		
		double L = l.nextDouble();
		
		double area = numero1.ca(L);
		
		System.out.println("O resultado � " + area);
		
		}else {
		
		if(menu==2) {

		System.out.println("Digite a altura do ret�ngulo");
		
		Scanner ab = new Scanner(System.in);
		
		int A = ab.nextInt();

		System.out.println("Digite a base do ret�ngulo");

		int B = ab.nextInt();

		int area2 = numero1.ca(A,B);
		
		System.out.println("O resultado � " + area2);
		
		}else {
		
		if(menu==3) {

		Scanner ba = new Scanner(System.in);

		System.out.println("Digite a base do tri�ngulo");
		
		double b = ba.nextDouble();
		
		System.out.println("Digite a base do tri�ngulo");
		
		double a = ba.nextDouble();
		
		double area3 = numero1.ca(b,a);
		
		System.out.println("O resultado � " + area3);
		
		}else {

	}}}}}

	
