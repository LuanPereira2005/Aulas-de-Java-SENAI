
public class Endereco {
	 String rua;
	 String nº;
	 String bairro;
	 
	

	public Endereco() {
		
	}
	public Endereco(String texto) {
		String[] arrayAuxiliar1 = texto.split(",");
		String[] arrayAuxiliar2 = arrayAuxiliar1[3].split(":");
		this.rua = arrayAuxiliar2[1].trim();
		
		String[] arrayAuxiliar3 = arrayAuxiliar1[4].split(":");
		this.nº = arrayAuxiliar3[1].trim();
		
		String[] arrayAuxiliar4 = arrayAuxiliar1[5].split(":");
		this.bairro = arrayAuxiliar4[1].trim();
		
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public void setNº(String nº) {
		this.nº = nº;
	}
	
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	
	@Override
	public String toString() {
		return ",que mora na rua:" + rua + ",no número:" + nº + ",no bairro:"+ bairro;
	}
	
	
}
