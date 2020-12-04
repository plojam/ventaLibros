package ec.edu.ups.jdbc;


public abstract class JDBCGeneric<T, ID> {

	protected ContextJDBC sql = ContextJDBC.getJDBC();

	public abstract void create(T entity);

	public abstract void read(ID id);

	public abstract void update(T entity);

	public abstract void delete(T entity);


}