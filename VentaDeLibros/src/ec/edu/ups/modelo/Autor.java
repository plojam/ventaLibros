package ec.edu.ups.modelo;

public class Autor extends Persona {
	
	private String alias;
	
	public Autor(int id, String nombre , String apellido, String alias) {
		this.setId(id);
		this.setNombre(nombre);
		this.setApellido(apellido);
		this.setAlias(alias);
	}

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}
	
	
	
}
