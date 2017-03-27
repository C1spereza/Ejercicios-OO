package ejercicioHerencia;
import ejercicio1.Persona;

public class Factura extends Precio{
	private Persona cliente;
	private Persona emisor;
	Precio precio = new Precio();
	
	public Factura(Persona cliente, Persona emisor, Precio precio){
		this.cliente=cliente;
		this.emisor=emisor;
		this.precio=precio;
	}
	
	public void setEmisor(Persona emisor){
		this.emisor=emisor;
	}
	
	public void setCliente(Persona cliente){
		this.cliente=cliente;
	}
	
	public void setPrecio(Precio precio){
		this.precio=precio;
	}
	
	public Persona getEmisor(){
		return this.emisor;
	}
	
	public Persona getCliente(){
		return this.cliente;
	}
	
	
	public String imprimirFactura(){
		return "Datos de la factura:" + "\n" +
				"---------------------" + "\n" +
				"Emisor:" + "\n" +
				"---------------------" + "\n" +
				emisor.toString() + "\n" +
				"\n" + "Cliente:" + "\n" +
				"---------------------" + "\n" +
				cliente.toString() + "\n" +
				"\n" + "Precio Final:" + "\n" +
				"---------------------" + "\n" +
				precio.getPrecio() + "€";
	}

}
