
public class Sabonete {
	private static int x=0;
	private String cheiro;
	private String cor;
	
	public Sabonete() {
	}
	public Sabonete(String cheiro, String cor) {
	}
	public Sabonete(String texto) {
		String[] arrayAuxiliar1 = texto.split(",");
		String[] arrayAuxiliar2 = arrayAuxiliar1[0].split("=");
		this.cheiro = arrayAuxiliar2[1].trim();
		
		String[] arrayAuxiliar3 = arrayAuxiliar1[1].split("=");
		this.cor = arrayAuxiliar3[1].trim();
		}

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
	@Override
	public String toString() {
		x++;
		return "Sabonete do indice "+x+ " tem o atributo cheiro=" + cheiro + " e o atributo cor=" + cor+ "\n";
	}

	
	
}
