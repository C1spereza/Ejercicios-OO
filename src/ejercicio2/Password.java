package ejercicio2;

public class Password {
	private final static int DEFAULT_LONG=10;
	
	private final static int SECURE_PASSWD_MAYS=2;
	private final static int SECURE_PASSWD_MINUS=1;
	private final static int SECURE_PASSWD_NUM=4;
	
	private String contraseña;
	private int longitud;
	
	
	
	public Password(){
		longitud = DEFAULT_LONG;
		contraseña = generarPassword();
		
	}
	
	public Password(int lon){
		longitud=lon;
		contraseña=generarPassword();
	}

	public String generarPassword(){
		int i, aleatorio;
		String cont="";
		String letra="";
		
		for(i=0; i<longitud; i++){
			aleatorio=(int)(Math.random()*3);
			if(aleatorio==0){
				letra=Character.toString((char)(Math.random()*25+97));
				cont=cont+letra;
			}else if(aleatorio==1){
				letra=String.valueOf((char)(Math.random()*10+'0'));
				cont=cont+letra;
			}else{
				letra=Character.toString((char)(Math.random()*25+65));
				cont=cont+letra;
			}
			
		}
		this.contraseña=cont;
		
		return this.contraseña;
		
	}
	
	public String toString(){
		return this.contraseña;
	}
	
	
	public boolean esFuerte(){
		int numeros, i, mayusculas, minusculas;
		numeros=0;
		mayusculas=0;
		minusculas=0;
		
		for(i=0; i<this.contraseña.length(); i++){
			if(this.contraseña.charAt(i)>='a' && this.contraseña.charAt(i)<='z'){
				minusculas++;
			}
			if(this.contraseña.charAt(i)>='A' && this.contraseña.charAt(i)<='Z'){
				mayusculas++;
			}
			if(this.contraseña.charAt(i)>='0' && this.contraseña.charAt(i)<='9'){
				numeros++;
			}
		}
		
		if(numeros>SECURE_PASSWD_NUM && SECURE_PASSWD_MINUS<minusculas && SECURE_PASSWD_MAYS<mayusculas){
			return true;
		}else{
			return false;
		}
	}
	
	public int getLongitud(){
		return longitud;
	}
	
	public String getContraseña(){
		return contraseña;
	}
	
	public void setLongitud(int longitud){
		this.longitud=longitud;
	}
}
