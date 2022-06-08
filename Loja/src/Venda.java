public class Venda {

	public static void main(String[] args) {
		
		// Criacao de variaveis
		double prod1=75;
		double prod2=25;
		double total;
		double desc=15;
		double totaldesc;
		
		// Operacao matematica basica
		total=prod1+prod2;
		
		// Imprimir na tela os valores dos atributos e o resultado da operacao
		System.out.println("O valor do produto 1 é:"+prod1);
		System.out.println("O valor do produto 2 é:"+prod2);
		System.out.println("O valor total sem desconto:"+total);
		
		// Operacao matematica basica
		totaldesc=total-total*desc/100;
		
		// Imprimir na tela os valores dos atributos e o resultado da operacao
		System.out.println("O desconto é:"+desc);
		System.out.println("O valor total com desconto:"+totaldesc);
		
		
		

	}

}
