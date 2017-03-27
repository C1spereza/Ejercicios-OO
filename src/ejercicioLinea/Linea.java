package ejercicioLinea;

public class Linea {
	private Vertice _puntoA;
	private Vertice _puntoB;
	
	public Linea(){
		this._puntoA=new Vertice(0,0);
		this._puntoB=new Vertice(0,0);
	}
	
	public Linea(Vertice a, Vertice b){
		this._puntoA=new Vertice(a.getX(),a.getY());
		this._puntoB=new Vertice(b.getX(),b.getY());
	}
	
	public void mueveDerecha(double num){
		_puntoA.setX(_puntoA.getX()+num);
		_puntoB.setX(_puntoB.getX()+num);
	}
	
	public void mueveIzquierda(double num){
		_puntoA.setX(_puntoA.getX()-num);
		_puntoB.setX(_puntoB.getX()-num);
	}
	
	public void mueveArriba(double num){
		_puntoA.setY(_puntoA.getY()+num);
		_puntoB.setY(_puntoB.getY()+num);
	}
	
	public void mueveAbajo(double num){
		_puntoA.setY(_puntoA.getY()-num);
		_puntoB.setY(_puntoB.getY()-num);
	}
	
	public String toString(){
		return "[(" + _puntoA.getX() + "," + _puntoA.getY() + "),(" + _puntoB.getX() + "," + _puntoB.getY() + ")]";
	}
}
