import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Aplicacao {

	public static void main(String[] args) throws IOException {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Escreva um texto");
		Texto escrita = new Texto();
		escrita.setEscrita(entrada.next());
	try(BufferedWriter escrever = new BufferedWriter(new FileWriter("Memes.txt"))){
		escrever.write(escrita.getEscrita());
	}
	try(BufferedReader ler = new BufferedReader(new FileReader("Memes.txt"))){
		String linha;
		String texto = "";
		
		while((linha=ler.readLine())!=null) {
			texto+=linha+"\n";
			System.out.println(texto);
		}
		
	}
	}

}
