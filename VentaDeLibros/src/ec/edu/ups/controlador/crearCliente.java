package ec.edu.ups.controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
		try {
			//String idEmp=request.getParameter("idEmp");
			
			//Usuario usu= usuDao.validarU(idEmp, url2);
			
			
			//request.setAttribute("usu", usu);
			url = "/JSP/FormularioClientes.jsp";
		}catch(Exception e) {
			url = "/JSP/NadaqueVerAqui.jsp";
		}
		
		getServletContext().getRequestDispatcher(url).forward(request, response);
		
		
		
	}

}
