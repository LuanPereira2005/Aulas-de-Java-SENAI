
public class Aplicacao {

	public static void main(String[] args) {

		Rota rota = new Rota();
		Ferrari spyder = new Ferrari();
//		FiatUno uno = new FiatUno();
		
//		rota.ir(spyder);
//		rota.ir(uno);
	
//		Automovel automovel = new Ferrari();
//		rota.ir(automovel);
		
//		automovel = new FiatUno();
//		rota.ir(automovel);
	
		Vendedor shrek = new Vendedor();
		Apartamento zonasul = new Apartamento();
		
		shrek.mostrarPreço(zonasul);
		shrek.mostrarPreço(spyder);
		
		
	}

}
