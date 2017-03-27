package ejercicioCafetera;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		int opc, capacidadMaxima, capacidadActual;
		boolean loop=true;
		
		System.out.println("Quieres una cafetera llena (1) o quieres llenarla tu (2)?");
		opc=entrada.nextInt();
		
		switch(opc){
			case 1:
				System.out.println("Dame la máxima cantidad de la cafetera:");
				Cafetera cafetera = new Cafetera(entrada.nextInt());
				
				System.out.println("Cuanta cantidad de café quieres en la taza?:");
				cafetera.servirTaza(entrada.nextInt());
				System.out.println("Quedan " + cafetera.getCActual() + " ml de café en la cafetera.");
				
				System.out.println("Vaciando la cafetera, espere unos instantes.");
				cafetera.vaciarCafetera();
				System.out.println("Quedan " + cafetera.getCActual() + " ml de café en la cafetera.");
				
				System.out.println("Con cuantos ml quieres rellenar la cafetera?");
				cafetera.agregarCafe(entrada.nextInt());
				System.out.println("Quedan " + cafetera.getCActual() + " ml de café en la cafetera.");
				
				System.out.println("Llenando a full la cafetera. Espere por favor.");
				cafetera.llenarCafetera();
				System.out.println("Quedan " + cafetera.getCActual() + " ml de café en la cafetera.");
				loop=false;
				
				break;
			case 2:
				System.out.println("Dame la máxima cantidad de la cafetera:");
				capacidadMaxima=entrada.nextInt();
				System.out.println("Dame la cantidad actual de la cafetera:");
				capacidadActual=entrada.nextInt();
				
				Cafetera cafetera1 = new Cafetera(capacidadMaxima,capacidadActual);
				
				System.out.println("Cuanta cantidad de café quieres en la taza?:");
				cafetera1.servirTaza(entrada.nextInt());
				System.out.println("Quedan " + cafetera1.getCActual() + " ml de café en la cafetera.");
				
				System.out.println("Vaciando la cafetera, espere unos instantes.");
				cafetera1.vaciarCafetera();
				System.out.println("Quedan " + cafetera1.getCActual() + " ml de café en la cafetera.");
				
				System.out.println("Con cuantos ml quieres rellenar la cafetera?");
				cafetera1.agregarCafe(entrada.nextInt());
				System.out.println("Quedan " + cafetera1.getCActual() + " ml de café en la cafetera.");
				
				System.out.println("Llenando a full la cafetera. Espere por favor.");
				cafetera1.llenarCafetera();
				System.out.println("Quedan " + cafetera1.getCActual() + " ml de café en la cafetera.");
				loop=false;
				
				break;
		}

	}

}
