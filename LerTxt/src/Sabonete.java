// Criacao de uma classe.
public class Sabonete {
	// Criacao de atributos.
	private String cheiro;
	private String cor;
	
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
		return "Sabonete: cheiro="+cheiro+", cor="+cor+"\n";
	}
	// Construtor usado para tratar as Strings recebidas do .txt
	public Sabonete(String texto) {
		String[] arrayAuxiliar1 = texto.split(",");
		String[] arrayAuxiliar2 = arrayAuxiliar1[0].split("=");
		this.cheiro = arrayAuxiliar2[1].trim();
		
		String[] arrayAuxiliar3 = arrayAuxiliar1[1].split("=");
		this.cor = arrayAuxiliar3[1].trim();
		}
	// Construtor de Sabonete
	public Sabonete(String cheiro, String cor) {
		this.cheiro = cheiro;
		this.cor = cor;
	}
	
	
	
}
