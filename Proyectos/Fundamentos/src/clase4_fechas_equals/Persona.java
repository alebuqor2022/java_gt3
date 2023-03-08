package clase4_fechas_equals;

import java.util.Objects;

public class Persona {
String nombre;

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public int hashCode() {	
	return Objects.hash(nombre);
}
public boolean equals(Object o) {
	if(o.hashCode()== this.hashCode()) {
	return true;
	}
	return false;
}

}
