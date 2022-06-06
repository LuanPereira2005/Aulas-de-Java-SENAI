
public class Pessoa {
	private String nome;
	private int idade;
	private Sexo sexo;
	private Endereco endereço;
	
	
	public Pessoa() {
	}
	public Pessoa(String texto) {
		String[] arrayAuxiliar1 = texto.split(",");
		String[] arrayAuxiliar2 = arrayAuxiliar1[0].split(":");
		this.nome = arrayAuxiliar2[1].trim();
		
		String[] arrayAuxiliar3 = arrayAuxiliar1[1].split(":");
		this.idade = Integer.parseInt(arrayAuxiliar3[1].trim());
		
		String[] arrayAuxiliar4 = arrayAuxiliar1[2].split(":");
		this.sexo = Sexo.valueOf(arrayAuxiliar4[1].trim());
		
//		if("FEMININO".equals(arrayAuxiliar4[1].trim()) ) {
//			this.sexo = Sexo.FEMININO;
//		}
//		else if("MASCULINO".equals(arrayAuxiliar4[1].trim()) ){
//			this.sexo = Sexo.MASCULINO;
//		}else {
//		}

		Endereco endereço1 = new Endereco(texto);
		this.endereço = endereço1;
	}


	
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
		return "Esse é o cadastro da pessoa de nome: "+ nome + ", que tem a idade: "+ idade +",do sexo:" + sexo + endereço.toString();
	}

	


	

	
	
}
