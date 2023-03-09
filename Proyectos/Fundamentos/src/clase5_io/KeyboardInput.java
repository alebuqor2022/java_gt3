package clase5_io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class KeyboardInput {

	public static void main(String[] args) {
		String s;
		// otra alternativa al uso del Scanner
		BufferedReader in= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("tipee algo, y presione CTRL-Z para salir");
		
		try {
			s=in.readLine();
			while(s !=null) {
				System.out.println("leo: " + s);
				s=in.readLine();
			}
			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e){
			System.out.println(e.getMessage());
		}
		
	}

	public static void scanTest() {
		Scanner s = new Scanner(System.in);
		 String param = s.next();
		 System.out.println("the param 1 " + param);
		 int value = s.nextInt();
		 System.out.println("second param " + value);
		 s.close();
	}
}
