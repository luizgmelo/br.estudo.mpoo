package aula1_extra;

public class Telefone {
	private int ddi=55;
	private int ddd;
	private int numero;
	
	public Telefone(int ddi, int ddd, int numero) {
		this.ddi = ddi;
		this.ddd = ddd;
		this.numero = numero;
	}

	public Telefone(int ddd, int numero) {
		this.ddd = ddd;
		this.numero = numero;
	}

	public int getDdi() {
		return ddi;
	}

	public void setDdi(int ddi) {
		this.ddi = ddi;
	}

	public int getDdd() {
		return ddd;
	}

	public void setDdd(int ddd) {
		this.ddd = ddd;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
}
