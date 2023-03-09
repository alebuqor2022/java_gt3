package clase5_io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class WriteFile {

	public static void main(String[] args) {
		File file=new File("C:\\Ale\\","hola.txt");
		String s;
		
		try {
			BufferedReader in= new BufferedReader(new InputStreamReader(System.in));
			PrintWriter out= new PrintWriter(new FileWriter(file, true)); // con true, hago append
			System.out.println("tipee algo, y presione CTRL-Z para salir");

			while((s=in.readLine()) !=null) {
				out.println(s);				
			}
			in.close();
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		} 
		

	}

}
