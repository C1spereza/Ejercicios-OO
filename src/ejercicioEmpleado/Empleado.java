package ejercicioEmpleado;

public class Empleado {
	private long dni;
	private double sueldoBase;
	private double pagoHoraExtra;
	private int horasExtra;
	protected int tipoIRPF = 20;
	private boolean casado;
	private int hijos;
	
	public Empleado(){
		dni=00000000;
		sueldoBase=0;
		pagoHoraExtra=0;
		horasExtra=0;
		casado=false;
		hijos=0;
	}
	
	public Empleado(long dni, double sueldoBase, double pagoHoraExtra, int horasExtra, boolean casado, int hijos){
		this.dni=dni;
		this.sueldoBase=sueldoBase;
		this.pagoHoraExtra=pagoHoraExtra;
		this.horasExtra=horasExtra;
		this.casado=casado;
		this.hijos=hijos;
	}
	
	public double sueldoExtra(){
		double sueldoExtra;
		
		sueldoExtra=pagoHoraExtra*horasExtra;
		
		return sueldoExtra;
	}
	
	public double sueldoBruto(){
		double sueldoExtra, sueldoBruto;
		
		sueldoExtra=sueldoExtra();
		sueldoBruto=sueldoExtra+sueldoBase;
		
		return sueldoBruto;
	}
	
	public double retencion(){
		int i;
		double sueldoBruto, retencion;
		
		if(casado==true){
			tipoIRPF=tipoIRPF-2;
		}
		tipoIRPF=tipoIRPF-hijos;
		sueldoBruto=sueldoBruto();
		retencion=tipoIRPF*sueldoBruto/100;
		
		return retencion;
	}
	
	public double sueldoNeto(double retencion){
		double sueldoBruto, sueldoNeto;
		
		sueldoBruto=sueldoBruto();
		sueldoNeto=sueldoBruto-retencion;
		
		return sueldoNeto;
	}
	
	public void setdni(long dni){
		this.dni=dni;
	}
	
	public void setsueldoBase(double sueldoBase){
		this.sueldoBase=sueldoBase;
	}
	
	public void setpagoHoraExtra(double pagoHoraExtra){
		this.pagoHoraExtra=pagoHoraExtra;
	}
	
	public void sethorasExtra(int horasExtra){
		this.horasExtra=horasExtra;
	}
	
	public void setcasado(boolean casado){
		this.casado=casado;
	}
	
	public void sethijos(int hijos){
		this.hijos=hijos;
	}
	
	public long getdni(){
		return this.dni;
	}
	
	public double getsueldoBase(){
		return this.sueldoBase;
	}
	
	public double getpagoHoraExtra(){
		return this.pagoHoraExtra;
	}
	
	public int gethorasExtra(){
		return this.horasExtra;
	}
	
	public boolean getcasado(){
		return this.casado;
	}
	
	public int gethijos(){
		return this.hijos;
	}
	
	public String informacionBasica(){
		String a;
		if(this.casado==true){
			a="Si";
			
			return "Datos Basicos del Empleado" + "\n" +
					"-----------------------------------------" + "\n" +
					"DNI: " + "\t\t" + this.dni + "\n" +
					"Casado: " + "\t" + a + "\n" + 
					"Nº de hijos: " + "\t" + this.hijos;
		}else{
			a="No";
			
			return "Datos Basicos del Empleado" + "\n" +
			"-----------------------------------------" + "\n" +
			"DNI: " + "\t\t" + this.dni + "\n" +
			"Casado: " + "\t" + a + "\n" + 
			"Nº de hijos: " + "\t" + this.hijos;
		}
	}
	
	public String informacionTotal(){
		String a;
		int b;
		if(this.casado==true){
			a="Si";
			b=20-this.hijos-2;
			
			return "Datos del Empleado" + "\n" +
			"-----------------------------------------" + "\n" +
			"DNI: " + "\t\t\t" + this.dni + "\n" +
			"Casado: " + "\t\t" + a + "\n" + 
			"Nº de hijos: " + "\t\t" + this.hijos + "\n" +
			"Sueldo Base: " + "\t\t" + this.sueldoBase + "€" + "\n" +
			"Complemento extra: " + "\t" + this.sueldoExtra() + "€" + "\n" + 
			"Sueldo Bruto: " + "\t\t" + this.sueldoBruto() + "€" + "\n" +
			"Tipo retencion IRPF: " + "\t" + b + "%" + "\n" +
			"Retencion IRPF: " + "\t" + this.retencion() + "€" + "\n" +
			"Sueldo Neto: " + "\t\t" + this.sueldoNeto(this.retencion()) + "€";
			
		}else{
			a="No";
			b=20-this.hijos;
			
			return "Datos del Empleado" + "\n" +
			"-----------------------------------------" + "\n" +
			"DNI: " + "\t\t\t" + this.dni + "\n" +
			"Casado: " + "\t\t" + a + "\n" + 
			"Nº de hijos: " + "\t\t" + this.hijos + "\n" +
			"Sueldo Base: " + "\t\t" + this.sueldoBase + "€" + "\n" +
			"Complemento extra: " + "\t" + this.sueldoExtra() + "€" + "\n" + 
			"Sueldo Bruto: " + "\t\t" + this.sueldoBruto() + "€" + "\n" +
			"Tipo retencion IRPF: " + "\t" + b + "%" + "\n" +
			"Retencion IRPF: " + "\t" + this.retencion() + "€" + "\n" +
			"Sueldo Neto: " + "\t\t" + this.sueldoNeto(this.retencion()) + "€";
		}
	}

}
