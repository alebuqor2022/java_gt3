package ejercicio6;

public class Silla extends Item {

	private boolean conRueditas;
	private int lote;
	private int numeroDentroDeLote;

	public Silla(boolean conRueditas, int lote, int numeroDentroDeLote) {
		super();
		this.conRueditas = conRueditas;
		this.lote = lote;
		this.numeroDentroDeLote = numeroDentroDeLote;
	}

	public boolean isConRueditas() {
		return this.conRueditas;
	}

	public void setConRueditas(boolean conRueditas) {
		this.conRueditas = conRueditas;
	}

	public int getLote() {
		return this.lote;
	}

	public void setLote(int lote) {
		this.lote = lote;
	}

	public int getNumeroDentroDeLote() {
		return this.numeroDentroDeLote;
	}

	public void setNumeroDentroDeLote(int numeroDentroDeLote) {
		this.numeroDentroDeLote = numeroDentroDeLote;
	}

	@Override
	public int getId() {
		return this.lote * 1000 + this.numeroDentroDeLote;
	}
}
