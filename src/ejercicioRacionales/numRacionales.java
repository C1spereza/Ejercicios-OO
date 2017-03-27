package ejercicioRacionales;
import java.util.Scanner;

public class numRacionales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada=new Scanner(System.in);
		int num1, num2, num3, num4;
		
		System.out.println("Dame el primer numerador:");
		num1=entrada.nextInt();
		System.out.println("Dame el primer denominador:");
		num2=entrada.nextInt();
		System.out.println("Dame el segundo numerador:");
		num3=entrada.nextInt();
		System.out.println("Dame el segundo denominador");
		num4=entrada.nextInt();
		
		opraciones operacion=new opraciones(num1, num2, num3, num4);
		System.out.println("");
		operacion.Suma();
		operacion.Resta();
		operacion.Multiplicacion();
		operacion.Division();

	}

}
