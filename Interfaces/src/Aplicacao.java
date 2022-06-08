
public class Aplicacao {

	public static void main(String[] args) {
		// Instanciando tres objetos de classes difetentes
		Rota rota = new Rota();
		Ferrari spyder = new Ferrari();
		FiatUno uno = new FiatUno();
		// Usando o metodo da classe rota com os parametros sendo objetos de outras
		// classes
		rota.ir(spyder);
		rota.ir(uno);

		// Instanciando um objeto da classe Ferrari usando uma variavel
		// Automovel(polimorfismo)
		Automovel automovel = new Ferrari();
		// Usando um metodo da classe Rota com o parametro sendo o objeto da classe
		// Ferrari
		rota.ir(automovel);

		// Instanciando um objeto da classe FiatUno usando uma variavel
		// Automovel(polimorfismo)
		automovel = new FiatUno();
		// Usando um metodo da classe Rota com o parametro sendo o objeto da classe
		// FiatUno
		rota.ir(automovel);

		// Instanciando dois objetos de classes diferentes
		Vendedor shrek = new Vendedor();
		Apartamento zonasul = new Apartamento();

		// Usando um metodo da classe Vendedor com os objetos das classes Ferrari e
		// Apartamento como parametros
		shrek.mostrarPreço(zonasul);
		shrek.mostrarPreço(spyder);

	}

}
