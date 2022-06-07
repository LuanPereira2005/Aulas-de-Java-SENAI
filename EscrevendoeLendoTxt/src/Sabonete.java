// Criacao de uma classe.
public class Sabonete {
	// Criacao de atributos.
	private String cheiro;
	private String cor;
	
	
	// Construtores de sabonete.
	public Sabonete() {
	}
	public Sabonete(String cheiro, String cor) {
	}
	public Sabonete(String texto) {
		// Criacao de um Array pra separar o texto bruto.
		// O split separa uma String de acordo com um caractere especifico
		String[] arrayAuxiliar1 = texto.split(",");
		// Criacao de um Array e a atribuicao de uma das separacoes do split.
		String[] arrayAuxiliar2 = arrayAuxiliar1[0].split("=");
		this.cheiro = arrayAuxiliar2[1].trim();
		// Criacao de um Array e a atribuicao de uma das separacoes do split.
		String[] arrayAuxiliar3 = arrayAuxiliar1[1].split("=");
		this.cor = arrayAuxiliar3[1].trim();
		
	
		}
	// Gets and Sets.
	public String getCheiro() {
		return cheiro;
	}
	public void setCheiro(String cheiro) {
		this.cheiro = cheiro;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	// Sobreposicao do metodo toString().
	@Override
	public String toString() {
		;
		return "Sabonete tem o atributo cheiro=" + cheiro + ", e o atributo cor=" + cor;
	}

	
	
}
