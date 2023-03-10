package clase6_Lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class TetLambdas {

	public static void main(String[] args) {
		//ejemplo1();
		//ejemplo2();
		//ejemplo3();
		ejemplo4();
	}

	public static void ejemplo1() {
		Pais pais1=new Pais("España");
		Pais pais2=new Pais("Argentina");
		Pais pais3=new Pais("Italia");
		Pais pais4=new Pais("Brasil");
		
		List<Pais> paises=new ArrayList<Pais>();
		paises.add(pais1);
		paises.add(pais2);
		paises.add(pais3);
		paises.add(pais4);
		
		paises.forEach((p)-> {System.out.println(p.nombre);});
		System.out.println("++++++++++++++++++++++++++++++++++++");
		// ordenar la lista de estos paises, con un Comparador
		//comparadorAnonimo(paises);
		comparadorLambda(paises);
		paises.forEach((p)-> {System.out.println(p.nombre);});
	}
	
	public static void comparadorAnonimo(List<Pais> list) {
		// voy a ordenar por alfabeto la coleccion
		// forma clasica SIN LAMBDAS
		Collections.sort(list, new Comparator<Pais>() {
			@Override
			public int compare(Pais p1, Pais p2) {
				return p1.nombre.compareTo(p2.nombre);
			}
		});
	}
	public static void comparadorLambda(List<Pais> list) {
		Collections.sort(list,(p1,p2)->{
			return p1.nombre.compareTo(p2.nombre);
		});
	}

	public static void ejemplo2() {
	// usamos la interfaz java.util.function.Consumer
	// para almacenar una expresion lambda en una variable
		ArrayList<Integer> nros=new ArrayList<Integer>();
		nros.add(5);
		nros.add(9);
		nros.add(8);
		nros.add(1);
		
		Consumer<Integer> metodo=(n)->{System.out.println(n);};
		nros.forEach(metodo);
	}

	public static void ejemplo3() {
		// uso clasico
		for(Integer numero : Arrays.asList(1,2,3,4,5,6,7,8,9,10)) {
			System.out.println(numero + " ");
		}
		System.out.println("++++++++++++++++++++++++++++++++++++");
		// uso lambdas
		Arrays.asList(1,2,3,4,5,6,7,8,9,10).forEach(
				n -> System.out.println(n + " ")
				);
		System.out.println("++++++++++++++++++++++++++++++++++++");
		// otra forma reducida con lambdas implicita
		Arrays.asList(1,2,3,4,5,6,7,8,9,10).forEach(
				System.out::println
				);
	}

	public static void ejemplo4() {
	StringFunction exclamar=(s)->s+ "!";
	StringFunction preguntar=(s)->s+ "?";
	printFormatted("hola " , exclamar);
	printFormatted("chau " , preguntar);
	}
	
	public static void printFormatted(String str, StringFunction format) {
		// metodo que toma una expresion lambda como parametro
		System.out.println(format.run(str));
	}
}
