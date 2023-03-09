package ejercicio5;

import java.util.ArrayList;
import java.util.Scanner;



abstract class InstrumentoMusical {
    public abstract String sonar();
}


class Orquesta {
    private ArrayList<InstrumentoMusical> instrumentos;
    
    
    public static void main(String[] args) {
    	//creamos orquesta
    	Orquesta miOrquesta = new Orquesta();
    	System.out.println("Cuantos instrumentos quieres añadir: \n");
		
		
		miOrquesta.addInstrumento(new Guitarra());
		miOrquesta.addInstrumento(new Piano());
		
    	System.out.println(miOrquesta.darConcierto()); 
    	
    }
    
    public Orquesta() {
        instrumentos = new ArrayList<InstrumentoMusical>();
    }
    
    public void addInstrumento(InstrumentoMusical instrumento) {
        instrumentos.add(instrumento);
    }
    
    public String darConcierto() {
        StringBuilder resultado = new StringBuilder();
        
        for (InstrumentoMusical instrumento : instrumentos) {
            resultado.append(instrumento.sonar()).append(" ");
        }
        
        return resultado.toString();
    }

}

