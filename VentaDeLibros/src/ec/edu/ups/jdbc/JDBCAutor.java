package ec.edu.ups.jdbc;

import ec.edu.ups.modelo.Autor;

public class JDBCAutor extends JDBCGeneric<Autor, Integer> {

	public void create(Autor autor) {
		sql.update("INSERT autor VALUES (0,'" + autor.getNombre() + "','" + autor.getApellido() + "','" + autor.getAlias() + "')");
	}

	public void read(Integer id) {
		
	}

	public void update(Autor entity) {
	}

	public void delete(Autor entity) {
		// TODO Auto-generated method stub

	}

}