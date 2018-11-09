package es.indra.carrito.main;

import es.indra.carrito.beans.Categoria;
import es.indra.carrito.beans.Cliente;
import es.indra.carrito.beans.Empresa;
import es.indra.carrito.beans.Producto;

public class Pruebas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Producto producto1 = new Producto("Tomate", "Rojo", Producto.Categoría.ALIMENTACION, 1.00, 500);
		Producto producto2 = new Producto("Naranjas", "Naranja", Producto.Categoría.ALIMENTACION, 1.00, 500);
		Producto producto3 = new Producto("Manzanas", "Golden", Producto.Categoría.ALIMENTACION, 1.01, 500);
		Producto producto4 = new Producto("Pepino", "ToGuapo", Producto.Categoría.ALIMENTACION, 1.00, 500);
		Producto producto5 = new Producto("Zanahoria", "Para conojeos", Producto.Categoría.ALIMENTACION, 1.00, 500);
		Empresa empresa1 = new Empresa("Mercadona");
		empresa1.anadirProducto(producto1, producto2, producto3, producto4, producto5);
		Cliente cliente1 = new Cliente("Tomas", "Garcia", "Calle falsa 123", "66666666");
		Cliente cliente2 = new Cliente("Andres", "Garcia", "Calle falsa 123", "66666666");
		Cliente cliente3 = new Cliente("Jose", "Garcia", "Calle falsa 123", "66666666");
		cliente1.registrarEnEmpresa(empresa1);
		empresa1.decrementarStock(producto1, 20);
		empresa1.recorrerListaProductos();
		cliente1.comprar(empresa1, producto1, 9);
		Categoria producto6 = new Categoria();
	

//		cliente2.buscarProducto("Manzanas", empresa1);
//		cliente1.buscarProducto("Manzanas", empresa1);
//		cliente1.comprar(empresa1, cliente1, producto1, 20);
//		cliente1.comprar(empresa1, cliente1, producto2, 20);
//		cliente1.comprar(empresa1, cliente1, producto3, 20);
//		cliente1.comprar(empresa1, cliente1, producto4, 20);
//		cliente1.comprar(empresa1, cliente1, producto1, 20);
//		cliente1.registrarEnEmpresa(empresa1, cliente1);
//		cliente2.registrarEnEmpresa(empresa1, cliente2);
//		cliente3.registrarEnEmpresa(empresa1, cliente3);
//		empresa1.recorrerClientesEmpresa();
//		cliente1.recorrerComprasRealizadas();
//		cliente2.comprar(empresa1, cliente2, producto3, 56);
//		empresa1.recorrerListaClienteCompra();
//		cliente3.comprar(empresa1, cliente3, producto4, 89);
//		empresa1.recorrerListaClienteCompra();

	}

}
