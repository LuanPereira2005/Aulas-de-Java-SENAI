import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		List<Pessoa>listaDePessoas=new ArrayList<Pessoa>();
		Scanner entrada = new Scanner(System.in);
		
		Sexo sexo = null;
		int s = 0;
		
		for(int x = 0; x<2 ; x++) {
		Pessoa pessoa1 = new Pessoa();
		pessoa1.setEndereço(new Endereco());
		System.out.println("Digite o nome da pessoa");
		pessoa1.setNome(entrada.next());
		System.out.println("Digite a sua idade");
		pessoa1.setIdade(entrada.nextInt());
		System.out.println("Digite o nome da sua rua");
		pessoa1.getEndereço().setBairro(entrada.next());
		System.out.println("Digite o nome do seu bairro");
		pessoa1.getEndereço().setBairro(entrada.next());
		System.out.println("Digite o número da sua casa");
		pessoa1.getEndereço().setNº(entrada.nextInt());
		System.out.println("Selecione o seu sexo");
		System.out.println("1-Masculino");
		System.out.println("2-Feminino");
		s=entrada.nextInt();
			if(s==1) {
				sexo = Sexo.MASCULINO;
				pessoa1.setSexo(sexo);
			}else if (s==2) {
				sexo = Sexo.FEMININO;
				pessoa1.setSexo(sexo);
			}

	
		listaDePessoas.add(pessoa1);
		
		}	
		for(Pessoa pessoa: listaDePessoas) {
			System.out.println(pessoa);
			}
	}

}
