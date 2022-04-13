import java.util.Scanner;

public class VendaTop {

	public static void main(String[] args) {
		
		int prod1;
		int prod2;
		double desc;
		double total;
		int control=0;
		
		Scanner Jailso= new Scanner(System.in);
		
		System.out.println("Escolha o valor do produto que você quer:");
		System.out.println("Camisa:1=350");
		System.out.println("Camiseta:2=300");
		System.out.println("Calças:3=200");
		System.out.println("Sapatos:4=150");
		prod1=Integer.parseInt(Jailso.nextLine());
		System.out.println("Escolha o valor do produto que você quer:");
		System.out.println("Camisa:1=350");
		System.out.println("Camiseta:2=300");
		System.out.println("Calças:3=200");
		System.out.println("Sapatos:4=150");
		prod2=Integer.parseInt(Jailso.nextLine());
	
		if ((prod1==1) && (prod2==1)) {
			System.out.println("O valor do primeiro produto é:"+(350));
			System.out.println("O valor do segundo produto é:"+(350));
			total=350+350;
			System.out.println("O valor total é:"+(total));
			control++;
		}
		if ((prod1==1) && (prod2==2)) {
			System.out.println("O valor do primeiro produto é:"+(350));
			System.out.println("O valor do segundo produto é:"+(300));
			total=350+300;
			System.out.println("O valor total é:"+(total));
			control++;
		}
		if ((prod1==1) && (prod2==3)) {
			System.out.println("O valor do primeiro produto é:"+(350));
			System.out.println("O valor do segundo produto é:"+(200));
			total=350+200;
			desc=200 * 0.15;
			System.out.println("O valor total sem desconto é:"+(total));
			System.out.println("O valor com desconto é:"+(total-desc));
			control++;
		}
		if ((prod1==1) && (prod2==4)) {
			System.out.println("O valor do primeiro produto é:"+(350));
			System.out.println("O valor do segundo produto é:"+(150));
			total=350+150;
			System.out.println("O valor total é:"+(total));
			control++;
		}
		if ((prod1==2) && (prod2==1)) {
			System.out.println("O valor do primeiro produto é:"+(300));
			System.out.println("O valor do segundo produto é:"+(350));
			total=300+350;
			System.out.println("O valor total é:"+(total));
			control++;
		}
		if ((prod1==2) && (prod2==2)) {
			System.out.println("O valor do primeiro produto é:"+(300));
			System.out.println("O valor do segundo produto é:"+(300));
			total=300+300;
			System.out.println("O valor total é:"+(total));
			control++;
		}
		if ((prod1==2) && (prod2==3)) {
			System.out.println("O valor do primeiro produto é:"+(300));
			System.out.println("O valor do segundo produto é:"+(200));
			total=300+200;
			desc=200 * 0.15;
			System.out.println("O valor total sem desconto é:"+(total));
			System.out.println("O valor com desconto é:"+(total-desc));
			control++;
		}
		if ((prod1==2) && (prod2==4)) {
			System.out.println("O valor do primeiro produto é:"+(300));
			System.out.println("O valor do segundo produto é:"+(150));
			total=300+150;
			System.out.println("O valor total é:"+(total));
			control++;
		}
		if ((prod1==3) && (prod2==1)) {
			System.out.println("O valor do primeiro produto é:"+(200));
			System.out.println("O valor do segundo produto é:"+(350));
			total=350+200;
			desc=200 * 0.15;
			System.out.println("O valor total sem desconto é:"+(total));
			System.out.println("O valor com desconto é:"+(total-desc));
			control++;
		}
		if ((prod1==3) && (prod2==2)) {
			System.out.println("O valor do primeiro produto é:"+(200));
			System.out.println("O valor do segundo produto é:"+(300));
			total=300+200;
			desc=200 * 0.15;
			System.out.println("O valor total sem desconto é:"+(total));
			System.out.println("O valor com desconto é:"+(total-desc));
			control++;
		}
		if ((prod1==3) && (prod2==3)) {
			System.out.println("O valor do primeiro produto é:"+(200));
			System.out.println("O valor do segundo produto é:"+(200));
			total=200+200;
			desc=200 * 0.15+200 * 0.15;
			System.out.println("O valor total sem desconto é:"+(total));
			System.out.println("O valor com desconto é:"+(total-desc));
			control++;
		}
		if ((prod1==3) && (prod2==4)) {
			System.out.println("O valor do primeiro produto é:"+(200));
			System.out.println("O valor do segundo produto é:"+(150));
			total=150+200;
			desc=200 * 0.15;
			System.out.println("O valor total sem desconto é:"+(total));
			System.out.println("O valor com desconto é:"+(total-desc));
			control++;
		}
		if ((prod1==4) && (prod2==1)) {
			System.out.println("O valor do primeiro produto é:"+(150));
			System.out.println("O valor do segundo produto é:"+(350));
			total=350+150;
			System.out.println("O valor total é:"+(total));
			control++;
		}
		if ((prod1==4) && (prod2==2)) {
			System.out.println("O valor do primeiro produto é:"+(150));
			System.out.println("O valor do segundo produto é:"+(200));
			total=200+150;
			System.out.println("O valor total é:"+(total));
			control++;
		}
		if ((prod1==4) && (prod2==3)) {
			System.out.println("O valor do primeiro produto é:"+(150));
			System.out.println("O valor do segundo produto é:"+(200));
			total=150+200;
			desc=200 * 0.15;
			System.out.println("O valor total sem desconto é:"+(total));
			System.out.println("O valor com desconto é:"+(total-desc));
			control++;
		}
		if ((prod1==4) && (prod2==4)) {
			System.out.println("O valor do primeiro produto é:"+(150));
			System.out.println("O valor do segundo produto é:"+(150));
			total=150+150;
			System.out.printf("O valor total é: %.3f", total);
			control++;
		}
		if ((prod1>=5) || (prod2>=5)) {
			System.out.println("Nenhum produto encontrado");
		}
	
}
}