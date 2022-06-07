import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) throws IOException {

		// Criacao de duas listas de objetos do tipo Pessoa(listaDePessoas e
		// listaDePessoas2).
		List<Pessoa> listaDePessoas = new ArrayList<Pessoa>();
		List<Pessoa> listaDePessoas2 = new ArrayList<Pessoa>();

		// Criacao de um Scanner.
		Scanner entrada = new Scanner(System.in);

		// Criacao de variaveis.
		Sexo sexo = null;
		int s = 0;

		// For para repetir o cadastro de pessoas 5 vezes.
		for (int x = 0; x < 4; x++) {
			// Criacao do objeto Pessoa e do objeto Endereco que sera um atributo de Pessoa.
			Pessoa pessoa1 = new Pessoa();
			pessoa1.setEndereço(new Endereco());
			// Uso de Scanner para atribuir valores em atributos.
			System.out.println("Digite o nome da pessoa");
			pessoa1.setNome(entrada.next());
			System.out.println("Digite a sua idade");
			pessoa1.setIdade(entrada.next());
			System.out.println("Digite o nome da sua rua");
			pessoa1.getEndereço().setRua(entrada.next());
			System.out.println("Digite o nome do seu bairro");
			pessoa1.getEndereço().setBairro(entrada.next());
			System.out.println("Digite o número da sua casa");
			pessoa1.getEndereço().setNº(entrada.next());
			System.out.println("Selecione o seu sexo");
			System.out.println("1-Masculino");
			System.out.println("2-Feminino");
			s = entrada.nextInt();
			if (s == 1) {
				sexo = Sexo.MASCULINO;
				pessoa1.setSexo(sexo);
			} else if (s == 2) {
				sexo = Sexo.FEMININO;
				pessoa1.setSexo(sexo);
			}
			// Adicionando um objeto a listaDePessoas.
			listaDePessoas.add(pessoa1);

		}
		// Criacao de um enhanced for da listaDePessoas para imprimir a lista na tela.
		for (Pessoa pessoa : listaDePessoas) {
			System.out.println(pessoa);
		}
		// Try que usado para tentar garantir que nada dara errado e se caso de errado
		// ele ira mostrar.
		try (BufferedWriter escrever = new BufferedWriter(new FileWriter("Pessoas.txt"))) {
			// Criacao de uma enhanced for da listaDePessoas para salvarmos os dados em um
			// txt.
			for (Pessoa pessoa : listaDePessoas) {
				// O metodo .write serve para salvar ou sobrescrever o toString da classe (nesse caso Pessoa), no .txt.
				escrever.write(pessoa.toString() + "\n");
			}
		}
		// Try usado para garantir a seguranca
		try (BufferedReader reader = new BufferedReader(new FileReader("Pessoas.txt"))) {
			// Criacao de variavel do tipo String para ler as linhas do .txt
			String line;

			// Usando o laco de repeticao while para ler e transformar as linhas do .txt em
			// objetos e adiciona-los a listaDePessoas2
			while ((line = reader.readLine()) != null) {
				Endereco endereco = new Endereco(line);
				Pessoa pessoa = new Pessoa(line);
				listaDePessoas2.add(pessoa);
			}

		}
		//Enhanced for para mostrar o conteudo da listaDePessoas2
		for (Pessoa pessoa : listaDePessoas2) {
			System.out.println(pessoa.toString());
		}

	}
}
