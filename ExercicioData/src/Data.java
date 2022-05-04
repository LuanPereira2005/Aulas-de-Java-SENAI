
public class Data {

	private int dia;
	private int mes;
	private int ano;
	private int hora;
	private int min;
	private int seg;

	public Data(int dia, int mes, int ano) {

		this.dia = dia;
		this.mes = mes;
		this.ano = ano;

	}

	public Data(int dia, int mes, int ano, int hora, int min, int seg) {

		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
		this.hora = hora;
		this.min = min;
		this.seg = seg;

	}

	public String imprimir() {

		return dia + "/" + mes + "/" + ano;

	}

	public String imprimir(int Formato) {

		return dia + "/" + mes + "/" + ano + " " + hora + ":" + min + ":" + seg;

	}

	public String imprimir(int Formato, int AmPm) {

		if ((Formato == 12) && (AmPm == 1)) {

			hora *= 1;
			min *= 1;
			seg *= 1;

			return dia + "/" + mes + "/" + ano + " " + hora + ":" + min + ":" + seg;

		} else if ((Formato == 12) && (AmPm == 2)) {
			
			hora += 12;

			return dia + "/" + mes + "/" + ano + " " + hora + " da tarde:" + min + ":" + seg;

		}

		return "Você é um trouxa kkkk";

	}

}
