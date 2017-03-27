package ejercicio3;
import java.util.Scanner;

public class E3 {
	
	public static void main (String [] arg){
		String libro, autor;
		char pos, pos1;
		boolean prestamo, devolver;
		int prestados, ejemplares;
		Scanner entrada= new Scanner(System.in);
		
		
		System.out.println("Nombre del libro:");
		libro=entrada.next();
		System.out.println("Nombre del autor:");
		autor=entrada.next();
		System.out.println("Numero de ejemplares disponibles:");
		ejemplares=entrada.nextInt();
		System.out.println("Numero de ejemplares prestados:");
		prestados=entrada.nextInt();
		Libro book=new Libro(autor, libro, ejemplares, prestados);
		System.out.println(book.toString());
		
		System.out.println("¿Desea coger prestado el libro? (s/n)");
		pos=entrada.next().charAt(0);
		if(pos=='s'){
			prestamo=book.prestamo();
			if(prestamo==true){
				System.out.println("De acuerdo, hemos recibido su solicitud. En breve dispondrá del libro " + libro + ".");
				
			}else{
				System.out.println("Lamentablemente, todos los ejemplares del libro " + libro + " estan prestados. Vuelva a intentarlo mañana. Disculpe las molestias.");
				
			}
			
		}else{
			System.out.println("Pos oc.");
		}
		
		System.out.println(book.toString());
		
		
		System.out.println("¿Desea devolver el libro? (s/n)");
		pos1=entrada.next().charAt(0);
		if(pos1=='s'){
			devolver=book.devolucion();
			if(devolver==true){
				System.out.println("Gracias por solicitar nuestros servicios. Eres el puto amo, y lo sabes ^_^");
				
			}else{
				System.out.println("No puedes devolver el libro porque o no tenemos ejemplares prestados, o no disponemos directamente del libro");
				
			}
			
		}else{
			System.out.println("Pues como tengas un ejemplar, y no lo devuelvas dentro del plazo, enviaremos un par de sicarios a que te partean las piernas.");
		}
		
		System.out.println(book.toString());

	}
	
	

}
