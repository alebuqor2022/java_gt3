package clase4_collecciones;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListEjemplo {

	public static void main(String[] args) {
		// coleccion heterogenea, los elementos son de cualquier tipo
		// permite elementos Duplicados, 
		// respeta el orden de carga

		ArrayList lista1=new ArrayList();
		List lista=new ArrayList();
		
		lista.add("uno");
		lista.add("segundo");
		lista.add("3ero");
		lista.add(4);
		lista.add("segundo");
		lista.add(2.5);
		lista.add(true);
		lista.add(4);
		
		System.out.println(lista);
		
		Iterator it=lista.iterator();
		while (it.hasNext()) {
			System.out.println(" " + it.next());
		}
		
	}

}
