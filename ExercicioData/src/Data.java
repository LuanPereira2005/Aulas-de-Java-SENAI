
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

	public void setDia(int dia) {
		this.dia = dia;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public void setHora(int hora) {
		this.hora = hora;
	}

	public void setMin(int min) {
		this.min = min;
	}

	public void setSeg(int seg) {
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

			if (hora <= 12) {

				return dia + "/" + mes + "/" + ano + " " + hora + ":" + min + ":" + seg + " AM";

			}

			else {

				hora -= 12;

				return dia + "/" + mes + "/" + ano + " " + hora + ":" + min + ":" + seg + " AM";

			}

		} else if ((Formato == 12) && (AmPm == 2)) {

			if (hora >= 12) {

				hora -= 12;

				return dia + "/" + mes + "/" + ano + " " + hora + ":" + min + ":" + seg + " PM";

			}

			else {

				return dia + "/" + mes + "/" + ano + " " + hora + ":" + min + ":" + seg + " PM";
			}
		}

		return "Você é um trouxa kkkk";

	}

}
