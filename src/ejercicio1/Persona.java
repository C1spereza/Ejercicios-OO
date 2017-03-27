package ejercicio1;

public class Persona {
	private String 	nombre;
	private int 	edad;
	private String 	DNI;
	private float 	altura;
	private String 	sexo;	//H hombre ; M mujer
	private float 	peso;
	
	public Persona(){
		this.nombre="";
		this.edad=0;
		this.altura=0;
		this.sexo="H";
		this.peso=0;
		this.DNI=generaDNI();
	}
	
	public Persona(String nom, String sexo, int edad){
		this.nombre=nom;
		this.sexo=sexo;
		this.edad=edad;
		this.altura=0;
		this.peso=0;
		this.DNI=generaDNI();
	}
	
	public Persona(String nom, String sexo, int edad, float alt, float peso, int DNI){
		this.nombre=nom;
		this.sexo=sexo;
		this.edad=edad;
		this.altura=alt;
		this.peso=peso;
		this.DNI=String.valueOf(DNI) + "-" + generaLetra(DNI);
	}
	
	public int calcularIMC(){
		
		if(this.peso/(this.altura*this.altura) <= 18.5){
			 return -1;
		 }else if(this.peso/(this.altura*this.altura) > 18.5 && this.peso/(this.altura*this.altura) <=25){
			 return 0;
		 }else
			 return 1;
	}
	
	public boolean esMayorDeEdad(){
		if(this.edad>=18){
			return true;
		}else{
			return false;
		}
	}
	
	public boolean comprobarSexo(String sexo){
		if (this.sexo=="H" || this.sexo=="M" || this.sexo=="h" || this.sexo=="h"){
			return true;
		}else{
			this.sexo="H";
			return false;
		}
	}
	
	public String toString(){
		return "Nombre: " + this.nombre + "\n" + "Edad: " + this.edad + "\n" + "DNI: " + this.DNI + "\n" + "Sexo: " + this.sexo + "\n" + "Altura: " + this.altura + "\n" + "Peso: " + this.peso;
	}

	public String generaDNI(){
		String DNI;
		int dniInt;
		
		dniInt=(int)(Math.random()*(99999999-11111111)+11111111);
		DNI=Integer.toString(dniInt);
		
		char[] letras={'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
		
		return DNI + "-" + letras[dniInt%23];
	}
	
	private char generaLetra(int DNI){
		char[] letras={'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
		
		return letras[DNI%23];
	}
	
	public void setNombre(String nombre){
		this.nombre=nombre;
	}
	
	public void setEdad(int edad){
		this.edad=edad;
	}
	
	public void setSexo(String sexo){
		this.sexo=sexo;
	}
	
	public void setAltura(float altura){
		this.altura=altura;
	}
	
	public void setPeso(float peso){
		this.peso=peso;
	}
}
