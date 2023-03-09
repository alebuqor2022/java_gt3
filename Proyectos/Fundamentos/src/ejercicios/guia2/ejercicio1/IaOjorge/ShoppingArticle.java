package IaOjorge;

public class ShoppingArticle {
	String nombre;
	String categoria;
	double precio;
	int unidad;
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
	public int getUnidad() {
		return unidad;
	}
	public void setUnidad(int unidad) {
		this.unidad = unidad;
	}
	public ShoppingArticle(String nombre, String categoria, double precio, int unidad) {
		super();
		this.nombre = nombre;
		this.categoria = categoria;
		this.precio = precio;
		this.unidad = unidad;
	}
	public ShoppingArticle() {
	}
	@Override
	public String toString() {
		return "ShoppingArticle [nombre=" + nombre + ", categoria=" + categoria + ", precio=" + precio + ", unidad="
				+ unidad + "]";
	}
	
}
