package ejercicioCuenta;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner (System.in);
		Cuenta cuenta;
		int opc;
		long dni;
		double saldo, interes;
		boolean loop=true;
		
		System.out.println("Desea crear una cuenta con datos vacios (1) o desea introducirlos (2)?:");
		opc=entrada.nextInt();
		cuenta=new Cuenta();
		
		switch(opc){
			case 1:
				cuenta=new Cuenta();
				System.out.println("La cuenta ha sido creada, los datos son:");
				System.out.println(cuenta.toString());
				break;
			
			case 2:
				System.out.println("Introduzca su DNI (sin letra):");
				dni=entrada.nextLong();
				System.out.println("Introduzca su saldo:");
				saldo=entrada.nextDouble();
				System.out.println("Introduzca el interes anual:");
				interes=entrada.nextDouble();
				cuenta=new Cuenta(dni,saldo,interes);
				System.out.println("");
				System.out.println("");
				System.out.println("La cuenta ha sido creada, los datos son:");
				System.out.println("");
				System.out.println(cuenta.toString());
				break;
			
		}
		System.out.println("");
		System.out.println("");
		cuenta.actualizarSaldo();
		System.out.println("El saldo actualizado es:" + cuenta.getSaldo());
		System.out.println("");
		
		System.out.println("Introduzca la cantidad de dinero que desea ingresar:");
		cuenta.ingresar(entrada.nextDouble());
		System.out.println("El saldo actualizado es:" + cuenta.getSaldo());
		System.out.println("");
		
		System.out.println("Introduzca la cantidad de dinero que desea retirar:");
		cuenta.retirar(entrada.nextDouble());
		System.out.println("El saldo actualizado es:" + cuenta.getSaldo());
		

		
	}

}
