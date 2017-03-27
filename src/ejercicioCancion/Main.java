package ejercicioCancion;
import java.util.Scanner;
import miLibreria.Entrada;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Entrada entrada = new Entrada();
		Scanner entrada2 = new Scanner(System.in);
		String autor, titulo;
		char opcion;
		int opc;
		
		titulo=entrada.obtenerString("Dame el titulo de la cancion:");
		
		autor=entrada.obtenerString("Dame el autor/a de la cancion:");
		
		Cancion cancion = new Cancion(titulo, autor);
		
		System.out.println("Datos de la cancion:");
		System.out.println("-----------------------------------------");
		System.out.println("Titulo: " + cancion.getTitulo());
		System.out.println("Autor/a: " + cancion.getAutor());
		System.out.println("");
		System.out.println("Quieres cambiar el titulo o el autor de la cancion? (S o N)");
		opcion= entrada2.next().charAt(0);
		System.out.println("");
		
		if(opcion=='S' || opcion=='s'){
			System.out.println("Quieres cambiar el titulo (1) o el autor (2)?");
			opc=entrada2.nextInt();
			
			switch(opc){
				case 1:
					titulo=entrada.obtenerString("Dame el nuevo titulo de la cancion:");
					cancion.setTitulo(titulo);
					System.out.println("");
					System.out.println("");
					System.out.println("Datos actualizados de la cancion:");
					System.out.println("-----------------------------------------");
					System.out.println("Titulo: " + cancion.getTitulo());
					System.out.println("Autor/a: " + cancion.getAutor());
					
					break;
				
				case 2:
					autor=entrada.obtenerString("Dame el nuevo autor/a de la cancion:");
					cancion.setAutor(autor);
					System.out.println("");
					System.out.println("");
					System.out.println("Datos actualizados de la cancion:");
					System.out.println("-----------------------------------------");
					System.out.println("Titulo: " + cancion.getTitulo());
					System.out.println("Autor/a: " + cancion.getAutor());
			}
		}else{
			System.out.println("Pueh nah, enga, ta lué");
		}
		
		

	}

}
