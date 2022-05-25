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

	public static void main(String[] args) throws IOException,FileNotFoundException{
		
		Scanner entrada = new Scanner(System.in);
		
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
		try (BufferedReader reader = new BufferedReader(new FileReader("Saída.txt"))) {
			String line;
			String string = "";
			
			List<Sabonete>listaDeSabonetes2 = new ArrayList<Sabonete>();
			
			while((line = reader.readLine())!=null) {
				string+=line + "\n";
				Sabonete sabonete = new Sabonete(line);
				listaDeSabonetes2.add(sabonete);
			}
	
		}
		}
		
}



