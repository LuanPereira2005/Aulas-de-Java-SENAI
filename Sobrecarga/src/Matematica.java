// Criacao de classe
public class Matematica {

	// Sobrecarga de metodos
	// A sobrecarga e quando existem um metodo com o mesmo nome (nesse caso) o somar
	// Para sobrecargas acontecer existe a necessidade dos parametros serem
	// diferentes ou da implementacao do metodo ser diferente
	int somar(int x, int y) {

		return x + y;

	}

	int somar(int x, int y, int z) {

		return x + y + z;

	}

	double somar(double x, double y) {

		return x + y;
	}

}
