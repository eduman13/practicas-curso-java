package es.indra.carrito.beans;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Empresa {

	private String nombre;
	private List<Cliente> clientesEmpresa = new ArrayList<Cliente>();
	private Map<Cliente, List<Compra>> listaClienteCompra = new HashMap<Cliente, List<Compra>>();
	private List<Producto> listaProductos = new ArrayList<Producto>();

	public Empresa() {

	}

	public void recorrerClientesEmpresa() {
		for(Cliente cliente: clientesEmpresa) {
			System.out.println(cliente.getNombre());
		}
	}
	
	public void recorrerListaClienteCompra() {
		Iterator<Cliente> it = listaClienteCompra.keySet().iterator();
		List<Compra> listaAuxiliar = new ArrayList<Compra>();
		while(it.hasNext()){
		  Cliente key = it.next();
		  listaAuxiliar = listaClienteCompra.get(key);
		  System.out.println(key.getNombre());
		  for(Compra compra: listaAuxiliar) {
			  System.out.println(compra.getProducto().getNombre());
		  }
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

	public void incrementarStock(Producto producto, int cantidad) {
		producto.setStock(producto.getStock() + cantidad);
		
	}

	public void decrementarStock(Producto producto, int cantidad) {
		if (producto.getStock() <= cantidad) {
			System.out.println("No hay suficiente stock, Tenemos:" + producto.getStock() + " de " + 
		producto.getNombre());
		} else {
			producto.setStock(producto.getStock() - cantidad);
		}
	}

}
