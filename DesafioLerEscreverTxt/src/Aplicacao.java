import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Aplicacao {

	public static void main(String[] args) throws IOException {
		// Criacao de um scanner.
		Scanner entrada = new Scanner(System.in);
		// Uso de Scanner para atribuir valores em atributos.
		System.out.println("Escreva um texto");
		Texto escrita = new Texto();
		escrita.setEscrita(entrada.next());
		
	// Try que usado para tentar garantir que nada dara errado e se caso de errado.
	// ele ira voltar o programa como estava antes.
	try(BufferedWriter escrever = new BufferedWriter(new FileWriter("Memes.txt"))){
		// O metodo .write serve para salvar ou sobrescrever o get da classe (nesse caso Texto), no .txt.
		escrever.write(escrita.getEscrita());
	}
	// Try usado para garantir a seguranca.
	try(BufferedReader ler = new BufferedReader(new FileReader("Memes.txt"))){
		// Criacao de variavel do tipo String para ler as linhas do .txt.
		// Criacao de outra variavel String para salvar todas as linhas do .txt em apenas uma String. 
		String linha;
		String texto = "";
		
		while((linha=ler.readLine())!=null) {
			// Salvando as linhas no texto com o \n para pular uma linha.
			texto+=linha+"\n";
			// Imprimir o resultado final de texto.
			System.out.println(texto);
		}
		
	}
	}

}
