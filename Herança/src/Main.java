
public class Main {

	public static void main(String[] args) {

		// Instanciando um objeto da classe Veiculo
		Veiculo veiculo1 = new Veiculo();

		// Usando os Sets
		veiculo1.setMarca("Porsche");
		veiculo1.setModelo("Carrera GT");
		veiculo1.setAno(2014);

		// Usando os metodos da superclasse
		veiculo1.imprimir();
		veiculo1.buzinar();

		// Syso pra pular linha
		System.out.println();

		// Instanciando um objeto da classe Carro
		Carro carro1 = new Carro();

		// Usando os Sets
		carro1.setMarca("Lamborghini");
		carro1.setModelo("Gallardo");
		carro1.setAno(2004);
		carro1.setQuatroPortas(true);

		// Usando os metodos da subclasse
		carro1.imprimir();
		carro1.buzinar();

		// Syso pra pular linha
		System.out.println();

		// Instanciando um objeto da classe Caminhao
		Caminhao caminhao1 = new Caminhao();

		// Usando os Sets
		caminhao1.setMarca("Scania");
		caminhao1.setModelo("XJI76");
		caminhao1.setAno(2012);

		// Usando os metodos da subclasse
		caminhao1.imprimir();
		caminhao1.buzinar();

		// Syso pra pular linha
		System.out.println();

		// Instanciando um objeto da classe Moto
		Moto moto1 = new Moto();

		moto1.setMarca("Honda");
		moto1.setModelo("CG-150");
		moto1.setAno(2014);

		// Usando os metodos da subclasse que existem na superclasse mas tambem o
		// darGrau que e um metodo especifico da classe Moto
		moto1.imprimir();
		moto1.buzinar();
		moto1.darGrau();

	}

}
