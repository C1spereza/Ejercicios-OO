package ejercicioLinea;

public class Vertice {
	private double x, y;
	
	public Vertice(){
		this.x = 0;
		this.y = 0;
	}
	
	public Vertice(double x, double y){
		this.x=x;
		this.y=y;
	}
	
	public String toString(){
		return "(" + x + "," + y + ")";
	}
	
	public void setX(double x){
		this.x=x;
	}
	
	public void setY(double y){
		this.y=y;
	}
	
	public double getX(){
		return this.x;
	}
	
	public double getY(){
		return this.y;
	}

}
