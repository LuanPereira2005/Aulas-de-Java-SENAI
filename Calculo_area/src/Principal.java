import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Numeros numero1 = new Numeros();
		
		System.out.println("Você quer calcular a área de:");
		System.out.println("1-Quadrado");
		System.out.println("2-Retângulo");
		System.out.println("3-Triângulo");
		
		Scanner entrada = new Scanner(System.in);
		
		int menu = entrada.nextInt();
		
		if(menu==1) {
		
		Scanner l = new Scanner(System.in);

		System.out.println("Digite um dos lados do quadrado");
		
		double L = l.nextDouble();
		
		double area = numero1.ca(L);
		
		System.out.println("O resultado é " + area);
		
		}else {
		
		if(menu==2) {

		System.out.println("Digite a altura do retângulo");
		
		Scanner ab = new Scanner(System.in);
		
		int A = ab.nextInt();

		System.out.println("Digite a base do retângulo");

		int B = ab.nextInt();

		int area2 = numero1.ca(A,B);
		
		System.out.println("O resultado é " + area2);
		
		}else {
		
		if(menu==3) {

		Scanner ba = new Scanner(System.in);

		System.out.println("Digite a base do triângulo");
		
		double b = ba.nextDouble();
		
		System.out.println("Digite a base do triângulo");
		
		double a = ba.nextDouble();
		
		double area3 = numero1.ca(b,a);
		
		System.out.println("O resultado é " + area3);
		
		}else {

	}}}}}

	
