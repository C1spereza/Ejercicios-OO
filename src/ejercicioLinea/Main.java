package ejercicioLinea;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a1,a2,b1,b2;
		Scanner entrada = new Scanner(System.in);
		Vertice a;
		Vertice b;
		Linea linea;
		
		System.out.println("Dame la posición X del punto A");
		a1=entrada.nextDouble();
		System.out.println("Dame la posición Y del punto A");
		a2=entrada.nextDouble();
		System.out.println("Dame la posición X del punto B");
		b1=entrada.nextDouble();
		System.out.println("Dame la posición Y del punto B");
		b2=entrada.nextDouble();
		
		a = new Vertice(a1,a2);
		b = new Vertice(b1,b2);
		
		linea = new Linea(a,b);
		
		System.out.println(linea.toString());
		
		System.out.println("Dame un numero para desplazar la linea a la derecha:");
		linea.mueveDerecha(entrada.nextDouble());
		System.out.println(linea.toString());
		System.out.println("Dame un numero para desplazar la linea a la izquierda:");
		linea.mueveIzquierda(entrada.nextDouble());
		System.out.println(linea.toString());
		System.out.println("Dame un numero para desplazar la linea hacia arriba:");
		linea.mueveArriba(entrada.nextDouble());
		System.out.println(linea.toString());
		System.out.println("Dame un numero para desplazar la linea hacia abajo:");
		linea.mueveAbajo(entrada.nextDouble());
		System.out.println(linea.toString());

	}

}
