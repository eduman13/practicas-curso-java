package es.indra.carrito.beans;

public class Producto {

	public enum Categor�a {
		ALIMENTACION, PERFUMERIA, LIMPIEZA
	}

	private String nombre;
	private String descripci�n;
	private Categor�a categoria;
	private double precio;
	private int stock;

	public Producto() {

	}

	public Producto(String nombre, String descripci�n, Categor�a categoria, double precio, int stock) {
		super();
		this.nombre = nombre;
		this.descripci�n = descripci�n;
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

	public String getDescripci�n() {
		return descripci�n;
	}

	public void setDescripci�n(String descripci�n) {
		this.descripci�n = descripci�n;
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

	public Categor�a getCategoria() {
		return categoria;
	}

}
