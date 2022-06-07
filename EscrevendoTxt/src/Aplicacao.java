import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Aplicacao {

	public static void main(String[] args) throws IOException {
		// Criacao de um scanner.
		Scanner entrada = new Scanner(System.in);
		
		// Criacao de uma ArrayList.
		List<Sabonete>listaDeSabonetes=new ArrayList<Sabonete>();
		
		for(int x = 0; x<3; x++) {
			Sabonete sabonete = new Sabonete();
			System.out.println("Escolha a cor do seu sabonete");
			sabonete.setCor(entrada.next());
			System.out.println("Escolha o cheiro do seu sabonete");
			sabonete.setCheiro(entrada.next());
			listaDeSabonetes.add(sabonete);
			
			}
		try(BufferedWriter escrever = new BufferedWriter(new FileWriter("Saída.txt"))){
			for(Sabonete sabonete:listaDeSabonetes) {
				escrever.write(sabonete.toString());
			}
		}
		;
	}
}

