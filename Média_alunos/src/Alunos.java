
public class Alunos {
	String nome;
	double nota1;
	double nota2;
	double nota3;
	double peso1;
	double peso2;
	double peso3;
	double resul1;
	double resul2;
	double resul3;
	double resultotal;
	
	void cal_média(double resultotal) {
		
		resul1=nota1*3/10;
		resul2=nota2*3/10;
		resul3=nota3*3/10;
		resultotal=resul1+resul2+resul3/3;
		
	}
	
}
