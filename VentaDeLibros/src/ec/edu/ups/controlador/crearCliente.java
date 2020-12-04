package ec.edu.ups.controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import ec.edu.ups.modelo.Cliente;

/**
 * Servlet implementation class crearCliente
 */
@WebServlet("/crearCliente")
public class crearCliente extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public crearCliente() {
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

		
		String url=null;
		
		
		
		String nombre = (String) request.getParameter("nombre");
		String apellido = (String) request.getParameter("apellido");
		String cedula = (String) request.getParameter("cedula");
		String direcion = (String) request.getParameter("direcion");
		int id = Integer.parseInt(request.getParameter("id"));
		float credito = Float.parseFloat(request.getParameter("credito"));
		
		System.out.println(nombre +"|"+ apellido+"|"+ cedula +"|"+ direcion +"|"+ id +"|"+credito);
		
		
		try {
			Cliente e = new Cliente(id, nombre, apellido, cedula, direcion, credito);
			
			General.empresa.getListCliente().add(e);
			
			
			url = "/JSP/menu.jsp";
		}catch(Exception e) {
			url = "/JSP/menu.jsp";
		}
		
		getServletContext().getRequestDispatcher(url).forward(request, response);
		
		
		
	}

}
