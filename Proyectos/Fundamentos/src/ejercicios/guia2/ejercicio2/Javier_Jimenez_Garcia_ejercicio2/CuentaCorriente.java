package ejercicio2;

public class CuentaCorriente extends Cuenta {

	public CuentaCorriente(double saldoInicial) {
		super(saldoInicial);
	}

	public CuentaCorriente(double saldoInicial, double sobreGiro) {
		super(saldoInicial + sobreGiro);
	}

}
