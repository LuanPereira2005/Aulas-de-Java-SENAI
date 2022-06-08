
public class main {

	public static void main(String[] args) {
		
		// Instanciando um objeto da classe Lampada
		Lampada lampada1 = new Lampada(true);
		
		// Imprimindo na tela os retornos dos 3 metodos da classe Lampada
		System.out.println(lampada1.imprimir());
		
		System.out.println(lampada1.desligar());
		
		System.out.println(lampada1.ligar());
		
		
	}

}
