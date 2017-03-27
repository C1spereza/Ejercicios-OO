package ejercicioNumImaginarios;
import java.util.Scanner;

public class numImaginarios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada=new Scanner(System.in);
		int a, b;
		int imag1, imag2;
		
		System.out.println("Dame el primer numero real");
		a=entrada.nextInt();
		System.out.println("Dame el primer numero imaginario");
		imag1=entrada.nextInt();
		System.out.println("Dame el segundo numero real");
		b=entrada.nextInt();
		System.out.println("Dame el segundo numero imaginario");
		imag2=entrada.nextInt();
		
		operaciones operacion=new operaciones(a, b, imag1, imag2);
		System.out.println("");
		operacion.Suma();
		operacion.Resta();
		operacion.Multiplicacion();
		operacion.Division();
		

	}

}
