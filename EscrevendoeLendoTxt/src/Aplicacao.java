import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Aplicacao {

	public static void main(String[] args) throws IOException, FileNotFoundException {
		// Criacao de um scanner.
		Scanner entrada = new Scanner(System.in);

		// Criacao de duas ArrayLists.
		// A ArrayList e usada para armazenar objetos e outros tipos de dados.
		List<Sabonete> listaDeSabonetes = new ArrayList<Sabonete>();
		List<Sabonete> listaDeSabonetes2 = new ArrayList<>();

		// For para repetir o cadastro de sabonetes 3 vezes.
		for (int x = 0; x < 3; x++) {
			Sabonete sabonete = new Sabonete();
			System.out.println("Escolha a cor do seu sabonete");
			sabonete.setCor(entrada.next());
			System.out.println("Escolha o cheiro do seu sabonete");
			sabonete.setCheiro(entrada.next());
			listaDeSabonetes.add(sabonete);

		}
		// Try usado para garantir a seguranca.
		try (BufferedWriter escrever = new BufferedWriter(new FileWriter("Saída.txt"))) {
			// Enhanced for usado para salvar todos os item da lista no .txt.
			for (Sabonete sabonete : listaDeSabonetes) {
				escrever.write(sabonete.toString() + "\n");
			}
		}
		// Try usado para garantir a seguranca.
		try (BufferedReader reader = new BufferedReader(new FileReader("Saída.txt"))) {
			// Criacao de variavel para receber as linhas do .txt.
			String line;
			
			// While feito para salvarmos linha por linha do .txt em objetos.
			while ((line = reader.readLine()) != null) {
				Sabonete sabonete = new Sabonete(line);
				listaDeSabonetes2.add(sabonete);
			}

		}
		//For usado para mostrar todos os itens da lista apos a leitura do txt e o seu salvamento em uma lista.
		for (Sabonete sabonete : listaDeSabonetes2) {
			System.out.println(sabonete.toString());
		}
	}
}
