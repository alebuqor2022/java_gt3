package ejercicio2;

public class SobreGiroException extends Exception {

	private static final long serialVersionUID = 1L;

	private static final String MENSAJE_EXCEPCION = "Fondos insuficientes: ";

	public SobreGiroException(double deficit) {
		super(MENSAJE_EXCEPCION + deficit);
	}

}
