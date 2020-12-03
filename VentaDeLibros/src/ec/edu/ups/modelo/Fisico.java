package ec.edu.ups.modelo;

public class Fisico extends Libro {
	
	
	
	public float calcularComision() {
		float comision = (float) (this.getPrecio()*0.02);
		return comision;
	}
	
	
	public float calculatEnvio() {
		return 20;
	}
	
	
	
}
