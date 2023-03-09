package exceptionsJorge;

public class SobreGiroException extends Exception {
	double cantidad;
	public SobreGiroException (String mensaje, double cantidad) {
		super (mensaje);
		this.cantidad = cantidad;
	}
	public double getCantidad() {
		return cantidad;
	}
}
