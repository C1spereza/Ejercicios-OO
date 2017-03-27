package ejercicioCoche;

public class Motor {
	private boolean motor;
	
	public void encenderMotor(){
		motor=true;
	}
	
	public void apagarMotor(){
		motor=false;
	}
	
	public boolean getMotor(){
		return motor;
	}

}
