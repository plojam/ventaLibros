package ec.edu.ups.modelo;

import java.util.ArrayList;
import java.util.List;

import javax.swing.event.ListDataEvent;

public class Empresa {
	private List<Digital> listDigital = new ArrayList<Digital>();
	private List<Fisico> listFisico= new ArrayList<Fisico>();
	private List<Autor> listAutor = new ArrayList<Autor>();
	private List<Cliente> listCliente = new ArrayList<Cliente>();
	
	public Empresa() {
		setearAutores();
		setearClientes();
		setearDigital();
		setearFisico();
	}
	
	public void setearAutores() {
		Autor a1 = new Autor(1,"Vicent","VanPablo","El Loco"); 
		Autor a2 = new Autor(2,"Leonardo","Dicaprio","Rovincci");
		Autor a3 = new Autor(3,"Vladimir","Putin","Kalashnikov");
		listAutor.add(a1);
		listAutor.add(a2);
		listAutor.add(a3);
	}
	
	public void setearClientes() {
		Cliente cli1=new Cliente(1, "Carlos", "AlberTuCarita", "0123456985", "La loma", 100);
		Cliente cli2=new Cliente(2, "Pablo", "Estebanquito", "0102365482", "Baños", 200);
		Cliente cli3=new Cliente(3, "Florencio", "Bautiso", "01025634872", "Paute", 150);
		Cliente cli4=new Cliente(4, "Robbyn", "Tauromakia", "0102531475", "Zamborondon", 300);
		listCliente.add(cli1);
		listCliente.add(cli2);
		listCliente.add(cli3);
		listCliente.add(cli4);
	}
	
	public void setearDigital() {
		Digital dig1=new Digital(1, "La Noche Empablada", this.listAutor.get(0), "III", 30);
		Digital dig2=new Digital(2, "El Levantado", this.listAutor.get(1), "II", (float) 23.33);
		Digital dig3=new Digital(3, "El pescador de osos", this.listAutor.get(2), "I", 60);
		listDigital.add(dig1);
		listDigital.add(dig2);
		listDigital.add(dig3);
	}
	
	public void setearFisico() {
		Fisico fis1=new Fisico(1, "La Noche Empablada", this.listAutor.get(0), "III", 35);
		Fisico fis2=new Fisico(2, "El Levantado", this.listAutor.get(1), "II", (float) 26.66);
		Fisico fis3=new Fisico(3, "El pescador de osos", this.listAutor.get(2), "I", 100);
		listFisico.add(fis1);
		listFisico.add(fis2);
		listFisico.add(fis3);
	}
	
	public List<Digital> getListDigital() {
		return listDigital;
	}
	public void setListDigital(List<Digital> listDigital) {
		this.listDigital = listDigital;
	}
	public List<Fisico> getListFisico() {
		return listFisico;
	}
	public void setListFisico(List<Fisico> listFisico) {
		this.listFisico = listFisico;
	}
	public List<Autor> getListAutor() {
		return listAutor;
	}
	public void setListAutor(List<Autor> listAutor) {
		this.listAutor = listAutor;
	}
	public List<Cliente> getListCliente() {
		return listCliente;
	}
	public void setListCliente(List<Cliente> listCliente) {
		this.listCliente = listCliente;
	}
	
	
	
}
