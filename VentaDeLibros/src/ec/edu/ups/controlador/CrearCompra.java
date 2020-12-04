package ec.edu.ups.controlador;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ec.edu.ups.modelo.CompraCabecera;
import ec.edu.ups.modelo.CompraDetalle;
import ec.edu.ups.modelo.Digital;
import ec.edu.ups.modelo.Fisico;

/**
 * Servlet implementation class ControladorGeneral
 */
@WebServlet("/CrearCompra")
public class CrearCompra extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CrearCompra() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url=null;
		int op=Integer.parseInt(request.getParameter("op"));
		String listaF=request.getParameter("comFisico");
		String listaD=request.getParameter("comDigi");
		String cedula=request.getParameter("cedula");
		if(op==1) {
			request.setAttribute("empresa", General.empresa);
			url="/realizarPedidos.jsp";
		}
		else if(op==2){
			List<CompraDetalle> lisDet=new ArrayList<CompraDetalle>();
			String [] infoFisico=listaF.split(";");
			String [] infoDigital=listaD.split(";");
			System.out.println("tam1: "+General.empresa.getListFisico().size());
			System.out.println("tam2: "+infoDigital.length);
			int conDet=General.contadorDet;
			int conCab=General.contadorCab;
			float total=0;
			for(int i=1;i<infoFisico.length;i++) {
				String [] aux=infoFisico[i].split(",");
				Fisico lFisico=General.empresa.getListFisico().get(Integer.parseInt(aux[0])-1);
				float subtotal=Integer.parseInt(aux[1])*lFisico.calcularPrecioFinal();
				total=total+subtotal;
				CompraDetalle comDet = new CompraDetalle();
				comDet.setId(General.contadorDet=General.contadorDet+1);
				comDet.setCantidad(Integer.parseInt(aux[1]));
				comDet.setSubtotal(subtotal);
				comDet.setFisico(General.empresa.getListFisico().get(Integer.parseInt(aux[0])-1));
				comDet.setDigital(null);
				lisDet.add(comDet);
			}
			for(int i=1;i<infoDigital.length;i++) {
				String [] aux=infoDigital[i].split(",");
				Digital lDigital=General.empresa.getListDigital().get(Integer.parseInt(aux[0])-1);
				float subtotal=Integer.parseInt(aux[1])*lDigital.calcularPrecioFinal();
				total=total+subtotal;
				CompraDetalle comDet = new CompraDetalle();
				comDet.setId(General.contadorDet=General.contadorDet+1);
				comDet.setCantidad(Integer.parseInt(aux[1]));
				comDet.setSubtotal(subtotal);
				comDet.setDigital(General.empresa.getListDigital().get(Integer.parseInt(aux[0])-1));
				comDet.setFisico(null);
				lisDet.add(comDet);
			}
			CompraCabecera compCab=new CompraCabecera();
			compCab.setId(General.contadorCab=General.contadorCab+1);
			compCab.setCompraDetalles(lisDet);
			compCab.setTotal(total);
			for(int i=0; i<General.empresa.getListCliente().size(); i++) {
				if(General.empresa.getListCliente().get(i).getCedula().equals(cedula)) {
					if(General.empresa.getListCliente().get(i).getCredito()>=total) {
						float credA=General.empresa.getListCliente().get(i).getCredito();
						General.empresa.getListCliente().get(i).setCredito(credA-total);;
						General.empresa.getListCliente().get(i).addCabecera(compCab);
					}
					else {
						General.contadorCab=conCab;
						General.contadorDet=conDet;
					}
					break;
				}
			}
			request.setAttribute("empresa", General.empresa);
			url="/realizarPedidos.jsp";
		}
		getServletContext().getRequestDispatcher(url).forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
