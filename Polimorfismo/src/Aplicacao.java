
public class Aplicacao {

	public static void main(String[] args) {

//		Animal animal = new Cachorro();
//		
//		animal.falar();
//		
//		animal = new Gato();
//		
//		animal.falar();

//		Cachorro caramelo = new Cachorro();
//		Gato anubis = new Gato();
//		
//		caramelo.falar();
//		caramelo.morder();
//		
//		anubis.falar();

		Gato gato = new Gato();
		Cachorro cachorro = new Cachorro();
		
		falar(cachorro);
		falar(gato);
		
	}

	public static void falar(Animal a) {
		a.falar();

		if (a instanceof Cachorro) {
			Cachorro c = (Cachorro)a;
			c.morder();
		}

	}

}
