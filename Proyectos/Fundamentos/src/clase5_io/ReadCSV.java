package clase5_io;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.StringTokenizer;

public class ReadCSV {

	public static void main(String[] args) {
		String s;
		try {
			FileInputStream fs=new FileInputStream("C:\\_2023\\Cursos\\Indra_Marzo\\Proyectos\\Fundamentos\\src\\clase5_io\\datos.csv");
			DataInputStream ds=new DataInputStream(fs);
			
			while(true) {
				s=ds.readLine();
				if(s==null)break;
				StringTokenizer st =new StringTokenizer(s, ";");
				System.out.println ("tokens: " + st.countTokens());
				for (int i=0;i<st.countTokens();i++) {
					System.out.print(st.nextToken() + " ");
				}	
				System.out.println();
			}
			fs.close();
			
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println ("Error en lectura de archivo.");
		}
	}

}
