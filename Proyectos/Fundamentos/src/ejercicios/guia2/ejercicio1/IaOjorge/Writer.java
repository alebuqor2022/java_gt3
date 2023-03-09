package IaOjorge;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Writer {
	public void write(ArrayList <ShoppingArticle> lista) {
		File file=new File("C:\\Users\\jrblancoa\\Desktop\\dataBase1.txt");
		String s;
		
		try {
			BufferedReader in= new BufferedReader(new InputStreamReader(System.in));
			PrintWriter out= new PrintWriter(new FileWriter(file)); // con true, hago append
			for (ShoppingArticle a : lista) {
				out.println(a.csvmode());
			}
			
			in.close();
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		} 
		

	}

}
