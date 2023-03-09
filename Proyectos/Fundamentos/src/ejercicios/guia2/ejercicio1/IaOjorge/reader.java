package IaOjorge;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class reader {
	public static void main(String[] args) {
		ReaderLogic readerLogic = new ReaderLogic();
		Writer writer = new Writer();
		readerLogic.read();
		readerLogic.FrutaMasBarata();
		readerLogic.VegetalMasCaro();
		readerLogic.frutas();
		readerLogic.masCaros();
		writer.write(readerLogic.masCaros());
	}
}
