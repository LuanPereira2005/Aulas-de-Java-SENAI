import java.util.Scanner;
public class Venda {

	public static void main(String[] args) {
		// Criacao de variaveis
		double total;
		double totaldesc;
		
		// Instancia e uso de um scanner para atribuir valores a variaveis
		System.out.println("Informe o valor do produto 1");
		Scanner in= new Scanner(System.in);
		double prod1 = in.nextDouble();
		
		System.out.println("Informe o valor do produto 2");
		double prod2 = in.nextDouble();
	
		// Operacao matematica basica
		total=prod1+prod2;
		// Imprimir na tela o resultado da operacao
		System.out.println("O valor total sem desconto:"+total);
		
		//uso do scanner para atribuir valor a variavel
		System.out.println("Informe o desconto");
		double desc = in.nextDouble();
	
		// Operacao matematica
		totaldesc=total-total*desc/100;
		
		// Imprimir na tela o valor do atributo e o resultado da operacao
		System.out.println("O desconto é:"+desc);
		System.out.println("O valor total com desconto:"+totaldesc);
		
		
		

	}

}
