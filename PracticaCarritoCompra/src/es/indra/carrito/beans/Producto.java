package es.indra.carrito.beans;

public class Producto {

	public enum Categoría {
		ALIMENTACION, PERFUMERIA, LIMPIEZA
	}

	private String nombre;
	private String descripción;
	private Categoría categoria;
	private double precio;
	private int stock;

	public Producto() {

	}

	public Producto(String nombre, String descripción, Categoría categoria, double precio, int stock) {
		super();
		this.nombre = nombre;
		this.descripción = descripción;
		this.categoria = categoria;
		this.precio = precio;
		this.stock = stock;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripción() {
		return descripción;
	}

	public void setDescripción(String descripción) {
		this.descripción = descripción;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public Categoría getCategoria() {
		return categoria;
	}

}
