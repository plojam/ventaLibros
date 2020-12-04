package ec.edu.ups.controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ec.edu.ups.modelo.Empresa;

/**
 * Servlet implementation class modificarCredito
 */
@WebServlet("/agregarCredito")
public class agregarCredito extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public agregarCredito() {
        super();
        // TODO Auto-generated constructor stub
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
		System.out.println("llega aqui");
		try {
			String cedula = (String) request.getParameter("cedula");
			//System.out.println(cedula);
			float credito = Float.valueOf((String) request.getParameter("creditos"));
			//System.out.println(cedula + "/" + credito);
			int persona=-1;
			for(int i=0; i<General.empresa.getListCliente().size(); i++) {
				if(General.empresa.getListCliente().get(i).getCedula().equals(cedula)) {
					persona = i;
					break;
				}
			}
			//System.out.println("Credito actual: " + General.empresa.getListCliente().get(persona).getCredito());
			float nuevo = General.empresa.getListCliente().get(persona).getCredito() + credito;
			General.empresa.getListCliente().get(persona).setCredito(nuevo);
			//System.out.println("Credito nuevo: " + General.empresa.getListCliente().get(persona).getCredito());
			url = "/JSP/menu.jsp";
		} catch (Exception e) {
			url = "/JSP/menu.jsp";
		}
		getServletContext().getRequestDispatcher(url).forward(request, response);
	}

}
