package ec.edu.ups.modelo;

import java.util.ArrayList;

public class CompraDetalle {
	
	private int id;
	private int cantidad;
	private float subtotal;
	private ArrayList<Digital> digital;
	private ArrayList<Fisico> fisico;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public ArrayList<Digital> getDigital() {
		return digital;
	}
	
	public void setDigital(ArrayList<Digital> digital) {
		this.digital = digital;
	}
	
	public ArrayList<Fisico> getFisico() {
		return fisico;
	}
	
	public void setFisico(ArrayList<Fisico> fisico) {
		this.fisico = fisico;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public float getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(float subtotal) {
		this.subtotal = subtotal;
	}
	
	
	
	
}
