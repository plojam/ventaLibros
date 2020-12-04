package ec.edu.ups.modelo;

import java.util.ArrayList;

public abstract class Libro {
	
	private int id;
	private String titulo;
	private ArrayList<Autor> aurotes = new ArrayList<Autor>();
	private String edicion;
	private float precio;
	
	public float calcularPrecioFinal() {
		float total = precio + calcularComision() + calculatEnvio();
		return total;
	}
	
	public abstract float calcularComision();
	
	public abstract float calculatEnvio();
	
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public ArrayList<Autor> getAurotes() {
		return aurotes;
	}
	
	public void setAurotes(ArrayList<Autor> aurotes) {
		this.aurotes = aurotes;
	}
	
	public void addAutor(Autor autor) {
		this.aurotes.add(autor);
	}
	
	public String getEdicion() {
		return edicion;
	}
	
	public void setEdicion(String edicion) {
		this.edicion = edicion;
	}
	
	public float getPrecio() {
		return precio;
	}
	
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	
	
	
	
	
	
	
}
