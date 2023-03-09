package ejercicioV;

public class Guitarra implements Instrumentos {
	String id= "Gui";
	int numero ;
	public Guitarra(int numero) {
		this.numero = numero;
	}
	@Override
	public void sonar() {
		System.out.println("Sonar Guitarra numero: " + numero);
		
	}

}
