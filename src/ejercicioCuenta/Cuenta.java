package ejercicioCuenta;

public class Cuenta {
	protected static long Cuentas = 1;
	private long dni;
	private double saldoActual;
	private double interesAnual;
	private long numeroCuenta;
	
	public Cuenta(){
		this.dni=00000000;
		this.saldoActual=0;
		this.interesAnual=0;
		this.numeroCuenta=10000 + Cuentas++;
		
	}
	
	public Cuenta(long dni, double saldoActual, double interesAnual){
		this.dni=dni;
		this.numeroCuenta=Cuentas++;
		this.saldoActual=saldoActual;
		this.interesAnual=interesAnual;
	}
	
	public void actualizarSaldo(){
		this.saldoActual=this.saldoActual+(((interesAnual*saldoActual)/100)/365);
	}
	
	public void ingresar(double moni){
		this.saldoActual = this.saldoActual+moni;
	}
	
	public void retirar(double moni){
		if(this.saldoActual>0)
			this.saldoActual = this.saldoActual-moni;
		else
			System.out.println("Eres pobre, te jodes y trabajas, puto vago");
	}
	
	public String toString(){
		return "Nº Cuenta:\t" + this.numeroCuenta + "\n"
				+ "DNI:\t\t" + this.dni + "\n"
				+ "Saldo Actual:\t" + this.saldoActual + "\n"
				+ "Interes Anual:\t" + this.interesAnual + "%";
	}
	
	public double getSaldo(){
		return this.saldoActual;
	}

}
