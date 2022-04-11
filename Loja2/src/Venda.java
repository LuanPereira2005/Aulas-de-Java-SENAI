import java.util.Scanner;
public class Venda {

	public static void main(String[] args) {
		
		double total;
		double totaldesc;
		
		System.out.println("Informe o valor do produto 1");
		Scanner in= new Scanner(System.in);
		double prod1 = in.nextDouble();
		
		System.out.println("Informe o valor do produto 2");
		double prod2 = in.nextDouble();
	
		total=prod1+prod2;
		System.out.println("O valor total sem desconto:"+total);
		
		System.out.println("Informe o desconto");
		double desc = in.nextDouble();
	
		
		totaldesc=total-total*desc/100;
		
		System.out.println("O desconto é:"+desc);
		System.out.println("O valor total com desconto:"+totaldesc);
		
		
		

	}

}
