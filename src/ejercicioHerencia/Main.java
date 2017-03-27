package ejercicioHerencia;
import java.util.Scanner;
import ejercicio1.Persona;
import miLibreria.Entrada;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Entrada entrada = new Entrada();
		Scanner entrada1 = new Scanner (System.in);
		Persona persona = new Persona ();
		
		String nombre, sexo, nombre1, sexo1;
		int edad, edad1;
		Precio precio;
		char opc,opcion;
		boolean loop=true;
		double precio1;
		
		do{
		
		nombre=entrada.obtenerString("Dame el nombre del emisor: ");
		edad=entrada.obtenerEntero("Dame la edad del emisor:");
		sexo=entrada.obtenerString("Dame el sexo del emisor:");
		
		nombre1=entrada.obtenerString("Dame el nombre del cliente: ");
		edad1=entrada.obtenerEntero("Dame la edad del cliente:");
		sexo1=entrada.obtenerString("Dame el sexo del cliente:");
		
		System.out.println("Dame el precio total a pagar:");
		precio=new Precio(entrada1.nextDouble());
		
		Persona emisor = new Persona(nombre, sexo, edad);
		Persona cliente = new Persona(nombre, sexo, edad);
		
		Factura factura = new Factura(emisor, cliente, precio);
		System.out.println(factura.imprimirFactura());
		
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("Es correcta la factura? (S/N)");
		opc=entrada1.next().charAt(0);
		
		if(opc=='s' || opc=='S'){
			loop=false;
		}else{
			System.out.println("Quieres cambiar el precio(P) o empezar la factura de nuevo(N)?");
			opcion=entrada1.next().charAt(0);
			if(opcion=='p' || opcion=='P'){
				System.out.println("Dame el nuevo precio total a pagar:");
				precio1=entrada1.nextDouble();
				
				precio.setPrecio(precio1);
				System.out.println(factura.imprimirFactura());
				loop=false;
			}
		}
		
		}while(loop);
	}

}
