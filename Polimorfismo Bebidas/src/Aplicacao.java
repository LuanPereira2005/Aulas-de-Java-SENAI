
public class Aplicacao {

	public static void main(String[] args) {
		
		Preparador joaogrilo = new Preparador();
		
		LeiteQuente leite = new LeiteQuente();
		
		joaogrilo.prepararBebida(leite);
		
		Refrigerante fanta = new Refrigerante();
		
		joaogrilo.prepararBebida(fanta);

	}

}
