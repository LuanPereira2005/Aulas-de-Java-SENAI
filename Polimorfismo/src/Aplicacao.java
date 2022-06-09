
public class Aplicacao {

	public static void main(String[] args) {

		// Polimorfismo e fazer o mesmo metodo so que de formas diferentes
		// Instanciando um objeto da classe Cachorro mas usando uma variavel do tipo
		// Animal
//		Animal animal = new Cachorro();
		// Fazendo isso e possivel acessa o metodo que tem na superclasse mas o metodo
		// especifico da sub classe nao e possivel acessar e executar
//		
//		animal.falar();
//		
		// Instanciando um objeto da classe Gato mas usando uma variavel do tipo
		// Animal
//		animal = new Gato();
		// Fazendo isso e possivel acessa o metodo que tem na superclasse mas o metodo
		// especifico da sub classe nao e possivel acessar e executar
//		
//		animal.falar();
//		
		// Instanciando dois objetos de duas classes diferentes
//		Cachorro caramelo = new Cachorro();
//		Gato anubis = new Gato();
//		
		// Usando os metodos dos objetos
//		caramelo.falar();
//		caramelo.morder();
//		
//		anubis.falar();

		// Instanciando dois objetos de duas classes diferentes
		Gato gato = new Gato();
		Cachorro cachorro = new Cachorro();

		// Usando o metodo da superclasse dando como "parametro" o objeto especifico
		// para fazer com que fale a frase especifica do animal
		falar(cachorro);
		falar(gato);

	}
		// Criando metodo na classe main
	public static void falar(Animal a) {
		a.falar();

		if (a instanceof Cachorro) {
			Cachorro c = (Cachorro) a;
			c.morder();
		}

	}

}
