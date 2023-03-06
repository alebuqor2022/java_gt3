package clase1;

public class Test {

	public static void main(String[] args) {
		// llamada a metodo de objeto
		// crear una instancia con NEW
		Circulo miCirculo=new Circulo();
		double rpta=miCirculo.calcularPerimetro(5);
		System.out.println(rpta);
		System.out.println(miCirculo.calcularPerimetro(7));
		
		// llamado a metodo de clase
		// el metodo es static
		double area=Circulo.encontrarArea(7.3);
		System.out.println("Area del circulo: " +area);
		System.out.println("2do_Area del circulo: " +Circulo.encontrarArea(7.3));
	}

}
