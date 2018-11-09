# Estructura de la Práctica Carrito de la Compra

Proyecto que implementa la práctica Carrito de la Compra

## Paquetes y Clases

El paquete raíz es es.indra.carrito

### .beans

Paquete para las implementaciones de POJOs

*Clases*

* Cliente: POJO que representa el cliente
+ nombre: nombre del cliente
+ apellidos: apellidos del cliente
+ dirección: dirección del cliente
+ telefono: telefono del cliente
+ comprasRealizada: lista que contiene las compras realizadas del cliente
* Compra: POJO que representa una compra
+ fecha: fecha de la compra del producto (se trata como un String)
+ producto: producto que se compra
* Empresa: POJO que representa una empresa
+ nombre: nombre de la empresa
+ clientesEmpresa: lista que contiene todos los clientes que se registran
+ listaClienteCompra: HashMap que contiene como key el cliente y como value una lista de sus 
compras realizadas en la empresa
+ listaProducto: lista que contiene los productos que vende la empresa
* Producto: POJO que representa un producto
+ nombre: nombre del producto
+ descripción: descripción del producto
+ categoría: categoría del producto que puede ser ALIMENTACION, PERFUMERIA o LIMPIEZA
+ precio: precio del producto
+ stock: stock del producto

### .main

*Pruebas: clase para realizar pruebas
