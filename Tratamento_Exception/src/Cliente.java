import java.util.Objects;

// Criacao de uma classe
public class Cliente {

	// Criacao de atributos
	// O modificador acesso e o que vem antes dos atributos e metodos
	// Atributos e metodos publicos sao visiveis por qualquer outra classe
	// Atributos e metodos privados nao sao visiveis a nenhuma classe, a nao ser a
	// propria classe
	// Atributos e metodos protected nao sao visiveis a qualquer classe porem se a
	// classe herda de uma superclasse, ela consegue ver os atributos protected
	// dessa superclasse
	// Sao consideradas boas praticas de programacao deixar os atributos private, e
	// deixar os metodos public  e usar os gets e sets para ver e mudar esses atributos
	private String nome;
	private int cpf;
	private ContaBancaria conta;
	
	// Construtor de Cliente
	public Cliente(ContaBancaria contabancaria) {
		this.conta = contabancaria;

	}

	// Gets e Sets
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	public ContaBancaria getConta() {
		return conta;
	}

	public void setConta(ContaBancaria conta) {
		this.conta = conta;
	}

	// Sobreposicao do toString
	@Override
	public String toString() {
		return "Cliente: \nnome=" + nome + " \ncpf=" + cpf;
	}

	// Sobreposicao do hashCode
	@Override
	public int hashCode() {
		return Objects.hash(cpf, nome);
	}

	@Override
	// Sobreposicao do equals que e o metodo usado para comparacao dos objetos
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		return cpf == other.cpf && Objects.equals(nome, other.nome);
	}

}
