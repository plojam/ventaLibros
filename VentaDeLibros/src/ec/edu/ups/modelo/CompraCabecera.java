package ec.edu.ups.modelo;

import java.util.ArrayList;
import java.util.List;

public class CompraCabecera {
	
	private int id;
	private float total;
	private List<CompraDetalle> detalles = new ArrayList<CompraDetalle>();
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public List<CompraDetalle> getDetalles() {
		return detalles;
	}
	
	public void setCompraDetalles(List<CompraDetalle> detalles) {
		this.detalles = detalles;
	}
	
	public void addCompraDetalle(CompraDetalle detalle) {
		detalles.add(detalle);
	}

	public float getTotal() {
		return total;
	}

	public void setTotal(float total) {
		this.total = total;
	}
	
	
	
}
