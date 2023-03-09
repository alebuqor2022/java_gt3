package exceptionsJorge;

public class CuentaCorriente extends Cuenta {
	double cantidadSonbreGiro;
	double total ;
	public CuentaCorriente(double saldo , double sobreGiro) {
		super(saldo);
		this.cantidadSonbreGiro = sobreGiro;
		total = saldo+ cantidadSonbreGiro;
		// TODO Auto-generated constructor stub
	}
	public CuentaCorriente (double saldo) {
		super(saldo);
	}
	public void retirar ( double cantidad) throws SobreGiroException {
		double deficit ;
		if(total < cantidad) {
			deficit = cantidad - total;
			throw new SobreGiroException("Fondos Insuficientes necesita:" , deficit );
		}else {
			total -= cantidad;
			System.out.println("Retirada de saldo de cuenta realizada de: " + cantidad + "saldo actual: " + total);
		}

	}
	
}
