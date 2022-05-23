
public class Pessoa {
	private String nome;
	private int idade;
	private Sexo sexo;
	private Endereco endereço;
	private static int y;


	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}
	public Endereco getEndereço() {
		return endereço;
	}

	public void setEndereço(Endereco endereço){
		this.endereço = endereço;
	}

	@Override
	public String toString() {
		y++;
		return "Esse é o cadastro da pessoa do número: " + y + " nome:"+ nome + " que tem a idade:"+ idade +" do sexo:" + sexo + " que mora na rua:"+ endereço.rua +" no número:"+ endereço.nº +" no bairro:"+ endereço.bairro;	
	}


	

	
	
}
