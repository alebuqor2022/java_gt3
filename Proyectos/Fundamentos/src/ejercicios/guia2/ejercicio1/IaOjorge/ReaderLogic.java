package IaOjorge;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class ReaderLogic {
	ArrayList <ShoppingArticle> productos = new ArrayList<>();
	ShoppingArticle aux = new ShoppingArticle();
	String read;
	public void read() {

	try {
		FileInputStream fs=new FileInputStream("C:\\Users\\jrblancoa\\Desktop\\dataBase.csv");
		DataInputStream ds=new DataInputStream(fs);
		
		while(true) {
			read=ds.readLine();
			if(read==null)break;
			StringTokenizer st =new StringTokenizer(read, ";");
			productos.add(new ShoppingArticle(st.nextToken(),st.nextToken(),Double.valueOf(st.nextToken()),Integer.parseInt(st.nextToken())));
			
		}
		System.out.println("-------------------Todos los productos: ---------------------");
		for(ShoppingArticle a : productos) {
			System.out.println(a.toString());
		}
		
		fs.close();
		
	
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		System.out.println ("Error en lectura de archivo.");
	}
}
	public ShoppingArticle FrutaMasBarata() {
		ShoppingArticle barato = new ShoppingArticle();
		for(ShoppingArticle a : productos) {
			if(barato.getCategoria() == null && a.getCategoria().equals("fruta")) {
				barato = a;
			}else if(a.getCategoria().equals("fruta") && a.getPrecio() < barato.getPrecio()) {
				barato = a;
			}
		}
		System.out.println("-------------------Fruta mas barata: ---------------------");

		System.out.println (barato.toString());

		return barato;
	}
	public ShoppingArticle VegetalMasCaro() {
		ShoppingArticle caro = new ShoppingArticle();
		for(ShoppingArticle a : productos) {
			if(caro.getCategoria() == null && a.getCategoria().equals("vegetal")) {
				caro = a;
			}else if(a.getCategoria().equals("vegetal") && a.getPrecio() > caro.getPrecio()) {
				caro = a;
			}
		}
		System.out.println("-------------------Vegetal mas caro: ---------------------");

		System.out.println (caro.toString());

		return caro;
	}
	public ArrayList<ShoppingArticle> frutas (){
		ArrayList <ShoppingArticle> frutas = new ArrayList<>();
		System.out.println("-------------------las furtas son: ---------------------");
		for(ShoppingArticle a : productos) {
			if(a.getCategoria().equals("fruta")) {
				frutas.add(a);
				System.out.println(a.toString());
			}
		}
		
		return frutas;
	}
	public  ArrayList<ShoppingArticle> masCaros (){
		ArrayList <ShoppingArticle> topFive= new ArrayList<>();
		for(int i = 0; i < 5; i++) {
			topFive.add(productos.get(i));
		}
		for(int i = 4; i < productos.size(); i++) {
			for(int j = 0 ; j < 5 ; j++) {
				if(topFive.get(j).getPrecio() < productos.get(i).getPrecio()) {
					topFive.remove(j);
					topFive.add(productos.get(i));
				}
			}
		}
		System.out.println("-------------------Top 5 caros: ---------------------");

		for(ShoppingArticle a : topFive) {
				System.out.println(a.toString());	
		}
		return topFive;
	}
}
