package clase2;

import java.util.Date;

// POJO = PLAIN OLD JAVA OBJECT
// esta clase tiene atributos privados, con getters/setters publicos

public abstract class Empleado implements Ipagable{
	// una ABSTRACT NO PUEDE INSTANCIARSE
private String nombre;
public int edad;
protected int legajo;
Date fechaIngreso; // asume visibilidad package

public Empleado() {} // metodo constructor predeterminado

// Overload = mismo nombre de metodo, con # cant y/o tipo de argumentos
public Empleado(String nombre) {
	this.nombre=nombre;
}
public abstract void display();
// los metodos marcados con ABSTRACT no tienen codigo
// son implementados por las clases hijas

public void mostrarInfo() {
	System.out.println("el empleado tiene " + this.edad);
	System.out.println("el empleado  " + this.nombre);
	System.out.println("el legado del empleado  " + this.legajo);
}

public int verAntiguedad() {
	return 0;
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public int getEdad() {
	return edad;
}

public void setEdad(int edad) {
	this.edad = edad;
}

public int getLegajo() {
	return legajo;
}

public void setLegajo(int legajo) {
	this.legajo = legajo;
}

public Date getFechaIngreso() {
	return fechaIngreso;
}

public void setFechaIngreso(Date fechaIngreso) {
	this.fechaIngreso = fechaIngreso;
}
}
