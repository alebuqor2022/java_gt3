package clase6_Optional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class TestOptional {

	public static void main(String[] args) {
		//ejemplo1();
		ejemplo2();
	}
	public static void ejemplo1() {
		  List<Nota> notas= new ArrayList<Nota>();
		    notas.add(new Nota("matematicas",3));
		    notas.add(new Nota("lengua",8));
		    notas.add(new Nota("ingles",5));
		    notas.add(new Nota("fisica",7));
		    
		    Nota nota=buscarNotaSobresaliente(notas);
		    System.out.println(nota.getValor());
		    System.out.println(nota.getAsignatura());
	}
	public static void ejemplo2() {
		  List<Nota> notas= new ArrayList<Nota>();
		    notas.add(new Nota("matematicas",3));
		    notas.add(new Nota("lengua",8));
		    notas.add(new Nota("ingles",5));
		    notas.add(new Nota("fisica",7));
		    
		    Optional<Nota> oNota=buscarNotaSobresaliente1(notas);
		    if(oNota.isPresent()) {
		    	Nota nota =oNota.get();
		    	System.out.println(nota.getValor());
			    System.out.println(nota.getAsignatura());
		    }
	}
	

	public static Nota buscarNotaSobresaliente(List<Nota> notas) {
		Nota nota=null;
		for (Nota unaNota: notas) {
			if(unaNota.getValor()>=9) {
				nota=unaNota;
			}
		}
		return nota;
	}
	
	public static Optional<Nota> buscarNotaSobresaliente1(List<Nota> notas) {
		
		for (Nota unaNota: notas) {
			if(unaNota.getValor()>=9) {
				return Optional.of(unaNota);
			}
		}
		return Optional.empty();
	}
}
