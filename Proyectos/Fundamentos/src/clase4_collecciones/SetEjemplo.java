package clase4_collecciones;

import java.util.HashSet;
import java.util.Set;

public class SetEjemplo {

	public static void main(String[] args) {
		// lista SIN DUPLICADOS, 
		// DESORDENADA, no respeta el orden de la carga de elementos

		Set lista=new HashSet();
		lista.add("uno");
		lista.add("segundo");
		lista.add("3ero");
		lista.add(4);
		lista.add("segundo");
		lista.add(2.5);
		lista.add(true);
		lista.add(4);
		
		System.out.println(lista);
	}

}
