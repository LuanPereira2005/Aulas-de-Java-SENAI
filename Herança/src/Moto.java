// Criacao de uma sub classe
// Uma sub classe e uma classe que herda os atributos e metodos de uma superclasse
// Nesse caso Moto herda de Veiculo
// O extends na assinatura da classe e o que mostra que ela herda e de quem a sub classe herda
// Sub classes so podem herdar de apenas uma classe
public class Moto extends Veiculo {

	// Metodo especifico da classe Moto que no caso e dar grau(nao pode ser acessado
	// por outras classes, mesmo que elas herdem de Veiculo)
	public void darGrau() {
		System.out.println("RANDANDANDANDAN!");
	}

}
