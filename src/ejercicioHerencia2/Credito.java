package ejercicioHerencia2;
import ejercicio1.Persona;
import ejercicioCuenta.Cuenta;
import java.util.Scanner;

public class Credito extends Tarjeta{
	private double limiteCredito;
	private double interes;
	private double creditoAcumulado = 0;
	
	
	public Credito(Persona cliente, Cuenta cuenta, long numTarjeta, double limiteCredito, double interes){
		super(cliente,cuenta,numTarjeta);
		this.limiteCredito=limiteCredito;
		this.interes=interes;
	}
	
	public boolean pagoDebito(double pago){
		if(pago<=cuenta.getSaldo()){
			creditoAcumulado=creditoAcumulado+pago;
			return true;
			//cuenta.retirar(pago);
		}else{
			return false;
		}
	}
	
	public boolean pagoCredito(double pago){
		if(limiteCredito>0){
			creditoAcumulado=creditoAcumulado+pago;
			//cuenta.retirar(pago);
			return true;
		}else{
			return false;
		}
	}
	
	/*public void pagarTarjeta(double pago){
		char opc;
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Quieres realizar el pago a crédito(C) o a débito(D)?:");
		opc=entrada.next().charAt(0);
		
		if(opc=='d' || opc=='D'){
			if(pago<=cuenta.getSaldo()){
				System.out.println("El pago se ha realizado exitosamente");
				creditoAcumulado=creditoAcumulado+pago;
				//cuenta.retirar(pago);
			}else{
				System.out.println("Lo siento, pero no hay suficientes fondos en la cuenta");
			}
		}else{
			if(limiteCredito>0){
				System.out.println("El pago se ha realizado exitosamente");
				creditoAcumulado=creditoAcumulado+pago;
				//cuenta.retirar(pago);
				
			}else{
				System.out.println("Lo siento, pero ha agotado su crédito");
			}
		}
	}*/
	
	public void pagoInteres(){
		cuenta.retirar(creditoAcumulado*interes);
	}

}
