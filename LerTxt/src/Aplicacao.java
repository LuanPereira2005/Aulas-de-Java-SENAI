import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Aplicacao {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// Try usado para garantir a seguranca.
		try (BufferedReader reader = new BufferedReader(new FileReader("Entrada.txt"))) {
			// Criacao de variavel para receber as linhas do .txt.
			String line;
			// Criacao de variavel para receber e somar a variavel line.
			String string = "";
			// While feito para salvarmos linha por linha do .txt na variavel string para
			// mostrarmos depois com um syso.
			while ((line = reader.readLine()) != null) {
				string += line + "\n";
			}
			System.out.println(string);
		}

		// Instanciando um objeto da classe Sabonete
		Sabonete sabonete1 = new Sabonete("Abacaxi", "Amarelo");
		// Criando um atributo para receber o toString do objeto de Sabonete
		String s = sabonete1.toString();
		// Criando um atributo para receber uma string
		String teste = "Sabonete: cheiro=Abacaxi, cor=Amarelo";
		// Instanciando um objeto da classe Sabonete usando o construtor com parametro
		Sabonete sabonete2 = new Sabonete(teste);
		// Imprimir na tela o objeto recem criado
		System.out.println(sabonete2);

	}
}
