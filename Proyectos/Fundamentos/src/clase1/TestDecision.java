package clase1;

public class TestDecision {

	public static void main(String[] args) {
		TestDecision test = new TestDecision();
		test.ejemplo0(); // llamado NO estatico, es a traves de una instancia
		ejemplo1(); // llamado estatico
		ejemplo2();
		ejemplo3();
		ejemplo4();
	}

	public void ejemplo0() {
		int asistentes = 4;
		boolean valor; // asume FALSE
		if (asistentes >= 5) {
			valor = true;
		} else {
			valor = false;
		}
		System.out.println("asistentes >=5 " + valor);
	}

	public static void ejemplo1() {
		boolean valor = true;
		if (valor) {
			System.out.println("probando valor = true");
		} else {
			System.out.println("probando valor = false");
		}
	}

	public static void ejemplo2() {
		// if reducido
		// se usa cuando la respuesta es guardada en una variable
		int asistentes = 4;
		String salida; // asume null
		salida = (asistentes >= 5) ? "SI" : "NO";
		System.out.println(salida);
		System.out.println(asistentes >= 5 ? "SI" : "NO");

	}

	public static void ejemplo3() {
		// ejemplo de selector de casos
		// switch ... tipos de datos: boolean, byte, short, char, int, enum, String
		int dia = 24;
		switch (dia) {
		case 1:
			System.out.println("Lunes");
			break;
		case 2:
			System.out.println("Martes");
			break;
		case 3:
			System.out.println("Miercoles");
			break;
		case 4:
			System.out.println("Jueves");
			break;
		case 5:
			System.out.println("Viernes");
			break;
		case 6:
			System.out.println("Sabado");
			break;
		case 7:
			System.out.println("Domingo");
			break;
		default:
			System.out.println("Error");
		}
		System.out.println("sali del switch");
	}

	public static void ejemplo4() {
		int mes =99;
		switch(mes) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("tiene 31 dias");
			break;
		case 4: case 6: case 9 : case 11:
			System.out.println("tiene 30 dias");
			break;
		case 2:
			System.out.println("tiene 28 o 29 dias");
			break;
		default:
			System.out.println("mes incorrecto");
		}
	}
}
