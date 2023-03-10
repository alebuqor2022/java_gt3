package clase6_Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class TestStreams {

	public static void main(String[] args) {
		//ejemplo1();
		//ejemplo2();
		ejemplo3();
	}
	
	public static void ejemplo1() {
		Stream.iterate(0, n -> n + 10).limit(15).forEach(StreamEjemplo::imp);
		System.out.println("++++++++++++++++++++++++++++++++++++");
		Stream<Integer> nros=Stream.iterate(0, n -> n + 10);
		nros.limit(15).forEach(StreamEjemplo::imp);
	
	}

	public static void ejemplo2() {
		// uno
		List<Integer> li=Arrays.asList(5,6,10,25,74);
		int suma = li.stream()
					.mapToInt(x->x.intValue())
					.sum();
		System.out.println("la suma es " + suma);
		// dos
		long pares = li.stream()
					.filter(x->x % 2 == 0)
					.count();
		System.out.println("la cantidad de pares es " + pares);
		// tres
		Object[] arrInt=Stream.of(5,6,10,25,74)
						.filter(x->x % 2 == 0)
						.toArray();
		for(Object elemento: arrInt) {
			System.out.println("los nros pares son " + elemento);
		}
		
	}

	public static void ejemplo3() {
		List<Empleado> lista=new ArrayList<>();
		lista.add(new Empleado("Ale", "Directora", 3300));
		lista.add(new Empleado("Juan", "Gerente", 5400));
		lista.add(new Empleado("Francisca", "Jefe", 2700));
		
		double rpta = calcularPromedio(lista);
		System.out.println("el promedio de salarios es " + rpta);
	}
	public static double calcularPromedio(List<Empleado> lista) {
		return lista.stream()
				.mapToInt(empleado -> empleado.getSalario())
				.average()
				.getAsDouble();
	}
}
