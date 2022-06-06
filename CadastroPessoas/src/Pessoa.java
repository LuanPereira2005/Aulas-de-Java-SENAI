
public class Pessoa {
	// Criando os atributos de Endereco
	private String nome;
	private String idade;
	private Sexo sexo;
	private Endereco endereco;

	// Construtor de Pessoa vazio
	public Pessoa() {
	}
	// Construtor de Pessoa que usa um parametro do tipo String.
	// Esse construtor faz o tratamento do parametro do tipo String.
	public Pessoa(String texto) {
		String[] arrayAuxiliar1 = texto.split(",");
		String[] arrayAuxiliar2 = arrayAuxiliar1[0].split(":");
		this.nome = arrayAuxiliar2[1].trim();

		String[] arrayAuxiliar3 = arrayAuxiliar1[1].split(":");
		this.idade = arrayAuxiliar3[1].trim();

		String[] arrayAuxiliar4 = arrayAuxiliar1[1].split(":");
		if (arrayAuxiliar4[1] == "MASCULINO") {
			this.sexo = Sexo.MASCULINO;
		} else {
			this.sexo = Sexo.FEMININO;
		}
	}
	//Getters and Setters
	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

	public Endereco getEndereço() {
		return endereco;
	}

	public void setEndereço(Endereco endereço) {
		this.endereco = endereço;
	}

	@Override
	//Sobreposicao do metodo toString da classe Object.
	public String toString() {
		return "Esse é o cadastro da pessoa do nome:" + nome + ", e que tem a idade:" + idade + ", que é do sexo:"
				+ sexo + endereco;
	}

}
