package ejercicio1;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class Ejercicio1Test {

	public static final String RUTA_CSV = "src\\ejercicio1\\datos.csv";

	public static void main(String[] args) {

		ArrayList<Articulo> arrayArticulos = new ArrayList<>();
		arrayArticulos = getDatosArchivo();

		System.out.println("Fruta mas barata: " + encontrarFrutaMasBarata(arrayArticulos));

		ArrayList<Articulo> arrayFrutas = obtenerListaFrutas(arrayArticulos);
		System.out.println("Lista de frutas: ");
		arrayFrutas.forEach(fruta -> System.out.println("\t - " + fruta.getNombre()));

		System.out.println("Vegetal mas caro: " + encontrarVegetalMasCaro(arrayArticulos));

		System.out.println("Top 5 articulos mas caros: ");
		List<Articulo> top5ArticulosCaros = obtenerTop5ArticulosMasCaros(arrayArticulos);

		top5ArticulosCaros
				.forEach(articulo -> System.out.println("\t - " + articulo.getNombre() + " | " + articulo.getPrecio()));
	}

	@SuppressWarnings("deprecation")
	public static ArrayList<Articulo> getDatosArchivo() {

		ArrayList<Articulo> arrayArticulos = new ArrayList<>();

		try (FileInputStream fileInputStream = new FileInputStream(RUTA_CSV)) {

			DataInputStream dataInputStream = new DataInputStream(fileInputStream);

			while (true) {

				String lineaLeida = dataInputStream.readLine();

				if (lineaLeida == null) {
					break;
				}

				StringTokenizer st = new StringTokenizer(lineaLeida, ";");

				int indiceToken = 0;
				Articulo articulo = new Articulo();

				while (st.hasMoreElements()) {

					String readToken = st.nextToken();

					switch (indiceToken) {

					case 0:

						articulo.setNombre(readToken);
						break;

					case 1:

						articulo.setPrecio(Double.valueOf(readToken));
						break;

					case 2:

						articulo.setCategoria(readToken);
						break;

					case 3:

						articulo.setUnidad(Integer.valueOf(indiceToken));
						break;

					default:
						break;
					}

					indiceToken++;
				}

				arrayArticulos.add(articulo);
			}

			return arrayArticulos;

		} catch (FileNotFoundException e) {

			System.err.println("No se ha encontrado el fichero especificado");

		} catch (IOException e) {

			System.err.println("Se ha producido un error al procesar la lectura del fichero especificado");
		}

		return arrayArticulos;

	}

	public static String encontrarFrutaMasBarata(ArrayList<Articulo> listaArticulos) {

		return ((Articulo) listaArticulos.stream().filter(articulo -> articulo.getCategoria().equals("fruta"))
				.min(Comparator.comparing(Articulo::getPrecio)).orElse(null)).getNombre();
	}

	public static ArrayList<Articulo> obtenerListaFrutas(ArrayList<Articulo> listaArticulos) {

		return (ArrayList<Articulo>) listaArticulos.stream().filter(articulo -> articulo.getCategoria().equals("fruta"))
				.collect(Collectors.toList());
	}

	public static String encontrarVegetalMasCaro(ArrayList<Articulo> listaArticulos) {

		return ((Articulo) listaArticulos.stream().filter(articulo -> articulo.getCategoria().equals("vegetal"))
				.max(Comparator.comparing(Articulo::getPrecio)).orElse(null)).getNombre();
	}

	public static List<Articulo> obtenerTop5ArticulosMasCaros(ArrayList<Articulo> listaArticulos) {

		ArrayList<Articulo> listaArticulosOrdenadaPorPrecio = ((ArrayList<Articulo>) listaArticulos.stream()
				.sorted(Comparator.comparing(Articulo::getPrecio).reversed()).collect(Collectors.toList()));

		return listaArticulosOrdenadaPorPrecio.subList(0, 5);
	}
}
