package ejercicio6;

public class PC extends Item implements BarcodeReadable {

	private int nroSerie;
	private boolean esNotebook;

	public PC(int nroSerie, boolean esNotebook) {
		super();
		this.nroSerie = nroSerie;
		this.esNotebook = esNotebook;
	}

	public int getNroSerie() {
		return this.nroSerie;
	}

	public void setNroSerie(int nroSerie) {
		this.nroSerie = nroSerie;
	}

	public boolean isEsNotebook() {
		return this.esNotebook;
	}

	public void setEsNotebook(boolean esNotebook) {
		this.esNotebook = esNotebook;
	}

	@Override
	public int getId() {
		return this.nroSerie;
	}

	@Override
	public int getBarcode() {
		return 1234567890;
	}
}
