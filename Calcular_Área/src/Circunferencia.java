// Criacao de uma classe que implementa da interface AreaCalculavel.
// Como na interface o metodo .calcularArea nao foi implementado(e nem poderia)
// fica a cargo da classe implementar esse metodo.
public class Circunferencia implements AreaCalculavel {

	@Override
	public double calcularArea(double x, double y) {
		return Math.pow(x,2) * Math.PI;
	}


}
