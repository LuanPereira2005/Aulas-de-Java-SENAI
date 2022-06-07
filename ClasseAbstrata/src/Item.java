// Criacao de uma classe abstrata.
// Uma classe abstrata e uma classe muito generica, tipo a Item, um Item pode ser muita coisa,
// mas que todas as classes que herdam tem algo em comum
public abstract class Item {

	// Atributos da classe abstrata Item
	private int posX;
	private int posY;

	// Criação do metódo abstrato pegar, toda a classe que extender da classe Item
	// precisa subescrever o código
	public abstract void pegar();

	// Getters e setters dos atributos da classe abstrata Item
	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public int getPosY() {
		return posY;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}

}
