package es.indra.carrito.beans;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Empresa {

	private String nombre;
	private List<Cliente> clientesEmpresa = new ArrayList<Cliente>();
	private Map<Cliente, List<Compra>> listaClienteCompra = new HashMap<Cliente, List<Compra>>();
	private List<Producto> listaProductos = new ArrayList<Producto>();

	public Empresa() {

	}

	/**
	 * Método para recorrer clientesEmpresa
	 */
	public void recorrerClientesEmpresa() {
		for (Cliente cliente : clientesEmpresa) {
			System.out.println(cliente.getNombre());
		}
	}

	/**
	 * Método para recorrer el HashMap listaClienteCompra
	 */
	public void recorrerListaClienteCompra() {
		Iterator<Cliente> it = listaClienteCompra.keySet().iterator();
		List<Compra> listaAuxiliar = new ArrayList<Compra>();
		while (it.hasNext()) {
			Cliente key = it.next();
			listaAuxiliar = listaClienteCompra.get(key);
			System.out.println(key.getNombre());
			for (Compra compra : listaAuxiliar) {
				System.out.println(compra.getProducto().getNombre());
			}
		}
	}

	/**
	 * Método para recorrer ListaProductos
	 */
	public void recorrerListaProductos() {
		for (Producto producto : listaProductos) {
			System.out.println("Nombre Producto: " + producto.getNombre() + " Stock: " + producto.getStock());
		}
	}

	public Empresa(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Cliente> getClientesEmpresa() {
		return clientesEmpresa;
	}

	public Map<Cliente, List<Compra>> getListaClienteCompra() {
		return listaClienteCompra;
	}

	public void setListaClienteCompra(Cliente cliente, List<Compra> comprasRealizadas) {
		listaClienteCompra.put(cliente, comprasRealizadas);
	}

	public List<Producto> getListaProductos() {
		return listaProductos;
	}

	public void setListaProductos(Producto producto) {
		listaProductos.add(producto);
	}

	public void setClientesEmpresa(Cliente cliente) {
		if (clientesEmpresa.isEmpty()) {
			clientesEmpresa.add(cliente);
		} else {
			if (clientesEmpresa.contains(cliente)) {
				System.out.println("El cliente ya se ha registrado");
			} else {
				clientesEmpresa.add(cliente);

			}
		}
	}

	/**
	 * Método para incrementar el stock de un producto
	 * 
	 * @param producto
	 * @param cantidad
	 */
	public void incrementarStock(Producto producto, int cantidad) {
		if (!listaProductos.contains(producto)) {
			System.out.println("No existe el producto");
		} else {
			int posicionProducto = listaProductos.lastIndexOf(producto);
			Producto productoIncrementar = listaProductos.get(posicionProducto);
			productoIncrementar.setStock(productoIncrementar.getStock() + cantidad);
		}
	}

	/**
	 * Método para decrementar el stock de un producto
	 * 
	 * @param producto
	 * @param cantidad
	 */
	public void decrementarStock(Producto producto, int cantidad) {
		if (producto.getStock() < cantidad) {
			System.out
					.println("No hay suficiente stock, Tenemos " + producto.getStock() + " de " + producto.getNombre());
		} else {
			if (!listaProductos.contains(producto)) {
				System.out.println("No existe el producto");
			} else {
				int posicionProducto = listaProductos.lastIndexOf(producto);
				Producto productoIncrementar = listaProductos.get(posicionProducto);
				productoIncrementar.setStock(productoIncrementar.getStock() - cantidad);
			}
		}
	}

	/**
	 * Método para añadir un producto a la lista de productos en venta de la Empresa
	 * 
	 * @param producto
	 */
	public void anadirProducto(Producto... producto) {
		for (int i = 0; i < producto.length; i++) {
			if (!listaProductos.contains(producto[i])) {
				listaProductos.add(producto[i]);
			} else {
				System.out.printf("El producto %s ya esta en venta\n", producto[i].getNombre());
			}
		}
	}
}
