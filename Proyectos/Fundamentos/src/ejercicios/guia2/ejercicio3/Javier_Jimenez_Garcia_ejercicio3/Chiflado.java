package ejercicio3;

public class Chiflado implements Runnable {

	private final int NUM_EJECUCIONES = 10;

	@Override
	public void run() {

		for (int i = 0; i < NUM_EJECUCIONES; i++) {

			try {

				System.out.println("¡¡¡Soy un chiflado!!!");
				Thread.sleep(2000);

			} catch (InterruptedException iex) {
				System.err.println(iex.getMessage());
			}
		}

	}

}
