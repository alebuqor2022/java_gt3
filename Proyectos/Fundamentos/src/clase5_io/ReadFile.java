package clase5_io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {

	public static void main(String[] args) {
		File file=new File("C:\\Ale\\","hola.txt");
		String s;
	
		try {
			BufferedReader in= new BufferedReader(new FileReader(file));
			s=in.readLine();
			while(s !=null) {
				System.out.println("leo: " + s);
				s=in.readLine();
			}
			in.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e){
			System.out.println(e.getMessage());
		}
		
	}

}
