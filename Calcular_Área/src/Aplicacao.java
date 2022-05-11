
public class Aplicacao {

	public static void main(String[] args) {
		
		Quadrado quadrado = new Quadrado();
		Circunferencia circulo = new Circunferencia();
		Retangulo retangulo = new Retangulo();
		
		System.out.println(quadrado.calcularArea(20, 20));
		System.out.println(circulo.calcularArea(20, 20));
		System.out.println(retangulo.calcularArea(20, 50));

	}

}
