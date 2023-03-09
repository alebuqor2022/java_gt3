package ejercicioV;

public class Piano implements Instrumentos{
	String id= "Pia";
	int numero ;
	public Piano(int numero) {
		this.numero = numero;
	}
	@Override
	public void sonar() {
		System.out.println("Piano Sonando numero: " + numero);
		
	}

}
