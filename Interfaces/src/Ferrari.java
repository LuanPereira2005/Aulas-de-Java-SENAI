
public class Ferrari implements Automovel,ItemCaro {
	
	

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
