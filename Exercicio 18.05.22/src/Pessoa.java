
public class Pessoa {
	private String nome;
	private int idade;
	private Sexo sexo;
	private Endereco endere�o;
	
	
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

		Endereco endere�o1 = new Endereco(texto);
		this.endere�o = endere�o1;
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
	public Endereco getEndere�o() {
		return endere�o;
	}

	public void setEndere�o(Endereco endere�o){
		this.endere�o = endere�o;
	}
	
	@Override
	public String toString() {
		return "Esse � o cadastro da pessoa de nome: "+ nome + ", que tem a idade: "+ idade +",do sexo:" + sexo + endere�o.toString();
	}

	


	

	
	
}
