// Criacao de uma classe que implementa de duas interfaces
// Diferente das superclasses e subclasses
// uma classe implementa e nao extende de uma interface, alem de poder implementar de varias interfaces enquanto extender poderia ser uma vez so
public class Ferrari implements Automovel, ItemCaro {

	// Sobreposicao e implementacao dos metodos da interface principal que e
	// Automovel e a sub interface que e Carro
	@Override
	public void virarEsquerda() {
		System.out.println("A duzentos metros vire à esquerda");

	}

	@Override
	public void virarDireita() {
		System.out.println("A duzentos metros vire à direita");

	}

	@Override
	public void acelerar() {
		System.out.println("Ferrari acelerou e passou 250 km/h");

	}

	@Override
	public String getPreco() {

		return "$5000000";
	}

}
