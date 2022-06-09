// Criacao de uma classe
public class Preparador {
	
	// Metodo da classe
	public void prepararBebida(Bebida bebida) {

		System.out.println("Preparando a bebida:" + bebida.getNome());

		bebida.preparar();

		if (bebida.isAquecer()) {
			System.out.println("Aquecendo a bebida:" + bebida.getNome());
		}

		System.out.println("Bebida preparada com sucesso!! \n");

	}
}
