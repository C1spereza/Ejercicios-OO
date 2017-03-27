package ejercicioFecha;
import java.util.Scanner;
import miLibreria.Entrada;

public class Fecha {
	Entrada entrada = new Entrada();
	private int dia;
	private int mes;
	private int año;
	
	public Fecha(){
		this.dia=1;
		this.mes=1;
		this.año=1900;
	}
	
	public Fecha(int dia, int mes, int año){
		this.dia=dia;
		this.mes=mes;
		this.año=año;
		
		valida(this.dia, this.mes, this.año);
	}
	
	public void Leer(){
		do{
			dia = entrada.obtenerEntero("Dame el dia:");
			mes = entrada.obtenerEntero("Dame el mes:");
			año = entrada.obtenerEntero("Dame el año:");
			
			valida(dia, mes, año);
			
			if(dia<1 || dia>31 || mes<1 || mes>12 || año<1900 || año>2050){
				System.out.println("Vuelva a introducir los datos, por favor. Al menos uno de ellos es incorrecto");
			}
		}while(dia<1 || dia>31 || mes<1 || mes>12 || año<1900 || año>2050);
	}
	
	public boolean bisiesto(){
		if(año%4 == 0 && (año%100 != 0 || año%400 == 0)){
			return true;
		}else{
			return false;
		}
	}
	
	public int diaMes(int mes){
		boolean a;
		if(mes==2){
			a=bisiesto();
			if(a==true){
				return 29;
			}else{
				return 28;
			}
		}else if(mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12){
			return 31;
		}else{
			return 30;
		}
	}
	
	private void valida(int dia, int mes, int año){
		if(dia<1 || dia>31){
			dia=1;
		}else if(dia>28 && mes==2){
			dia=1;
		}else if(mes<1 || mes>12){
			mes=1;
		}else if(año<1900 || año>2050){
			año=1900;
		}
	}
	
	public String corta(int dia, int mes, int año){
		return "(" + dia + "-" + mes + "-" + año + ")";
	}
	
	public int diasTranscurridos(int dia, int mes, int año){
		int d, m, a, i, j, r, cont, contm, conta, año1;
		d=dia;
		m=mes;
		a=año;
		cont=0;
		contm=0;
		conta=0;
		
		for(i=0; i<=año; i++){
			for(j=0; j<=12 && (i!=año && j!=mes || i==año && j!=mes); j++){
				for(r=0; r<=31; r++){
					cont=cont+1;
				}
				contm=contm+1;
			}
			conta=conta+1;
		}
		año1=año-1900;
		año1=año1/4;
		
		cont=cont-(4*conta)-(2*conta)+(año1);
		
		return cont;
		
	}

}
