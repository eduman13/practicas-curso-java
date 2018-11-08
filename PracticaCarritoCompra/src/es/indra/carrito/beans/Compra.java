package es.indra.carrito.beans;

public class Compra {

	private String fecha;
	private Producto producto;

	public Compra() {

	}

	public Compra(String fecha, Producto producto) {
		super();
		this.fecha = fecha;
		this.producto = producto;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

}
