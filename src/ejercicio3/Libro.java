package ejercicio3;

public class Libro {
	private String autor;
	private String titulo;
	private int numEjemplares;
	private int numPrestados;
	
	public Libro(){
		this.autor="";
		this.titulo="";
		this.numEjemplares=0;
		this.numPrestados=0;
		
	}
	
	public Libro(String autor, String titulo, int numEjemplares, int numPrestados){
		this.autor=autor;
		this.titulo=titulo;
		this.numEjemplares=numEjemplares;
		this.numPrestados=numPrestados;
	}
	
	public void setAutor(String autor){
		this.autor=autor;
	}
	
	public void setTitulo(String titulo){
		this.titulo=titulo;
	}
	
	public void setNumEjemplares(int numEjemplares){
		this.numEjemplares=numEjemplares;
	}
	
	public void setNumPrestados(int numPrestados){
		this.numPrestados=numPrestados;
	}
	
	public String getAutor(){
		return autor;
	}
	
	public String getTitulo(){
		return titulo;
	}
	
	public int getNumEjemplares(){
		return numEjemplares;
	}
	
	public int getNumPrestados(){
		return numPrestados;
	}
	
	public boolean prestamo(){
		if(this.numPrestados<this.numEjemplares){
			numPrestados++;
			return true;
		}else{
			return false;
		}
	}
	
	public boolean devolucion(){
		if(this.numPrestados>0){
			numPrestados--;
			return true;
		}else{
			return false;
		}
	}
	
	public String toString(){
		return "Autor: " + autor + "\n" + "Titulo: " + titulo + "\n" + "Numero de ejemplares: " + numEjemplares + "\n" + "Numero de ejemplares prestados: " + numPrestados + "\n";
	}

}
