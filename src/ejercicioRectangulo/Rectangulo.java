package ejercicioRectangulo;
import java.util.Scanner;
import miLibreria.Entrada;

public class Rectangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada=new Scanner(System.in);
		Entrada num=new Entrada();
		int a, b, n1, n2, n3, n4, n5, n6, n7, n8, eleccion, base, altura;
		
		System.out.println("Vas a usar la base/altura (1) o los vertices (2)?");
		eleccion=entrada.nextInt();
		if(eleccion==2){
			n1=num.obtenerEntero("Dame la posicion X del vertice inferior izquierda del rectangulo:");
			n2=num.obtenerEntero("Dame la posicion Y del vertice inferior izquierda del rectangulo:");
			n3=num.obtenerEntero("Dame la posicion X del vertice inferior derecha del rectangulo:");
			n4=num.obtenerEntero("Dame la posicion Y del vertice inferior derecha del rectangulo:");
			n5=num.obtenerEntero("Dame la posicion X del vertice superior izquierda del rectangulo:");
			n6=num.obtenerEntero("Dame la posicion Y del vertice superior izquierda del rectangulo:");
			n7=num.obtenerEntero("Dame la posicion X del vertice superior derecha del rectangulo:");
			n8=num.obtenerEntero("Dame la posicion Y del vertice superior derecha del rectangulo:");
			System.out.println("");
			
			Vertice inferiorIzquierda = new Vertice(n1,n2);
			Vertice inferiorDerecha = new Vertice(n3,n4);
			Vertice superiorIzquierda = new Vertice(n5,n6);
			Vertice superiorDerecha = new Vertice(n7,n8);
		
			operaciones Operaciones = new operaciones(superiorIzquierda,superiorDerecha,inferiorIzquierda,inferiorDerecha);
			Operaciones.mostrarRect();
			System.out.println(Operaciones.calcularSuperficie());
		
			System.out.println("Desplazar horizontalmente el rectangulo (Introduce un numero para desplazarlo)");
			Operaciones.desplazarHorizontal(entrada.nextInt());
			Operaciones.mostrarRect();
			System.out.println(Operaciones.calcularSuperficie());
		
			System.out.println("Desplazar verticalmente el rectangulo (Introduce un numero para desplazarlo)");
			Operaciones.desplazarVertical(entrada.nextInt());
			Operaciones.mostrarRect();
			System.out.println(Operaciones.calcularSuperficie());

		}else{
			System.out.println("Dame la base del rectangulo: ");
			base = entrada.nextInt();
			System.out.println("Dame la altura del rectangulo: ");
			altura = entrada.nextInt();
			
			operaciones Operaciones = new operaciones(base, altura);
			
			Operaciones.mostrarRect();
			System.out.println(Operaciones.calcularSuperficie());
			
			System.out.println("Desplazar horizontalmente el rectangulo (Introduce un numero para desplazarlo)");
			Operaciones.desplazarHorizontal(entrada.nextInt());
			Operaciones.mostrarRect();
			System.out.println(Operaciones.calcularSuperficie());
		
			System.out.println("Desplazar verticalmente el rectangulo (Introduce un numero para desplazarlo)");
			Operaciones.desplazarVertical(entrada.nextInt());
			Operaciones.mostrarRect();
			System.out.println(Operaciones.calcularSuperficie());
		}

	}
}
