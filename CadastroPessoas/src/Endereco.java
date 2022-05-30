
public class Endereco {
	 String rua;
	 String nº;
	 String bairro;
	
	 
	public Endereco() {
		
	}
	public Endereco(String texto) {
		String[] arrayAuxiliar1 = texto.split(",");
		String[] arrayAuxiliar2 = arrayAuxiliar1[0].split(":");
		this.rua = arrayAuxiliar2[1].trim();
		
		String[] arrayAuxiliar3 = arrayAuxiliar1[1].split(":");
		this.nº = arrayAuxiliar3[1].trim();
		
		String[] arrayAuxiliar4 = arrayAuxiliar1[1].split(":");
		this.bairro = arrayAuxiliar4[1].trim();
	}
	public String setRua(String rua) {
		this.rua = rua;
		return rua;
	}
	public String setNº(String nº) {
		this.nº = nº;
		return nº;
	}
	public String setBairro(String bairro) {
		this.bairro = bairro;
		return bairro;
	}
	@Override
	public String toString() {
		return "que mora na rua:"+rua+", que tem de numero da casa:"+nº+",que mora no bairro:"+bairro;
	}
	
}
