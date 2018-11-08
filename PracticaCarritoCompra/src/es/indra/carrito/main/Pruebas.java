package es.indra.carrito.main;

import es.indra.carrito.beans.Cliente;
import es.indra.carrito.beans.Empresa;
import es.indra.carrito.beans.Producto;

public class Pruebas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Producto producto1 = new Producto("Tomate", "Rojo", 1.00, 500);
		Producto producto2 = new Producto("Naranjas", "Naranja", 1.00, 500);
		Producto producto3 = new Producto("Manzanas", "Golden", 1.01, 500);
		Producto producto4 = new Producto("Pepino", "ToGuapo", 1.00, 500);
		Producto producto5 = new Producto("Zanahoria", "Para conojeos", 1.00, 500);
		Empresa empresa1 = new Empresa("Mercadona");
		empresa1.setListaProductos(producto1);
		empresa1.setListaProductos(producto2);
		empresa1.setListaProductos(producto3);
		empresa1.setListaProductos(producto4);
		empresa1.setListaProductos(producto5);
		Cliente cliente1 = new Cliente("Tomas", "Garcia", "Calle falsa 123", "66666666");
		Cliente cliente2 = new Cliente("Andres", "Garcia", "Calle falsa 123", "66666666");
		Cliente cliente3 = new Cliente("Jose", "Garcia", "Calle falsa 123", "66666666");
		cliente2.buscarProducto("Manzanas", empresa1);
		//cliente1.buscarProducto("Manzanas", empresa1);
//		cliente1.comprar(empresa1, cliente1, producto1, 20);
//		cliente1.comprar(empresa1, cliente1, producto2, 20);
//		cliente1.comprar(empresa1, cliente1, producto3, 20);
//		cliente1.comprar(empresa1, cliente1, producto4, 20);
//		cliente1.comprar(empresa1, cliente1, producto1, 20);
		cliente1.registrarEnEmpresa(empresa1, cliente1);
		cliente2.registrarEnEmpresa(empresa1, cliente2);
		cliente3.registrarEnEmpresa(empresa1, cliente3);
		//empresa1.recorrerClientesEmpresa();
		//cliente1.recorrerComprasRealizadas();
		cliente2.comprar(empresa1, cliente2, producto3, 56);
		//empresa1.recorrerListaClienteCompra();
		cliente3.comprar(empresa1, cliente3, producto4, 89);
		//empresa1.recorrerListaClienteCompra();

		
		
		
	}

}
