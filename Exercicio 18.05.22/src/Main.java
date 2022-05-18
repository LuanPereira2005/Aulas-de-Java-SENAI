import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		List<Pessoa>listaDePessoas=new ArrayList<Pessoa>();
		Scanner entrada = new Scanner(System.in);
		
		String nome="";
		int idade=0;
		String rua="";
		String bairro="";
		int nº=0;
		
		for(int x = 0; x<5 ; x++) {
		System.out.println("Digite o nome da pessoa");
		nome=entrada.next();
		System.out.println("Digite a sua idade");
		idade=entrada.nextInt();
		System.out.println("Digite o nome da sua rua");
		rua=entrada.next();
		System.out.println("Digite o nome do seu bairro");
		bairro=entrada.next();
		System.out.println("Digite o número da sua casa");
		nº=entrada.nextInt();
		
		Endereco endereço1 = new Endereco(rua,nº,bairro);
		Pessoa pessoa1 = new Pessoa(nome,idade,endereço1);
		
		listaDePessoas.add(pessoa1);
		}
		for(Pessoa pessoa: listaDePessoas) {
			System.out.println(pessoa);
		}
	}

}
