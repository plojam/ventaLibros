package ec.edu.ups.modelo;

import java.util.ArrayList;

public class CompraCabecera {
	
	private int id;
	private float total;
	private ArrayList<CompraDetalle> detalles = new ArrayList<CompraDetalle>();
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public ArrayList<CompraDetalle> getDetalles() {
		return detalles;
	}
	
	public void setCompraDetalles(ArrayList<CompraDetalle> detalles) {
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

	public void setDetalles(ArrayList<CompraDetalle> detalles) {
		this.detalles = detalles;
	}
	
	
	
}
