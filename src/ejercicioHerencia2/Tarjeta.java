package ejercicioHerencia2;
import ejercicio1.Persona;
import ejercicioCuenta.Cuenta;


public abstract class Tarjeta {
	protected static long nTarjeta = 1;
	private Persona cliente;
	protected Cuenta cuenta;
	private long numTarjeta;
	
	public Tarjeta(){		
	}
	
	
	public Tarjeta(Persona cliente, Cuenta cuenta, long numTarjeta){
		this.cliente=cliente;
		this.cuenta=cuenta;
		this.numTarjeta=10000000 + nTarjeta;
	}
	
	public void setCliente(Persona cliente){
		this.cliente=cliente;
	}
	
	public void setCuenta(Cuenta cuenta){
		this.cuenta=cuenta;
	}
	
	public Persona getCliente(){
		return this.cliente;
	}
	
	public Cuenta getCuenta(){
		return this.cuenta;
	}

}
