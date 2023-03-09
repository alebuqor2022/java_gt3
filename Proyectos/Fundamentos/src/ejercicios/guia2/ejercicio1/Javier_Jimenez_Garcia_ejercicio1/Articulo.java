package ejercicio1;

public class Articulo {

	private String nombre;
	private String categoria;
	private double precio;
	private Integer unidad;

	public Articulo() {
		this.nombre = "";
		this.categoria = "";
		this.precio = 0;
		this.unidad = 0;
	}

	public Articulo(String nombre, String categoria, double precio, Integer unidad) {
		this.nombre = nombre;
		this.categoria = categoria;
		this.precio = precio;
		this.unidad = unidad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public Integer getUnidad() {
		return unidad;
	}

	public void setUnidad(Integer unidad) {
		this.unidad = unidad;
	}
}
