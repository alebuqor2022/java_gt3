package ejercicio3;

public class Ejercicio3Test {

	public static void main(String[] args) {

		Thread t1 = new Thread(new Chiflado());
		Thread t2 = new Thread(new Chiflado());
		Thread t3 = new Thread(new Chiflado());

		t1.setName("Larry");
		t2.setName("Moe");
		t3.setName("Curry");

		System.out.println("Soy el chiflado 1 y me llamo " + t1.getName());
		System.out.println("Soy el chiflado 2 y me llamo " + t2.getName());
		System.out.println("Soy el chiflado 3 y me llamo " + t3.getName());

		t1.start();
		t2.start();
		t3.start();
	}
}
