package clase2;

public class Administrativo extends Gerente {

	@Override
	public void display() {
		System.out.println("estoy en el metodo display de Administrativo");
		this.mostrarInfo();
		
	}
	
	// NO PUEDO OVERRIDE UN METODO FINAL
//	public void establecerHorarioAlmuerzo() {
//		
//	}
}
