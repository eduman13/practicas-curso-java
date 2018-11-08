package es.indra.carrito.beans;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Cliente {

	private String nombre;
	private String apellidos;
	private String direccion;
	private String telefono;
	private List<Compra> comprasRealizadas = new ArrayList<Compra>();

	public Cliente() {

	}

	public Cliente(String nombre, String apellidos, String direccion, String telefono) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.direccion = direccion;
		this.telefono = telefono;
	}

	public void recorrerComprasRealizadas() {
		for (Compra compra : comprasRealizadas) {
			System.out.println(compra.getProducto().getNombre());
		}
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public void registrarEnEmpresa(Empresa empresa, Cliente cliente) {
		empresa.setClientesEmpresa(cliente);
		empresa.setListaClienteCompra(cliente, comprasRealizadas);
	}

	public void buscarProducto(String nombre, Empresa empresa) {
		for (Producto producto : empresa.getListaProductos()) {
			if (producto.getNombre().equals(nombre)) {
				System.out.println("Nombre: " + producto.getNombre() + " Descripcion: " + producto.getDescripción()
						+ " Precio: " + producto.getPrecio() + "€" + " Cantidad: " + producto.getStock());
			}
		}
	}

	public boolean comprar(Empresa empresa, Cliente cliente, Producto producto, int cantidad) {
		JFrame parent = new JFrame();
		if (!empresa.getClientesEmpresa().contains(cliente)) {
			JOptionPane.showMessageDialog(parent,
					"No estas Registrado " + cliente.getNombre() + " " + cliente.getApellidos());
			return false;
		} else if (producto.getStock() <= cantidad) {
			System.out.println("No hay suficiente stock");
			return false;
		} else {
			producto.setStock(producto.getStock() - cantidad);
			Compra compra = new Compra("08/11/2018", producto);
			comprasRealizadas.add(compra);
			// System.out.println("Producto Restante: " + producto.getStock());
			return true;
		}

	}

}
