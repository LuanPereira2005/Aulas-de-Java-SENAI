import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Aplicacao {

	public static void main(String[] args) throws IOException {
		String s = "Salvando arquivo";
		
		try(BufferedWriter escrever = new BufferedWriter(new FileWriter("Sa�da.txt"))){
			escrever.write(s);	
		}
		
	

	}

}
