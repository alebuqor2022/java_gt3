package ejercicio2;

public class Test {

	public static void main(String[] args) {

		try {

			CuentaCorriente cuentaCorriente = new CuentaCorriente(200, 500);

			System.out.println("Saldo inicial: " + cuentaCorriente.getSaldo());

			System.out.println("Deposito 25.50");
			cuentaCorriente.depositar(25.50);
			printSaldoActual(cuentaCorriente);

			System.out.println("Retiro 148.25");
			cuentaCorriente.retirar(148.25);
			printSaldoActual(cuentaCorriente);

			System.out.println("Retiro 470");
			cuentaCorriente.retirar(470);
			printSaldoActual(cuentaCorriente);

			System.out.println("Retiro 300");
			cuentaCorriente.retirar(300);
			printSaldoActual(cuentaCorriente);

		} catch (SobreGiroException sgEx) {

			System.err.println(sgEx.getMessage());

		}
	}

	private static void printSaldoActual(Cuenta cuenta) {
		System.out.println("Saldo actual: " + cuenta.getSaldo());
	}
}
