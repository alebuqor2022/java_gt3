package ejercicios.guia1.ejercicio2;

import java.util.Scanner;
public class TablasMultiplicar {
	// Respuesta de Luis
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Introduce un n�mero para mostrar sus tablas de multiplicar: ");
        int numero = input.nextInt();
        
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
            System.out.println(); // separar las tablas con una l�nea en blanco
        }
    }
}
