package clase2;

public class Gerente extends Empleado {
private String automovil;


public final void establecerHorarioAlmuerzo() {
	System.out.println("el gerente almuerza 12.30");
}
@Override
public void mostrarInfo() {
	super.mostrarInfo(); // extendi la funcionalidad del padre
	System.out.println("el gerente tiene un auto modelo "+ this.automovil);
}

@Override
public int getLegajo() {
	// sobreescribi el comportamiento del padre
	return 9999;
}

public String getAutomovil() {
	return automovil;
}

public void setAutomovil(String automovil) {
	this.automovil = automovil;
}

@Override
public void display() {
	System.out.println("estoy en el metodo display de Gerente");
	this.mostrarInfo();
	
}
@Override
public void pagar(double cantidad) {
	System.out.println("el gerente cobra " +cantidad);
	
}

}
