package ejercicioCancion;

public class Cancion {
	private String titulo;
	private String autor;
	
	public Cancion(){
		titulo="";
		autor="";
	}
	
	public Cancion(String titulo, String autor){
		this.titulo=titulo;
		this.autor=autor;
	}
	
	public void setTitulo(String titulo){
		this.titulo=titulo;
	}
	
	public void setAutor(String autor){
		this.autor=autor;
	}
	
	public String getTitulo(){
		return this.titulo;
	}
	
	public String getAutor(){
		return this.autor;
	}

}
