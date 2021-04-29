package ec.edu.ups.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ec.edu.ups.clases.CalculadoraService;

/**
 * Servlet implementation class CalculadoraServlet
 */
@WebServlet("/CalculadoraServlet")
public class CalculadoraServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CalculadoraServlet() {
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
		
		Double n1 = Double.parseDouble(request.getParameter("Numero 1"));
		Double n2 = Double.parseDouble(request.getParameter("Numero 2"));
		String operador = request.getParameter("operador");
		Double resultado = 0.0;
		
		CalculadoraService service = new CalculadoraService();
		
		switch (operador) {
		case ("+"):
			resultado = service.suma(n1, n2);
			break;
		case ("-"):
			resultado = service.resta(n1, n2);
			break;
		case ("*"):
			resultado = service.multiplicacion(n1, n2);
			break;
		case ("/"):
			resultado = service.division(n1, n2);
			break;
		}
		
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Calculadora</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>Calculadora Básica</h1>");
		out.println("<p>Numero 1: " + n1 + "</p>");
		out.println("<p>Numero 2: " + n2 + "</p>");
		out.println("<p>Resultado: " + resultado + "</p>");
		out.println("<p><a href='calculadora.jsp'>Nueva Operación</a></p>");
		out.println("</body>");
		out.println("</html>");
		out.flush();
				
		
	}

}
