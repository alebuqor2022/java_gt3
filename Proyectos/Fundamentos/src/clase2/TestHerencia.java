package clase2;

import clase1.Chofer;

public class TestHerencia {

	public static void main(String[] args) {
		// no puedo instanciar una clase abstract
		// Empleado e =new Empleado();
		// POLIMORFISMO
		Empleado e =new Gerente();
		Empleado e1= new Secretaria("Ale");
		Chofer c=new Chofer();
		c.pagar(1000);
		
		
		e.setLegajo(1234);
		e.setNombre("Mario");
		e.setEdad(33);
		e.pagar(3000);
		e.display();
		
		e1.pagar(2500);
		e1.display();
	}

}
