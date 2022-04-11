public class Cliente {

	String nome;
	int conta;
	Pix pix;
	float saldo;
	
	void adicionar(float saldo) {
		this.saldo += saldo;
		
	}
	void dar(float saldo) {
		this.saldo -= saldo;
		
	}
	void versaldo(float saldo) {
		System.out.println(saldo);
		
	}
}	
