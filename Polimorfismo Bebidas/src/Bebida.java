// Criacao da superclasse
public class Bebida {
	// Criacao de atributos
	private String nome;
	private boolean aquecer;

	// Construtor da classe Bebida
	public Bebida(String nome, boolean aquecer) {
		super();
		this.nome = nome;
		this.aquecer = aquecer;
	}

	// Metodo da classe
	public void preparar() {
		System.out.println("Pegando copo");
		System.out.println("Colocando " + nome + " no copo");
	}

	// Gets e sets
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	// teste condicional de atributo boolean com retorno boolean
	public boolean isAquecer() {
		return aquecer;
	}

	public void setAquecer(boolean aquecer) {
		this.aquecer = aquecer;
	}

}
