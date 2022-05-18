
public class Pessoa {
	String nome;
	int idade;
	Endereco endereço;
	
	public Pessoa(String nome, int idade,Endereco endereço) {
		this.nome = nome;
		this.idade = idade;
		this.endereço = endereço;
	}

	@Override
	public String toString() {
		return "Esse é o cadastro da pessoa de nome:"+nome+ " que tem a idade:"+idade+" que mora na rua:"+endereço.rua+" no número:"+endereço.nº+" no bairro:"+endereço.bairro;
	}
	
	
}
