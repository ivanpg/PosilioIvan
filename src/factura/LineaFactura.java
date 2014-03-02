package factura;

/**
 * Clase para crear y mostrar una linea de la factura. La linea se refiere a un tipo de producto comprado.
 * @version 1.0, 02/03/2014
 * @author Ivan Posilio
 */
public class LineaFactura {
		
	/**
	 * identificador (codigo) del producto.
	 */
	public String id_producto; 		
	/**
	 * Nombre del producto.
	 */
	public String nombre_producto; 	
	/**
	 * Precio por una unidad del producto.
	 */
	public float precio; 	
	/**
	 * Cantidad de unidades compradas.
	 */
	public float cantidad; 	
	/**
	 * Descuento de la unidad (no se esta utilizando).
	 */
	public float descuento; 	
	
	
	/**
	 * Constructor de la clase.
	 * @param idProducto Identificador del producto comprado.
	 * @param nombreProducto Nombre del producto comprado.
	 * @param precio Precio del producto comprado.
	 * @param cantidad Cantidad de productos del mismo tipo comprados.
	 * @param descuento Descuento aplicado a cada unidad de producto (no se ha utilizado).
	 */
	public LineaFactura(String idProducto, String nombreProducto, float precio,
			float cantidad, float descuento) {
		super();
		id_producto = idProducto;
		nombre_producto = nombreProducto;
		this.precio = precio;
		this.cantidad = cantidad;
		this.descuento = descuento;
	}
	
	/**
	 * Método que devuelve la representación de una linea de la factura en forma de cadena. La linea se refiere
	 * a un tipo de producto comprado. 
	 * @see java.lang.Object#toString()
	 * @return Cadena que representa la linea de la factura.
	 */
	@Override
	public String toString() {
		return "\n\tLineaFactura ["  				 				 
				+ "id_producto=" + id_producto
				+ ", nombre_producto=" + nombre_producto				
				+ ", precio=" + precio
				+ ", cantidad=" + cantidad
				+ ", descuento=" + descuento
				+ "]";
	}
	
	
	/**
	 * Devulve el precio total de una linea en la factura.  Es el resultado del precio de la unidad por la cantidad de productos 
	 * pedidos de esa unidad.
	 * @return Precio total de una linea.
	 */
	public float getTotal(){
		float total = this.precio * this.cantidad;
		return total;
	}

}
