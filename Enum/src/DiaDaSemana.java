// Criacao de um enum
// O enum e um tipo de dado utilizado para armazenar um conjunto de valores constantes, ou seja, sao valores fixos, que nao podem ser modificados.
public enum DiaDaSemana {
	DOMINGO(1), SEGUNDA(2), TERCA(3), QUARTA(4), QUINTA(5), SEXTA(6), SABADO(7);
	
	// Criacao de um atributo int
	private int num;

	// Construtor de DiaDaSemana com um parametro int
	private DiaDaSemana(int num) {
		this.num = num;
	}
	
	// Get
	public int getNum() {
		return num;
	}

}
