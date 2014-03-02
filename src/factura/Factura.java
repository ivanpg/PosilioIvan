package factura;

import java.util.Arrays;

/**
 * Clase para crear una factura y mostrar los diferentes campos que la componen.
 * @version 1.0, 02/03/2014
 * @author Ivan Posilio
 */
public class Factura {
	
	/**
	 * Identificador (codigo) del cliente.
	 */
	public String id_cliente;		
	/**
	 * Nombre del cliente.
	 */
	public String nombre_cliente;	 	
	/**
	 * Lista de productos comprados.
	 * @see LineaFactura.
	 */
	public LineaFactura lineas[];	
		
	/**
	 * Constructor de la Factura.
	 * @param idCliente Identificador del cliente al que se le dirige la factura.
	 * @param nombreCliente Nombre del cliente al que se le dirige la factura.
	 * @param lineas Lista de productos comprados que apareceran en la factura.
	 */
	public Factura(String idCliente, String nombreCliente, LineaFactura[] lineas) {
		super();
		id_cliente = idCliente;
		nombre_cliente = nombreCliente;
		this.lineas = lineas;
	}

	
	/**
	 * Método para obtener el precio total de la factura.
	 * @return Precio total de la Factura, calculado a partir del precio de cada linea.	
	 */
	public float getTotal(){
		float precio = 0;
		for (int i = 0; i < this.lineas.length; i++ ){
			precio += this.lineas[i].getTotal();
		}
		return precio;
	}
	
	
	/**
	 * Método que devuelve la representación de la factura en forma de cadena.
	 * @see java.lang.Object#toString()
	 * @return Cadena que representa la factura.
	 */
	@Override
	public String toString() {
		return "Factura [" 
		+ "id_cliente=" + id_cliente 		 
		+ ", nombre_cliente=" + nombre_cliente 
		+ ", getTotal()=" + getTotal()
		+ ", lineas=" + Arrays.toString(lineas)
		+ "]";
	}


	/**
	 * Método principal (punto de entrada) para comprobar la funcionalidad de la clase.
	 * @param args
	 */
	public static void main(String[] args){
		
		/**
		 * Crear una factura y sus diferentes lineas
		 */
		LineaFactura[] lineas = new LineaFactura[]{
				new LineaFactura("P100", "Leche",	0.85f, 	6, 	0 ),
				new LineaFactura("P200", "Pan",		0.60f, 	1, 	0 ),
				new LineaFactura("P150", "Tomate",	0.85f, 	2, 	0 ),
				new LineaFactura("P600", "Cafe",		1.2f, 	1, 	0 )
			};														
		Factura factura1 = new Factura( "C100",  "Antonio Garcia", lineas);
		
		/**
		 *  Escribir la factura
		 */
		System.out.println( factura1 );
		
	}	
	
}
