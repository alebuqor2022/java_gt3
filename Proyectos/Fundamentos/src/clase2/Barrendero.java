package clase2;

import java.util.Date;

public final class Barrendero extends Empleado {
// final en una clase, prohibe que tenga hijos 	
	
String nombreCalle;
	@Override
	public void display() {
		System.out.println("barre la calle " + this.nombreCalle);
//		super.
//		public int edad;
//		protected int legajo;
//		Date fechaIngreso;
	}
	@Override
	public void pagar(double cantidad) {
		System.out.println("el barrendero cobra " +cantidad);
		
	}

}
