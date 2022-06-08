//Criacao de uma classe
public class Conta {
	// Criacao de atributos
	String nome;
	double valor;
	
	// Construtor da classe Conta
	public Conta(String nome, double valor) {
		this.nome = nome;
		this.valor = valor;
	}
	// Sobreposicao do metodo toString
	@Override
	public String toString() {
		return "Conta [nome=" + nome + ", valor=" + valor + "]";
	}
	
	

	
	
	
}
