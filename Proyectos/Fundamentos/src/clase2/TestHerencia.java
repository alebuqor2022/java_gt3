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
		
		boolean rpta=comparoInstancias(e1);
		if(rpta == true) {
			System.out.println("e es un Gerente ");
		} else {
			System.out.println("e es una secretaria ");
		}
	}
	
	public static boolean comparoInstancias(Empleado e) {
		if (e instanceof Gerente) {
			return true;
		} else {
		return false;
		}
	}

}
