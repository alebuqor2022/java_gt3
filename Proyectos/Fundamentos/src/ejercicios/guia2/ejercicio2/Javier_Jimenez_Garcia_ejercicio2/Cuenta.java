package ejercicio2;

public class Cuenta {

	private double saldo;

	public Cuenta(double saldoInicial) {
		this.saldo = saldoInicial;
	}

	public double getSaldo() {
		return this.saldo;
	}

	public void depositar(double cantidad) {
		this.saldo += cantidad;
	}

	public void retirar(double cantidad) throws SobreGiroException {

		if (this.saldo - cantidad < 0) {
			throw new SobreGiroException(this.saldo - cantidad);
		}

		this.saldo -= cantidad;
	}
}
