package ec.edu.ups.modelo;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends Persona {
	
	private String cedula;
	private String direccion;
	private float credito;
	private List<CompraCabecera> listCabecera= new ArrayList<CompraCabecera>();
	
	public Cliente(int id, String nombre, String apellido, String cedula, String direccion, float credito) {
		this.setId(id);
		this.setNombre(nombre);
		this.setApellido(apellido);
		this.setCedula(cedula);
		this.setDireccion(direccion);
		this.setCredito(credito);
	}
	
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
	
	public List<CompraCabecera> getListCabecera() {
		return listCabecera;
	}
	
	public void setListCabecera(List<CompraCabecera> listCabecera) {
		this.listCabecera = listCabecera;
	}
	
	public void addCabecera(CompraCabecera cabecera) {
		this.listCabecera.add(cabecera);
	}

	public float getCredito() {
		return credito;
	}

	public void setCredito(float credito) {
		this.credito = credito;
	}
	
	
	
}
