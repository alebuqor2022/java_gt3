package clase1;

import clase2.Empleado;

public class Chofer extends Empleado {

	@Override
	public void display() {
		System.out.println("estoy en el Chofer");
//		super.
//		public int edad;
//		protected int legajo;
	}

	@Override
	public void pagar(double cantidad) {
		System.out.println("el chofer cobra " +cantidad);
		
	}

}
