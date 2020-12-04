package ec.edu.ups.modelo;

public class Fisico extends Libro {
	
	
	public Fisico(int id, String titulo, Autor autor, String edicion, float precio) {
		this.setId(id);
		this.setTitulo(titulo);
		this.addAutor(autor);
		this.setEdicion(edicion);
		this.setPrecio(precio);
	}
	
	public float calcularComision() {
		float comision = (float) (this.getPrecio()*0.02);
		return comision;
	}
	
	
	public float calculatEnvio() {
		return 20;
	}
	
	
	
}
