// Criacao de uma classe
public class Lampada {

	// Criacao de atributo
	private boolean ligada;

	// Construtor que recebe um boolean
	Lampada(boolean ligada) {

		this.ligada = ligada;
	}

	// Metodo que retorna uma String dependendo do resultado do teste condicional if
	public String imprimir() {

		if (ligada == true)

			return "A lampada est� ligada";

		else

			return "A lampada est� desligada";
	}

	// Metodos que mudam o atributo boolean da classe e retornam uma String
	public String ligar() {

		this.ligada = true;

		return "A lampada est� ligada";
	}
	
	public String desligar() {

		this.ligada = false;

		return "A lampada est� desligada";
	}

}
