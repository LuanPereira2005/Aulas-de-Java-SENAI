
public class Pessoa {
	private String nome;
	private int idade;
	private Sexo sexo;
	private Endereco endere�o;
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
	public Endereco getEndere�o() {
		return endere�o;
	}

	public void setEndere�o(Endereco endere�o){
		this.endere�o = endere�o;
	}

	@Override
	public String toString() {
		y++;
		return "Esse � o cadastro da pessoa do n�mero: " + y + " nome:"+ nome + " que tem a idade:"+ idade +" do sexo:" + sexo + " que mora na rua:"+ endere�o.rua +" no n�mero:"+ endere�o.n� +" no bairro:"+ endere�o.bairro;	
	}


	

	
	
}