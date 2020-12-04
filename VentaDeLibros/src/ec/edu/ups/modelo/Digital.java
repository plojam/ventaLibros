package ec.edu.ups.modelo;

import java.util.List;

public class Digital extends Libro {
	
	public Digital(int id, String titulo, Autor autor, String edicion, float precio) {
		this.setId(id);
		this.setTitulo(titulo);
		this.addAutor(autor);
		this.setEdicion(edicion);
		this.setPrecio(precio);
	}
	
	public float calcularComision() {
		return 3;
	}
	
	
	public float calculatEnvio() {
		return 0;
	}

}
