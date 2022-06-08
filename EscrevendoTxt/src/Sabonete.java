// Criacao de uma classe.
public class Sabonete {
	// Criacao de atributos.
	private static int x=0;
	private String cheiro;
	private String cor;
	
	// Construtores de sabonete.
	public Sabonete() {
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
		x++;
		return "Sabonete do indice "+x+ " tem o atributo cheiro=" + cheiro + " e o atributo cor=" + cor+ "\n";
	}

	
	
}
