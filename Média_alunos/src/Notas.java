// Criacao de uma classe
public class Notas {
	// Criacao de atributos
	double nota1;
	double nota2;
	double nota3;
	double peso1;
	double peso2;
	double peso3;
	double resul1;
	double resul2;
	double resul3;
	
	// Metodo para definir a nota com o peso ja aplicado
	void peso(double nota1,double nota2,double nota3, double peso1, double peso2, double peso3){
		
		resul1=nota1*peso1/10;
		resul2=nota2*peso2/10;
		resul3=nota3*peso3/10;
		
	}
}
