package clase2;

public class Secretaria extends Empleado {
String nombreGerencia;
final String COLOR_UNIFORME="AZUL";
// final en un atributo es convertirlo en CONSTANTE
// no puedo tener un SETTER de una constante

public Secretaria (String nombre) {
	super(nombre);
}
public String getNombreGerencia() {
	return nombreGerencia;
}
public void setNombreGerencia(String nombreGerencia) {
	this.nombreGerencia = nombreGerencia;
}
public String getCOLOR_UNIFORME() {
	return COLOR_UNIFORME;
}

@Override
public void mostrarInfo() {
	super.mostrarInfo();
	System.out.println("la secretaria pertence a la Gerencia de " + this.nombreGerencia);
	System.out.println("la secretaria tiene uniforme de color " + this.COLOR_UNIFORME);
}
@Override
public void display() {
	System.out.println("estoy en el metodo display de Secretaria");
	this.mostrarInfo();
	
}
@Override
public void pagar(double cantidad) {
	System.out.println("la secretaria cobra " +cantidad);
	
}
}
