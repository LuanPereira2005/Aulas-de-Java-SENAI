// Criando uma subclasse que extende de Animal
public class Cachorro extends Animal {
	
	// Sobrepondo o metodo falar da superclasse
	@Override
	public void falar() {
		System.out.println("Au-Au!");
	}
	// Metodo especifico da sub classe
	public void morder() {
		System.out.println("Nhac!");
	}

}
