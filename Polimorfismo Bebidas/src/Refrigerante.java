
public class Refrigerante extends Bebida {

	public Refrigerante() {
		super("refrigerante", false);
	}

	@Override
	public void preparar() {
		super.preparar();
		System.out.println("Colocando gelo no copo");
	}

}
