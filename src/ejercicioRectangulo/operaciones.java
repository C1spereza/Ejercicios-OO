package ejercicioRectangulo;

public class operaciones {
	private Vertice inferiorIzquierda;
	private Vertice inferiorDerecha;
	private Vertice superiorIzquierda;
	private Vertice superiorDerecha;
	
	public operaciones(int base, int altura){
		this.inferiorIzquierda = new Vertice (0,0);
		this.inferiorDerecha = new Vertice (base,0);
		this.superiorIzquierda = new Vertice (0,altura);
		this.superiorDerecha = new Vertice (base,altura);
	}
	
	public operaciones(Vertice superiorIzquierda, Vertice superiorDerecha, Vertice inferiorDerecha, Vertice inferiorIzquierda){
		this.superiorIzquierda=superiorIzquierda;
		this.superiorDerecha=superiorDerecha;
		this.inferiorDerecha=inferiorDerecha;
		this.inferiorIzquierda=inferiorIzquierda;
	}
	
	public boolean comprobarRect(){
		if(superiorIzquierda.getY() == inferiorIzquierda.getY() && superiorDerecha.getY() == inferiorDerecha.getY() && superiorDerecha.getX() == superiorIzquierda.getX() && inferiorIzquierda.getX() == inferiorDerecha.getX()){
			return true;
		}else{
			return false;
		}
	}
	
	public void mostrarRect(){
		if(comprobarRect()){
			System.out.println("Se ha podido crear un rectangulo con los vertices proporcionados");
			System.out.println(superiorIzquierda.toString());System.out.println(superiorDerecha.toString());
			System.out.println(inferiorIzquierda.toString());System.out.println(inferiorDerecha.toString());
		}else{
			System.out.println("No se ha podido crear un rectangulo con los vertices proporcionados");
		}
	}
	
	public void desplazarHorizontal(int num){
		if(num<0){
			superiorIzquierda.setY(superiorIzquierda.getY()-(-num));
			superiorDerecha.setY(superiorDerecha.getY()-(-num));
			inferiorIzquierda.setY(inferiorIzquierda.getY()-(-num));
			inferiorDerecha.setY(inferiorDerecha.getY()-(-num));
		}else{
			superiorIzquierda.setY(superiorIzquierda.getY()+num);
			superiorDerecha.setY(superiorDerecha.getY()+num);
			inferiorIzquierda.setY(inferiorIzquierda.getY()+num);
			inferiorDerecha.setY(inferiorDerecha.getY()+num);
		}
	}
	
	public void desplazarVertical(int num){
		if(num<0){
			superiorIzquierda.setX(superiorIzquierda.getX()-(-num));
			superiorDerecha.setX(superiorDerecha.getX()-(-num));
			inferiorIzquierda.setX(inferiorIzquierda.getX()-(-num));
			inferiorDerecha.setX(inferiorDerecha.getX()-(-num));
		}else{
			superiorIzquierda.setX(superiorIzquierda.getX()+num);
			superiorDerecha.setX(superiorDerecha.getX()+num);
			inferiorIzquierda.setX(inferiorIzquierda.getX()+num);
			inferiorDerecha.setX(inferiorDerecha.getX()+num);
		}
	}
	
	public String calcularSuperficie(){
		return "La superficie del rectangulo es: " + superiorDerecha.getX()*superiorDerecha.getY();
	}

}
