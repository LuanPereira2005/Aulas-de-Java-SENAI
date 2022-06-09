
public class Aplicacao {

	public static void main(String[] args) {

		// Instaciando um objeto da classe Data
		Data d1 = new Data(10, 03, 2000, 0, 30, 10);
		// Uso do metodo imprimir
		d1.imprimir(Data.FORMATO_12H);
		d1.imprimir(Data.FORMATO_24H);

		// Instaciando um objeto da classe Data
		Data d2 = new Data(15, 06, 2000, 23, 15, 20);
		// Uso do metodo imprimir
		d2.imprimir(Data.FORMATO_12H);
		d2.imprimir(Data.FORMATO_24H);

		// Instaciando um objeto da classe Data
		Data d3 = new Data(5, 10, 2005);
		// Uso do metodo imprimir
		d3.imprimir(Data.FORMATO_12H);
		d3.imprimir(Data.FORMATO_24H);
	}
}
