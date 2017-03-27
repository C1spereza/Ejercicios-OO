package ejercicio1;
import java.util.Scanner;

public class E1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner entrada = new Scanner(System.in);
		 String nombre, sexo;
		 int edad, dni;
		 float altura, peso;
		 
		 System.out.println("Dame el nombre de la persona:");
		 nombre=entrada.next();
		 
		 System.out.println("Dame la edad de " + nombre + ":");
		 edad=entrada.nextInt();
		 
		 System.out.println("Dame el sexo de " + nombre + ":");
		 sexo=entrada.next();
		 
		 System.out.println("Dame el peso de " + nombre + ":");
		 peso=entrada.nextFloat();
		 
		 System.out.println("Dame la altura de " + nombre + ":");
		 altura=entrada.nextFloat();
		 
		 System.out.println("Dame el DNI de " + nombre + "(sólo números):");
		 dni=entrada.nextInt();
		 
		 Persona Persona1 = new Persona(nombre, sexo, edad, altura, peso, dni);
		 Persona Persona2 = new Persona(nombre, sexo, edad);
		 Persona Persona3 = new Persona();
		 
		 Persona3.setNombre("Erikku-dono");
		 Persona3.setEdad(20);
		 Persona3.setSexo("H");
		 Persona3.setAltura(1.67f);
		 Persona3.setPeso(69.5f);
		 
		 if(Persona1.calcularIMC() == -1){
			 System.out.println(nombre + " " + "está por debajo de su peso. Necesita comer...(¿pollas quizá?)\n");
		 }else if(Persona1.calcularIMC() == 0){
			 System.out.println(nombre + " " + "está en su peso ideal. Es el PUTO AMO\n");
		 }else if(Persona1.calcularIMC() == 1){
			 System.out.println(nombre + " " + "tiene sobrepeso. Debería dejar de comer, PUTO GORDO\n");
		 }
		 
		 
		 if(Persona2.calcularIMC() == -1){
			 System.out.println(nombre + " " + "está por debajo de su peso. Necesita comer...(¿pollas quizá?)\n");
		 }else if(Persona2.calcularIMC() == 0){
			 System.out.println(nombre + " " + "está en su peso ideal. Es el PUTO AMO\n");
		 }else if(Persona2.calcularIMC() == 1){
			 System.out.println(nombre + " " + "tiene sobrepeso. Debería dejar de comer, PUTO GORDO\n");
		 }
		 
		 
		 if(Persona3.calcularIMC() == -1){
			 System.out.println("Erikku-dono está por debajo de su peso. Necesita comer...(¿pollas quizá?)\n");
		 }else if(Persona3.calcularIMC() == 0){
			 System.out.println("Erikku-dono está en su peso ideal. Es el PUTO AMO\n");
		 }else if(Persona3.calcularIMC() == 1){
			 System.out.println("Erikku-dono tiene sobrepeso. Debería dejar de comer, PUTO GORDO\n");
		 }
		 
		 if(Persona1.esMayorDeEdad() == true){
			 System.out.println(nombre + " es mayor de edad\n");
		 }else{
			 System.out.println(nombre + " no es mayor de edad\n");
		 }
		 
		 if(Persona2.esMayorDeEdad() == true){
			 System.out.println("Persona2 es mayor de edad\n");
		 }else{
			 System.out.println("Persona2 no es mayor de edad\n");
		 }
		 
		 if(Persona3.esMayorDeEdad() == true){
			 System.out.println("Erikku-dono es mayor de edad\n");
		 }else{
			 System.out.println("Erikku-dono no es mayor de edad\n");
		 }
		 
		 
		 System.out.println(Persona1.toString() + "\n");
		 System.out.println(Persona2.toString() + "\n");
		 System.out.println(Persona3.toString() + "\n");

	}

}
