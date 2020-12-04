package ec.edu.ups.controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ec.edu.ups.modelo.CompraCabecera;

import java.util.List;

/**
 * Servlet implementation class listarCompras
 */
@WebServlet("/listarCompras")
public class listarCompras extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private List<CompraCabecera> compras;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public listarCompras() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url;
		System.out.println("Entra para listar");
		try {
			String cedula = (String) request.getParameter("cedula");
			//System.out.println(cedula);
			
			int persona=-1;
			for(int i=0; i<General.empresa.getListCliente().size(); i++) {
				if(General.empresa.getListCliente().get(i).getCedula().equals(cedula)) {
					persona = i;
					break;
				}
			}
			//System.out.println("Credito actual: " + General.empresa.getListCliente().get(persona).getCredito());
			
			for(int i = 0; i < General.empresa.getListCliente().get(persona).getListCabecera().size(); i++) {
				compras.add(General.empresa.getListCliente().get(persona).getListCabecera().get(i));
			}
			
			request.setAttribute("compras", compras);
			
			//System.out.println("Credito nuevo: " + General.empresa.getListCliente().get(persona).getCredito());
			url = "/JSP/listar_compras.jsp";
		} catch (Exception e) {
			url = "/JSP/menu.jsp";
		}
		getServletContext().getRequestDispatcher(url).forward(request, response);
	}

}