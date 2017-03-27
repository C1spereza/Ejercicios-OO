package ejercicioNumImaginarios;

public class operaciones {
	private int numreal1, numreal2, num;
	private int numero, numimag, numero2, numimag2, div1, div2;
	private int imag1, imag2;
	
	
	public operaciones(){
		this.numreal1=0;
		this.numreal2=0;
		this.imag1=0;
		this.imag2=0;
	}
	
	public operaciones(int numreal1, int numreal2, int imag1, int imag2){
		this.numreal1=numreal1;
		this.numreal2=numreal2;
		this.imag1=imag1;
		this.imag2=imag2;
	}
	
	public void setNumreal1(int numreal1){
		this.numreal1=numreal1;
	}
	
	public void setNumreal2(int numreal2){
		this.numreal2=numreal2;
	}
	
	public void setImag1(int imag1){
		this.imag1=imag1;
	}
	
	public void setImag2(int imag2){
		this.imag2=imag2;
	}
	
	public int getNumreal1(){
		return numreal1;
	}
	
	public int getNumreal2(){
		return numreal2;
	}
	
	public int getImag1(){
		return imag1;
	}
	
	public int getImag2(){
		return imag2;
	}
	
	
	public void Suma(){
		numero=this.numreal1+this.numreal2;
		numimag=this.imag1+this.imag2;
		if(numimag>=0){
			System.out.println("El resultado de la suma es: " + numero + "+" + numimag + "i");
		}else{
			System.out.println("El resultado de la suma es: " + numero + numimag + "i");
		}
	}
	
	public void Resta(){
		numero=this.numreal1-this.numreal2;
		numimag=this.imag1-this.imag2;
		if(numimag>=0){
			System.out.println("El resultado de la resta es: " + numero + "+" + numimag + "i");
		}else{
			System.out.println("El resultado de la resta es: " + numero + numimag + "i");
		}
	}
	
	public void Multiplicacion(){
		numero=this.numreal1*this.numreal2;
		numero2=this.numreal1*this.imag2;
		numimag=this.imag1*this.numreal2;
		numimag2=this.imag1*this.imag2;
		
		numimag2=(-numimag2);
		numero=numero+numimag2;
		numimag=numimag+numero2;
		
		if(numimag>=0){
			System.out.println("El resultado de la multiplicacion es: " + numero + "+" + numimag + "i");
		}else{
			System.out.println("El resultado de la multiplicacion es: " + numero + numimag + "i");
		}
	}
	
	public void Division(){
		numero=(this.numreal1*this.numreal2)+(this.imag1*this.imag2);
		numero2=(this.imag1*this.numreal2)-(this.numreal1*this.imag2);
		
		
		div1=this.numreal2*this.numreal2;
		div2=this.imag2*this.imag2;
		div1=div1+div2;
		
		System.out.println("El resultado de la division es: " + "(" + numero + "/" + div1 + ")" + "+(" + numero2 + "/" + div1 + ")" + "i");
	}
}
