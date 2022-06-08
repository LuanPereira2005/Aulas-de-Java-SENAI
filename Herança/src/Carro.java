// Criacao de uma sub classe
// Nesse caso Carro herda de Veiculo
public class Carro extends Veiculo {

	// Criacao de atributo
	private boolean quatroPortas;

	// Sobreposicao do metodo imprimir da superclasse
	@Override
	public void imprimir() {
		super.imprimir();
		System.out.println("Tem quatro portas? " + quatroPortas);
	}

	// Teste condicional de um teste logico que no caso e o is
	// Ele retorna true(verdadeiro) ou falso(false)
	// Nesse caso se o atributo quatroPortas for true(verdadeiro) ele retorna true,
	// caso contrario, o retorno sera false
	public boolean isQuatroPortas() {
		return quatroPortas;
	}
	// Set de QuatroPortas
	public void setQuatroPortas(boolean quatroPortas) {
		this.quatroPortas = quatroPortas;
	}

}
