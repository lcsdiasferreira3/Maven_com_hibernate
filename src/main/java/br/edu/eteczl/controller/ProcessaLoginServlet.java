package br.edu.eteczl.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ProcessaLoginServlet
 */
public class ProcessaLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**@see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     * 
     */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		processaRequest(request, response);
    }

	/**
	 * 
	 */
	protected void processaRequest(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// TODO Auto-generated method stub
		String uNome = request.getParameter("Usuario");
		String uPass= request.getParameter("Senha");
		
		response.getWriter().append("Servlet recebeu os seguintes parametros na requisição...\n");
		response.getWriter().append(uNome.toString()).append("\n");
		response.getWriter().append(uPass.toString()).append("\n");
		
		if(uNome.equals("admin") && uPass.equals("admin")) {
			response.getWriter().append("Login Realizado com sucesso\n");
			
		}else {
			response.getWriter().append("Login falhou: Usuario ou senha incorretos\n");
		}

		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		processaRequest(request, response);
	}

	
	
	
	
}
