package ec.edu.ups.modelo;

import java.util.ArrayList;

public class Cliente extends Persona {
	
	private String cedula;
	private String direccion;
	private ArrayList<CompraCabecera> listCabecera;
	
	
	public String getCedula() {
		return cedula;
	}
	
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	
	public String getDireccion() {
		return direccion;
	}
	
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	public ArrayList<CompraCabecera> getListCabecera() {
		return listCabecera;
	}
	
	public void setListCabecera(ArrayList<CompraCabecera> listCabecera) {
		this.listCabecera = listCabecera;
	}
	
	public void addCabecera(CompraCabecera cabecera) {
		this.listCabecera.add(cabecera);
	}
	
	
}
