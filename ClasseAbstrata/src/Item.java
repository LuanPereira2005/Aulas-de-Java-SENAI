
public abstract class Item {
	
	//Atributos da classe abstrata Item
	private int posX;
	private int posY;
	
	//Cria��o do met�do abstrato pegar, toda a classe que extender da classe Item precisa subescrever o c�digo 
	public abstract void pegar();

	//Getters e setters dos atributos da classe abstrata Item
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
