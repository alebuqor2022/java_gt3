package clase1;

public class TestIteradores {
// uso del FOR
// cuando conozco la cantidad de repeticiones
// uso del WHILE
// cuando NO conozco la cantidad de repeticiones
// si no cumple la condicion AL MENOS 1 VEZ quiero ejecutar
// entonces el se usa el DO{....} WHILE ()
	
	public static void main(String[] args) {
		
		//ecuacionesReducidas();
		//usoFor1();
		//usoFor2();
		//usoFor3();
		//usoFor4();
		//usoWhile();
		usoContinueBreak();
	}
	
	public static void ecuacionesReducidas() {
		int x=0;
		++x;// x=x+1
		System.out.println(x); // imprime 1
		x++; // x=x+1
		System.out.println(x);// imprime 1
		
		x=0;
		int y=1;
		y=x++; // ejecuta 1ero el operador = , la y guarda el valor anterior de X
		System.out.println("x es " + x + " y es " + y);
		
		x=0;
		y=1;
		y=++x; // ejecuta 1ero el operador ++ 
		System.out.println("x es " + x + " y es " + y);
		
	}
	
	public static void usoFor1() {
		for(int i=1;i<=10;i++) {
			System.out.println("el valor de i es " + i);
		}
	}
	public static void usoFor2() {
		int i=1;
		for(;i<=10;i++) {
			System.out.println("el valor de i es " + i);
		}
	}
	public static void usoFor3() {
		// ir para atras
		for(int i=10;i>=0;i--) {
			System.out.println("el valor de i es " + i);
		}
	}
	public static void usoFor4() {
		for(int i=1;i<=10;i+=2) {
			System.out.println("el valor de i es " + i);
		}
	}
	
	public static void usoWhile() {
		boolean valor=false;
		int cont=1;
		// si no cumple la condicion NO SE EJECUTA NI 1 VEZ
		while (valor) {
			System.out.println("hola");
			cont++;
			if (cont == 3) {
				valor=false;
			}
		}
		
		 valor=false;
		 cont=1;
		 // siempre se ejecuta 1 VEZ
		do {
			System.out.println("chau");
			cont++;
			if (cont == 3) {
				valor=false;
			}
		}while (valor);
	}
	
	public static void usoContinueBreak() {
		for(int i=1;i<=4;i++) {
			if(i==3)break;
			System.out.println("iteracion nro: " +i);
		}
		
		for(int i=1;i<=4;i++) {
			if(i==3)continue;
			System.out.println("2da iteracion nro: " +i);
		}
		
	}
}
