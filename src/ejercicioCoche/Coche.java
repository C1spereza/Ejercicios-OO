package ejercicioCoche;

public class Coche {
	private Motor motor;
	private Rueda delizq;
	private Rueda delder;
	private Rueda traizq;
	private Rueda trader;
	private Puerta puerder;
	private Puerta puerizq;
	private Ventana vender;
	private Ventana venizq;
	
	public Coche(){
		motor.apagarMotor();
		delizq.inflarRueda();
		delder.inflarRueda();
		trader.inflarRueda();
		traizq.inflarRueda();
		puerder.cerrarPuerta();
		puerizq.cerrarPuerta();
		vender.cerrarVentana();
		venizq.cerrarVentana();
	}
	
	public void arrancarCoche(){
		motor.encenderMotor();
		delizq.inflarRueda();
		delder.inflarRueda();
		trader.inflarRueda();
		traizq.inflarRueda();
		puerder.cerrarPuerta();
		puerizq.cerrarPuerta();
		vender.cerrarVentana();
		venizq.abrirVentana();
	}
	
	public void aparcarCoche(){
		motor.apagarMotor();
		delizq.inflarRueda();
		delder.inflarRueda();
		trader.inflarRueda();
		traizq.inflarRueda();
		puerder.cerrarPuerta();
		puerizq.cerrarPuerta();
		vender.cerrarVentana();
		venizq.cerrarVentana();
	}

}
