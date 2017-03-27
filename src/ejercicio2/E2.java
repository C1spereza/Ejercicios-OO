package ejercicio2;
import java.util.Scanner;

public class E2 {
	public static void main(String[] arg){
		Scanner entrada=new Scanner(System.in);
		Password[] contraseñas;
		int i, longitud;
		boolean fuerte;
	
		System.out.println("De que tamaño quieres el vector de Passwords?:");
		contraseñas=new Password[entrada.nextInt()];
		
		for(i=0; i<contraseñas.length; i++){
			System.out.println("De que longitud quieres el vector numero " + i);
			contraseñas[i]= new Password(entrada.nextInt());
		}
		
		System.out.println("Nº\tFortaleza\tContraseña");
		System.out.println("---------------------------------------------");
		
		for(i=0; i<contraseñas.length; i++){
			System.out.println(i+1 + "\t" + contraseñas[i].esFuerte() + "\t\t" + contraseñas[i].getContraseña());
		}
	}
}