package ejercicioHerencia2;
import ejercicio1.Persona;
import ejercicioCuenta.Cuenta;

public class Debito extends Tarjeta{
	private double cuotaAnual;
	
	public Debito(Persona cliente, Cuenta cuenta, long numTarjeta, double cuotaAnual){
		super(cliente,cuenta,numTarjeta);
		this.cuotaAnual=cuotaAnual;
	}
	
	public boolean pagoDebito(double pago){
		if(pago<=cuenta.getSaldo()){
			cuenta.retirar(pago);
			return true;
		}else{
			return false;
		}
	}
	
	public void pagoCuotaAnual(){
		cuenta.retirar(cuotaAnual);
	}
}
