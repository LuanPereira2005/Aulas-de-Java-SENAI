
public class Pessoa {
	String nome;
	int idade;
	Endereco endere�o;
	
	public Pessoa(String nome, int idade,Endereco endere�o) {
		this.nome = nome;
		this.idade = idade;
		this.endere�o = endere�o;
	}

	@Override
	public String toString() {
		return "Esse � o cadastro da pessoa de nome:"+nome+ " que tem a idade:"+idade+" que mora na rua:"+endere�o.rua+" no n�mero:"+endere�o.n�+" no bairro:"+endere�o.bairro;
	}
	
	
}
