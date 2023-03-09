package exceptionsJorge;

public class Cuenta {
	double saldo;
	public Cuenta(double saldo) {
		this.saldo = saldo;
	}
	public double getSaldo() {
		return saldo;
	}
	public void depositar(double deposito) {
		saldo += deposito;
		System.out.println("Ingreso realizado:" + deposito);
	}
	public void retirar( double retirada) throws SobreGiroException {
		double deficit ;
		if(saldo < retirada) {
			deficit = retirada - saldo;
			throw new SobreGiroException("Fondos Insuficientes necesita :" , deficit );
		}else {
			saldo -= retirada;
			System.out.println("Retirada de saldo de cuenta realizada de: " + retirada + "saldo actual: " + saldo);
		}
		
	}
	
}
