package ec.edu.ups.modelo;

import java.util.ArrayList;

public class CompraDetalle {
	
	private int id;
	private int cantidad;
	private float subtotal;
	private Digital digital;
	private Fisico fisico;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public Digital getDigital() {
		return digital;
	}
	
	public void setDigital(Digital digital) {
		this.digital = digital;
	}
	
	public Fisico getFisico() {
		return fisico;
	}
	
	public void setFisico(Fisico fisico) {
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
