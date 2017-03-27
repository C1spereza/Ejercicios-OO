package ejercicioEmpleado;
import miLibreria.Entrada;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Entrada entrada = new Entrada ();
		Empleado empleado = new Empleado();
		Scanner entrada1 = new Scanner (System.in);
		
		double sueldoBase, pagoHoraExtra;
		long dni;
		boolean casado;
		int hijos, horasExtra;
		char opc, opcion;
		
		System.out.println("Dame el DNI del empleado/a (sin letra):");
		dni=entrada1.nextLong();
		System.out.println("¿Esta casado/a el empleado/a? (S/N):");
		opc=entrada1.next().charAt(0);
		if(opc=='S' || opc=='s'){
			casado=true;
		}else{
			casado=false;
		}
		hijos=entrada.obtenerEntero("Nº de hijos del empleado/a:");
		System.out.println("Sueldo base del empleado/a:");
		sueldoBase=entrada1.nextDouble();
		horasExtra=entrada.obtenerEntero("Nº de horas extra que ha realizado el empleado/a:");
		System.out.println("Pago de la hora extra:");
		pagoHoraExtra=entrada1.nextDouble();
		empleado=new Empleado(dni, sueldoBase, pagoHoraExtra, horasExtra, casado, hijos);
		
		System.out.println("Desea ver la informacion basica del empleado/a o toda la informacion (B/T):");
		opcion=entrada1.next().charAt(0);
		System.out.println("");
		System.out.println("");
		System.out.println("");
		if(opcion=='B' || opcion=='b'){
			System.out.println(empleado.informacionBasica());
		}else{
			System.out.println(empleado.informacionTotal());
		}

	}

}
