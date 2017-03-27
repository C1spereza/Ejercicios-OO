package ejercicioRacionales;

public class opraciones {
	private int num1, num2, num3, num4;
	private int resnum, resden;
	
	public opraciones(){
		this.num1=0;
		this.num2=0;
		this.num3=0;
		this.num4=0;
	}
	
	public opraciones(int num1, int num2, int num3, int num4){
		this.num1=num1;
		this.num2=num2;
		this.num3=num3;
		this.num4=num4;
	}
	
	public void setNum1(int num1){
		this.num1=num1;
	}
	
	public void setNum2(int num2){
		this.num2=num2;
	}
	
	public void setNum3(int num3){
		this.num3=num3;
	}
	
	public void setNum4(int num4){
		this.num4=num4;
	}
	
	public int getNum1(){
		return num1;
	}
	
	public int getNum2(){
		return num2;
	}
	
	public int getNum3(){
		return num3;
	}
	
	public int getNum4(){
		return num4;
	}
	
	public void Suma(){
		if(num2!=num4){
			resden=this.num2*this.num4;
			resnum=(this.num1*this.num4)+(this.num3*this.num2);
		}else{
			resden=this.num2;
			resnum=this.num1+this.num3;
		}
		if(resden!=0){
			System.out.println("El resultado de la suma es: " + resnum + "/" + resden);
		}else{
			System.out.println("Por lo menos un denominador es 0, por lo que el resultado es erróneo.");
		}
	}
	
	public void Resta(){
		if(num2!=num4){
			resden=this.num2*this.num4;
			resnum=(this.num1*this.num4)-(this.num3*this.num2);
		}else{
			resden=this.num2;
			resnum=this.num1-this.num3;
		}
		if(resden!=0){
			System.out.println("El resultado de la resta es: " + resnum + "/" + resden);
		}else{
			System.out.println("Por lo menos un denominador es 0, por lo que el resultado es erróneo.");
		}
	}
	
	public void Multiplicacion(){
		resnum=this.num1*this.num3;
		resden=this.num2*this.num4;
		
		if(resden!=0){
			System.out.println("El resultado de la multiplicacion es: " + resnum + "/" + resden);
		}else{
			System.out.println("Por lo menos un denominador es 0, por lo que el resultado es erróneo.");
		}
	}
	
	public void Division(){
		resnum=this.num1*this.num4;
		resden=this.num2*this.num3;
		
		if(resden!=0){
			System.out.println("El resultado de la division es: " + resnum + "/" + resden);
		}else{
			System.out.println("Por lo menos un denominador es 0, por lo que el resultado es erróneo.");
		}
	}


}
