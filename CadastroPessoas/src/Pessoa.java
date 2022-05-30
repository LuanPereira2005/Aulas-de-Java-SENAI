
public class Pessoa {
	private String nome;
	private String idade;
	private Sexo sexo;
	private Endereco endereco;

	
	public Pessoa() {	
	}
	public Pessoa(String texto) {
		String[] arrayAuxiliar1 = texto.split(",");
		String[] arrayAuxiliar2 = arrayAuxiliar1[0].split(":");
		this.nome = arrayAuxiliar2[1].trim();
		
		String[] arrayAuxiliar3 = arrayAuxiliar1[1].split(":");
		this.idade = arrayAuxiliar3[1].trim();
		
		String[] arrayAuxiliar4 = arrayAuxiliar1[1].split(":");
		if(arrayAuxiliar4[1]=="MASCULINO") {
			this.sexo = Sexo.MASCULINO;
		}
		else {
			this.sexo = Sexo.FEMININO;
		}
	}
		

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}
	public Endereco getEndere�o() {
		return endereco;
	}

	public void setEndere�o(Endereco endere�o){
		this.endereco = endere�o;
	}

	@Override
	public String toString() {
		return "Esse � o cadastro da pessoa do nome:"+ nome + ", e que tem a idade:"+ idade +", que � do sexo:" + sexo + endereco;
	}
	
	
}
