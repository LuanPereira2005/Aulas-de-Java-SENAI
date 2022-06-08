// Criacao da superclasse Veiculo
// Uma superclasse e como uma classe pai em que todas as classes que extenderem dela herdaram seus atributos e metodos
public class Veiculo {

	// Criacao de atributos
	protected String marca;
	protected String modelo;
	protected int ano;

	// Metodo para imprimir na tela o som da buzina de um veiculo
	public void buzinar() {
		System.out.println("Bi,Bi!");
	}
	// Metodo para imprimir na tela as informacoes de um veiculo
	public void imprimir() {
		System.out.println("Marca:" + marca);
		System.out.println("Modelo:" + modelo);
		System.out.println("Ano:" + ano);
	}
	//Gets e sets dos atributos
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

}
