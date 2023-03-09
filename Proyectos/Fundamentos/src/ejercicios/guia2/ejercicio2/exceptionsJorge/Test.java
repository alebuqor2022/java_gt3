package exceptionsJorge;

public class Test {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cuenta c1 = new CuentaCorriente(200,500);
		c1.depositar(25.50);
		try {
			c1.retirar(148.25);
			c1.retirar(470);
			c1.retirar(300);
			
		}catch(SobreGiroException e) {
			System.out.println( e.getMessage() + e.getCantidad());
		}catch(Exception e1) {
			System.out.println("otra excepcion" );
		}
		
	}
	
}
