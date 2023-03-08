package clase4_fechas_equals;

public class TestHashCode {

	public static void main(String[] args) {
		Persona p=new Persona();
		p.setNombre("Ale");
		System.out.println(p.hashCode());
		
		Persona p1=new Persona();
		p1.setNombre("Ale");
		System.out.println(p1.hashCode());
		
		
		System.out.println(p.equals(p1));

	}

}
