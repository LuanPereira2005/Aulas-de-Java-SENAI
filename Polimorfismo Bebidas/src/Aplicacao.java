
public class Aplicacao {

	public static void main(String[] args) {
		// Instanciando objetos de classes diferentes
		Preparador joaogrilo = new Preparador();
		
		LeiteQuente leite = new LeiteQuente();
		
		// Usando o metodo do objeto joaogrilo
		joaogrilo.prepararBebida(leite);
		
		// Instanciando um objeto da classe Refrigerante
		Refrigerante fanta = new Refrigerante();
		
		// Usando o metodo do objeto joaogrilo
		joaogrilo.prepararBebida(fanta);

	}

}
