package ejercicioV;

import java.util.ArrayList;

public class Concierto {
	
	Instrumentos i1, i2,i3,i4;
	public static void main(String args[]) {
		ArrayList <Instrumentos> instrumentos = new ArrayList<>();
		Instrumentos i1 = new Guitarra(1);
		Instrumentos i2 = new Guitarra(2);
		Instrumentos i3 = new Piano(1);
		Instrumentos i4 = new Piano(2);
		 instrumentos.add(i1);
		 instrumentos.add(i2);
		 instrumentos.add(i3);
		 instrumentos.add(i4);
			for(Instrumentos i :  instrumentos) {
				i.sonar();
			}
		
	}
	
	
}
