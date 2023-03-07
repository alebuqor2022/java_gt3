package clase3_arrays;

public class TestArrays {

	public static void main(String[] args) {
		//ejemplo1();
		//ejemplo2();
		ejemplo3();
		

	}

	static void ejemplo1() {
		// declaro e inicializo
		String[] items= {"Camisa", "Pantalon", "Bufanda"};
		String items2[]= {"Camisa", "Pantalon", "Bufanda"};
		for(int i=0; i < items.length; i++) {
			System.out.println(items[i]);
		}
	}
	static void ejemplo2() {
		// declaro y dimensiono
		String valores[]= new String[3]; // usa la memoria en el momento que se carga
		String[] valores2= new String[3];// usa la memoria en la declaracion
		// cargo valores
		valores[0]="rojo";
		valores[1]="azul";
		valores[2]="verde";
		
		try {
		for(int i=0; i <= valores.length; i++) { // length =3
			System.out.println(valores[i]);
		}
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			System.out.println("elemento no encontrado");
		}catch (Exception e1) {
			System.out.println(e1.getMessage());
		}
	}
	
	static void ejemplo3() {
	// matriz de 2 filas 3 columnas --> 2x3
	String[][] ciudades = { { "BsAs", "Sao Pablo", "Madrid" }, 
							{ "Argentina", "Brasil", "Espa�a" } };
	for (int i = 0; i < ciudades.length; i++) { // se posiciona en las filas
		for (int j = 0; j < ciudades[i].length; j++) { // se posiciona en las columnas
			System.out.println(ciudades[i][j]); // ciudades[fila][columna]
		}
	}
	}
}
