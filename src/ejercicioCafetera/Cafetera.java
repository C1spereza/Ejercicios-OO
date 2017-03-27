package ejercicioCafetera;

public class Cafetera {
	private int _capacidadMaxima;
	private int _cantidadActual;
	
	public Cafetera(){
		_capacidadMaxima=1000;
		_cantidadActual=0;
	}
	
	public Cafetera(int cMaxima){
		_capacidadMaxima=cMaxima;
		_cantidadActual=cMaxima;
	}
	
	public Cafetera(int cMaxima, int cActual){
		_capacidadMaxima=cMaxima;
		_cantidadActual=cActual;
	}
	
	public void servirTaza(int taza){
		if(taza>_cantidadActual){
			_cantidadActual=0;
		}else{
			_cantidadActual=_cantidadActual-taza;
		}
	}
	
	public void vaciarCafetera(){
		_cantidadActual=0;
	}
	
	public void agregarCafe(int cafe){
		if(cafe>_capacidadMaxima-_cantidadActual){
			_cantidadActual=_capacidadMaxima;
		}else{
			_cantidadActual=_cantidadActual+cafe;
		}
	}
	
	public void llenarCafetera(){
		_cantidadActual=_capacidadMaxima;
	}
	
	public int getCActual(){
		return _cantidadActual;
	}

}
