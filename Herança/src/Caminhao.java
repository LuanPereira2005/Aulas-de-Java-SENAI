// Criacao de uma sub classe
// Nesse caso Caminhao herda de Veiculo
public class Caminhao extends Veiculo {

	// Sobreposicao do metodo buzinar da classe Veiculo
	@Override
	public void buzinar() {
		System.out.println("FOM, FOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOM!");
	}

}
