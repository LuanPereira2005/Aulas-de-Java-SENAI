
public class Main {

	public static void main(String[] args) {
	
		Veiculo veiculo1 = new Veiculo();
		
		veiculo1.setMarca("Porsche");
		veiculo1.setModelo("Carrera GT");
		veiculo1.setAno(2014);
		
		veiculo1.imprimir();
		veiculo1.buzinar();
		
		System.out.println();
		
		Carro carro1 = new Carro();
		
		carro1.setMarca("Lamborghini");
		carro1.setModelo("Gallardo");
		carro1.setAno(2004);
		carro1.setQuatroPortas(true);
		
		carro1.imprimir();
		carro1.buzinar();
		
		System.out.println();
		
		Caminhao caminhao1 = new Caminhao();
		
		caminhao1.setMarca("Scania");
		caminhao1.setModelo("XJI76");
		caminhao1.setAno(2012);
		
		caminhao1.imprimir();
		caminhao1.buzinar();
		
		System.out.println();
		
		Moto moto1 = new Moto();
		
		moto1.setMarca("Honda");
		moto1.setModelo("CG-150");
		moto1.setAno(2014);
		
		moto1.imprimir();
		moto1.buzinar();
		moto1.darGrau();
		
		
	}

}
