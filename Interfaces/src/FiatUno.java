// Criacao de uma classe que implementa de uma interface
public class FiatUno implements Automovel{
	
	// Sobreposicao e implementacao dos metodos da interface
	@Override
	public void virarEsquerda() {
		System.out.println("A duzentos metros vire � esquerda");
		
	}

	@Override
	public void virarDireita() {
		System.out.println("A duzentos metros vire � direita");
		
	}

	@Override
	public void acelerar() {
		System.out.println("Fiat Uno com escada e adesivo de firma acelerou infinitamente e atravessou o espa�o-tempo");
		
	}
	

}
